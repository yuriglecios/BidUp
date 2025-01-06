package br.com.bidup.rotina;

import br.com.bidup.ContratosDTO;
import br.com.bidup.ComprasReturn;
import br.com.bidup.RestTemplateConfiguration;
import br.com.bidup.model.Contratos;
import br.com.bidup.repository.ContratosRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceRotinaContrato {
    //log padrão do spring para acompanhar no console
    private final Logger log = LoggerFactory.getLogger(ServiceRotinaContrato.class);

    @Value("${api.base.url}")
    private String baseUrl;

    private final ContratosRepository contratosRepository;
    private final RestTemplateConfiguration restTemplateConfiguration;

    public ServiceRotinaContrato(ContratosRepository contratosRepository, RestTemplateConfiguration restTemplateConfiguration) {
        this.contratosRepository = contratosRepository;
        this.restTemplateConfiguration = restTemplateConfiguration;
    }

    public void executaCarga() throws InterruptedException {

        int paginaAtual = 1;
        Integer paginasRestantes;
        Integer totalPaginas = 0;

        do {
            log.info("Iniciando requisição da página " + paginaAtual);
            Map<String, String> parametros = new HashMap<>();
            parametros.put("pagina", Integer.toString(paginaAtual));
            parametros.put("tamanhoPagina", "500");
            parametros.put("dataPublicacaoPncpInicial", "2022-04-01");
            parametros.put("dataPublicacaoPncpFinal", "2022-12-31");
            parametros.put("codigoModalidade", "6");

            String urlConsulta = UriComponentsBuilder.fromHttpUrl(baseUrl)
                    .queryParam("pagina", parametros.get("pagina"))
                    .queryParam("tamanhoPagina", parametros.get("tamanhoPagina"))
                    .queryParam("dataPublicacaoPncpInicial", parametros.get("dataPublicacaoPncpInicial"))
                    .queryParam("dataPublicacaoPncpFinal", parametros.get("dataPublicacaoPncpFinal"))
                    .queryParam("codigoModalidade", parametros.get("codigoModalidade"))
                    .build().toUriString();

            ComprasReturn compras = restTemplateConfiguration.restTemplate().getForObject(urlConsulta, ComprasReturn.class);
            log.info("Requisição finalizada");
            if (compras != null){
                salva(compras.getResultado());
            }
            paginasRestantes = compras.getPaginasRestantes();
            totalPaginas = compras.getTotalPaginas();
            paginaAtual ++;
            log.info("Restam " + totalPaginas + " páginas");
            Thread.sleep(15000);
        }
        while (paginasRestantes != null && paginasRestantes > 0);
        log.info("Rotina finalizada");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void salva(List<Contratos> contratos){

        contratosRepository.saveAll(contratos);
        log.info(contratos.size() + " contratos salvos");

    }

}
