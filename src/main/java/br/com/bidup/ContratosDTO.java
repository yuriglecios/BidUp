package br.com.bidup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ContratosDTO {
    @JsonProperty("idCompra")
    private String idCompra;

    @JsonProperty("numeroControlePNCP")
    private String numeroControlePNCP;

    @JsonProperty("anoCompraPncp")
    private int anoCompraPncp;

    @JsonProperty("sequencialCompraPncp")
    private int sequencialCompraPncp;

    @JsonProperty("orgaoEntidadeCnpj")
    private String orgaoEntidadeCnpj;

    @JsonProperty("orgaoSubrogadoCnpj")
    private String orgaoSubrogadoCnpj;

    @JsonProperty("codigoOrgao")
    private int codigoOrgao;

    @JsonProperty("orgaoEntidadeRazaoSocial")
    private String orgaoEntidadeRazaoSocial;

    @JsonProperty("orgaoSubrogadoRazaoSocial")
    private String orgaoSubrogadoRazaoSocial;

    @JsonProperty("orgaoEntidadeEsferaId")
    private String orgaoEntidadeEsferaId;

    @JsonProperty("orgaoSubrogadoEsferaId")
    private String orgaoSubrogadoEsferaId;

    @JsonProperty("orgaoEntidadePoderId")
    private String orgaoEntidadePoderId;

    @JsonProperty("orgaoSubrogadoPoderId")
    private String orgaoSubrogadoPoderId;

    @JsonProperty("unidadeOrgaoCodigoUnidade")
    private String unidadeOrgaoCodigoUnidade;

    @JsonProperty("unidadeSubrogadaCodigoUnidade")
    private String unidadeSubrogadaCodigoUnidade;

    @JsonProperty("unidadeOrgaoNomeUnidade")
    private String unidadeOrgaoNomeUnidade;

    @JsonProperty("unidadeSubrogadaNomeUnidade")
    private String unidadeSubrogadaNomeUnidade;

    @JsonProperty("unidadeOrgaoUfSigla")
    private String unidadeOrgaoUfSigla;

    @JsonProperty("unidadeSubrogadaUfSigla")
    private String unidadeSubrogadaUfSigla;

    @JsonProperty("unidadeOrgaoMunicipioNome")
    private String unidadeOrgaoMunicipioNome;

    @JsonProperty("unidade_subrogada_municipio_nome")
    private String unidadeSubrogadaMunicipioNome;

    @JsonProperty("unidadeOrgaoCodigoIbge")
    private int unidadeOrgaoCodigoIbge;

    @JsonProperty("unidadeSubrogadaCodigoIbge")
    private String unidadeSubrogadaCodigoIbge;

    @JsonProperty("numeroCompra")
    private String numeroCompra;

    @JsonProperty("modalidadeIdPncp")
    private int modalidadeIdPncp;

    @JsonProperty("codigoModalidade")
    private int codigoModalidade;

    @JsonProperty("modalidadeNome")
    private String modalidadeNome;

    @JsonProperty("srp")
    private boolean srp;

    @JsonProperty("modoDisputaIdPncp")
    private int modoDisputaIdPncp;

    @JsonProperty("codigoModoDisputa")
    private int codigoModoDisputa;

    @JsonProperty("amparoLegalCodigoPncp")
    private int amparoLegalCodigoPncp;

    @JsonProperty("amparoLegalNome")
    private String amparoLegalNome;

    @JsonProperty("amparoLegalDescricao")
    private String amparoLegalDescricao;

    @JsonProperty("informacaoComplementar")
    private String informacaoComplementar;

    @JsonProperty("processo")
    private String processo;

    @JsonProperty("objetoCompra")
    private String objetoCompra;

    @JsonProperty("existeResultado")
    private boolean existeResultado;

    @JsonProperty("orcamentoSigilosoCodigo")
    private int orcamentoSigilosoCodigo;

    @JsonProperty("orcamentoSigilosoDescricao")
    private String orcamentoSigilosoDescricao;

    @JsonProperty("situacaoCompraIdPncp")
    private int situacaoCompraIdPncp;

    @JsonProperty("situacaoCompraNomePncp")
    private String situacaoCompraNomePncp;

    @JsonProperty("tipoInstrumentoConvocatorioCodigoPncp")
    private int tipoInstrumentoConvocatorioCodigoPncp;

    @JsonProperty("tipoInstrumentoConvocatorioNome")
    private String tipoInstrumentoConvocatorioNome;

    @JsonProperty("modoDisputaNomePncp")
    private String modoDisputaNomePncp;

    @JsonProperty("valorTotalEstimado")
    private BigDecimal valorTotalEstimado;

    @JsonProperty("valorTotalHomologado")
    private BigDecimal valorTotalHomologado;

    @JsonProperty("dataInclusaoPncp")
    private LocalDateTime dataInclusaoPncp;

    @JsonProperty("dataAualizacaoPncp")
    private LocalDateTime dataAualizacaoPncp;

    @JsonProperty("dataPublicacaoPncp")
    private LocalDateTime dataPublicacaoPncp;

    @JsonProperty("dataAberturaPropostaPncp")
    private LocalDateTime dataAberturaPropostaPncp;

    @JsonProperty("dataEncerramentoPropostaPncp")
    private LocalDateTime dataEncerramentoPropostaPncp;

}
