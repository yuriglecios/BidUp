package br.com.bidup;

import br.com.bidup.model.Contratos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ComprasService {

    @Value("${api.base.url}")
    private String baseUrl;

    private final RestTemplateConfiguration restTemplateConfiguration;

    public ComprasService(RestTemplateConfiguration restTemplateConfiguration) {
        this.restTemplateConfiguration = restTemplateConfiguration;
    }

    public List<Contratos> getCompras(
            Integer pagina,
            Integer tamanhoPagina,
            String dataPublicacaoPncpInicial,
            String dataPublicacaoPncpFinal,
            Integer codigoModalidade) {

        String url = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("pagina", pagina)
                .queryParam("tamanhoPagina", tamanhoPagina)
                .queryParam("dataPublicacaoPncpInicial", dataPublicacaoPncpInicial)
                .queryParam("dataPublicacaoPncpFinal", dataPublicacaoPncpFinal)
                .queryParam("codigoModalidade", codigoModalidade)
                .build().toUriString();
        ComprasReturn resposta = restTemplateConfiguration.restTemplate().getForObject(url, ComprasReturn.class);

        return resposta.getResultado();
    }
}
