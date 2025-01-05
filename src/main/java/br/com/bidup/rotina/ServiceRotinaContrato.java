package br.com.bidup.rotina;

import br.com.bidup.ContratosDTO;
import br.com.bidup.ComprasReturn;
import br.com.bidup.RestTemplateConfiguration;
import br.com.bidup.model.Contratos;
import br.com.bidup.repository.ContratosRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceRotinaContrato {
    //log padrão do spring para acompanhar no console
    private final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ServiceRotinaContrato.class);

    @Value("${api.base.url}")
    private String baseUrl;

    private final ContratosRepository contratosRepository;
    private final RestTemplateConfiguration restTemplateConfiguration;

    public ServiceRotinaContrato(ContratosRepository contratosRepository, RestTemplateConfiguration restTemplateConfiguration) {
        this.contratosRepository = contratosRepository;
        this.restTemplateConfiguration = restTemplateConfiguration;
    }

    public void executaCarga(){

        Integer paginaAtual = 1;
        Integer paginasRestantes;

        do {
            log.info("iniciando");
            Map<String, String> parametros = new HashMap<>();
            parametros.put("pagina", paginaAtual.toString());
            parametros.put("tamanhoPagina", "500");
            parametros.put("dataPublicacaoPncpInicial", "2023-01-01");
            parametros.put("dataPublicacaoPncpFinal", "2023-01-31");
            parametros.put("codigoModalidade", "6");

            String urlConsulta = UriComponentsBuilder.fromHttpUrl(baseUrl)
                    .queryParam("pagina", parametros.get("pagina"))
                    .queryParam("tamanhoPagina", parametros.get("tamanhoPagina"))
                    .queryParam("dataPublicacaoPncpInicial", parametros.get("dataPublicacaoPncpInicial"))
                    .queryParam("dataPublicacaoPncpFinal", parametros.get("dataPublicacaoPncpFinal"))
                    .queryParam("codigoModalidade", parametros.get("codigoModalidade"))
                    .build().toUriString();

            ComprasReturn compras = restTemplateConfiguration.restTemplate().getForObject(urlConsulta, ComprasReturn.class);
            if (compras != null){
                salva(compras.getResultado());
            }
            paginasRestantes = compras.getPaginasRestantes();
            paginaAtual ++;
        }
        while (paginasRestantes != null && paginasRestantes > 0);

    }

    private void salva(List<Contratos> contratos){
        contratosRepository.saveAll(contratos);
    }

}
