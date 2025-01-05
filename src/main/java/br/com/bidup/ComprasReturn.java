package br.com.bidup;

import lombok.Data;

import java.util.List;

public class ComprasReturn {

    private List<ComprasDto> resultado;

    private Integer  totalRegistros;

    private Integer totalPaginas;

    private Integer paginasRestantes;

    public List<ComprasDto> getResultado() {
        return resultado;
    }

    public void setResultado(List<ComprasDto> resultado) {
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
