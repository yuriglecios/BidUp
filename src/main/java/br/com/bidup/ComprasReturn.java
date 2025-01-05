package br.com.bidup;

import br.com.bidup.model.Contratos;

import java.util.List;

public class ComprasReturn {

    private List<Contratos> resultado;

    private Integer  totalRegistros;

    private Integer totalPaginas;

    private Integer paginasRestantes;

    public List<Contratos> getResultado() {
        return resultado;
    }

    public void setResultado(List<Contratos> resultado) {
        this.resultado = resultado;
    }

    public Integer getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(Integer totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    public Integer getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(Integer totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public Integer getPaginasRestantes() {
        return paginasRestantes;
    }

    public void setPaginasRestantes(Integer paginasRestantes) {
        this.paginasRestantes = paginasRestantes;
    }
}
