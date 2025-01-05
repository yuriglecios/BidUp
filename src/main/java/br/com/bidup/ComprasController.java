package br.com.bidup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    private final ComprasService comprasService;

    public ComprasController(ComprasService comprasService) {
        this.comprasService = comprasService;
    }

    @GetMapping
    public List<ComprasDto> getCompras(
        @RequestParam(name = "pagina") Integer pagina,
        @RequestParam(name = "tamanhoPagina") Integer tamanhoPagina,
        @RequestParam(name = "dataPublicacaoPncpInicial") String dataPublicacaoPncpInicial,
        @RequestParam(name = "dataPublicacaoPncpFinal") String dataPublicacaoPncpFinal,
        @RequestParam(name = "codigoModalidade") Integer codigoModalidade
    ){
        return comprasService.getCompras(pagina, tamanhoPagina, dataPublicacaoPncpInicial, dataPublicacaoPncpFinal, codigoModalidade);
    }
}
