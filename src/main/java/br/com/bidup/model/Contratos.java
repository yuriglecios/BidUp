package br.com.bidup.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TAB_CONTRATOS")
@NoArgsConstructor
public class Contratos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idCompra;

    private String numeroControlePNCP;

    private Integer anoCompraPncp;

    private Integer sequencialCompraPncp;

    private String orgaoEntidadeCnpj;

    private String orgaoSubrogadoCnpj;

    private Integer codigoOrgao;

    private String orgaoEntidadeRazaoSocial;

    private String orgaoSubrogadoRazaoSocial;

    private String orgaoEntidadeEsferaId;

    private String orgaoSubrogadoEsferaId;

    private String orgaoEntidadePoderId;

    private String orgaoSubrogadoPoderId;

    private String unidadeOrgaoCodigoUnidade;

    private String unidadeSubrogadaCodigoUnidade;

    private String unidadeOrgaoNomeUnidade;

    private String unidadeSubrogadaNomeUnidade;

    private String unidadeOrgaoUfSigla;

    private String unidadeSubrogadaUfSigla;

    private String unidadeOrgaoMunicipioNome;

    private String unidadeSubrogadaMunicipioNome;

    private Integer unidadeOrgaoCodigoIbge;

    private String unidadeSubrogadaCodigoIbge;

    private String numeroCompra;

    private Integer modalidadeIdPncp;

    private Integer codigoModalidade;

    private String modalidadeNome;

    private boolean srp;

    private Integer modoDisputaIdPncp;

    private Integer codigoModoDisputa;

    private Integer amparoLegalCodigoPncp;

    @Column(columnDefinition = "TEXT")
    private String amparoLegalNome;

    @Column(columnDefinition = "TEXT")
    private String amparoLegalDescricao;

    @Column(columnDefinition = "TEXT")
    private String informacaoComplementar;

    private String processo;

    @Column(columnDefinition = "TEXT")
    private String objetoCompra;

    private boolean existeResultado;

    private Integer orcamentoSigilosoCodigo;

    private String orcamentoSigilosoDescricao;

    private Integer situacaoCompraIdPncp;

    private String situacaoCompraNomePncp;

    private Integer tipoInstrumentoConvocatorioCodigoPncp;

    private String tipoInstrumentoConvocatorioNome;

    private String modoDisputaNomePncp;

    private BigDecimal valorTotalEstimado;

    private BigDecimal valorTotalHomologado;

    private LocalDateTime dataInclusaoPncp;

    private LocalDateTime dataAualizacaoPncp;

    private LocalDateTime dataPublicacaoPncp;

    private LocalDateTime dataAberturaPropostaPncp;

    private LocalDateTime dataEncerramentoPropostaPncp;
    
    private boolean existeItem;

    public Contratos(String idCompra, String numeroControlePNCP, Integer anoCompraPncp, Integer sequencialCompraPncp, String orgaoEntidadeCnpj, String orgaoSubrogadoCnpj, Integer codigoOrgao, String orgaoEntidadeRazaoSocial, String orgaoSubrogadoRazaoSocial, String orgaoEntidadeEsferaId, String orgaoSubrogadoEsferaId, String orgaoEntidadePoderId, String orgaoSubrogadoPoderId, String unidadeOrgaoCodigoUnidade, String unidadeSubrogadaCodigoUnidade, String unidadeOrgaoNomeUnidade, String unidadeSubrogadaNomeUnidade, String unidadeOrgaoUfSigla, String unidadeSubrogadaUfSigla, String unidadeOrgaoMunicipioNome, String unidadeSubrogadaMunicipioNome, Integer unidadeOrgaoCodigoIbge, String unidadeSubrogadaCodigoIbge, String numeroCompra, Integer modalidadeIdPncp, Integer codigoModalidade, String modalidadeNome, boolean srp, Integer modoDisputaIdPncp, Integer codigoModoDisputa, Integer amparoLegalCodigoPncp, String amparoLegalNome, String amparoLegalDescricao, String informacaoComplementar, String processo, String objetoCompra, boolean existeResultado, Integer orcamentoSigilosoCodigo, String orcamentoSigilosoDescricao, Integer situacaoCompraIdPncp, String situacaoCompraNomePncp, Integer tipoInstrumentoConvocatorioCodigoPncp, String tipoInstrumentoConvocatorioNome, String modoDisputaNomePncp, BigDecimal valorTotalEstimado, BigDecimal valorTotalHomologado, LocalDateTime dataInclusaoPncp, LocalDateTime dataAualizacaoPncp, LocalDateTime dataPublicacaoPncp, LocalDateTime dataAberturaPropostaPncp, LocalDateTime dataEncerramentoPropostaPncp) {
        this.idCompra = idCompra;
        this.numeroControlePNCP = numeroControlePNCP;
        this.anoCompraPncp = anoCompraPncp;
        this.sequencialCompraPncp = sequencialCompraPncp;
        this.orgaoEntidadeCnpj = orgaoEntidadeCnpj;
        this.orgaoSubrogadoCnpj = orgaoSubrogadoCnpj;
        this.codigoOrgao = codigoOrgao;
        this.orgaoEntidadeRazaoSocial = orgaoEntidadeRazaoSocial;
        this.orgaoSubrogadoRazaoSocial = orgaoSubrogadoRazaoSocial;
        this.orgaoEntidadeEsferaId = orgaoEntidadeEsferaId;
        this.orgaoSubrogadoEsferaId = orgaoSubrogadoEsferaId;
        this.orgaoEntidadePoderId = orgaoEntidadePoderId;
        this.orgaoSubrogadoPoderId = orgaoSubrogadoPoderId;
        this.unidadeOrgaoCodigoUnidade = unidadeOrgaoCodigoUnidade;
        this.unidadeSubrogadaCodigoUnidade = unidadeSubrogadaCodigoUnidade;
        this.unidadeOrgaoNomeUnidade = unidadeOrgaoNomeUnidade;
        this.unidadeSubrogadaNomeUnidade = unidadeSubrogadaNomeUnidade;
        this.unidadeOrgaoUfSigla = unidadeOrgaoUfSigla;
        this.unidadeSubrogadaUfSigla = unidadeSubrogadaUfSigla;
        this.unidadeOrgaoMunicipioNome = unidadeOrgaoMunicipioNome;
        this.unidadeSubrogadaMunicipioNome = unidadeSubrogadaMunicipioNome;
        this.unidadeOrgaoCodigoIbge = unidadeOrgaoCodigoIbge;
        this.unidadeSubrogadaCodigoIbge = unidadeSubrogadaCodigoIbge;
        this.numeroCompra = numeroCompra;
        this.modalidadeIdPncp = modalidadeIdPncp;
        this.codigoModalidade = codigoModalidade;
        this.modalidadeNome = modalidadeNome;
        this.srp = srp;
        this.modoDisputaIdPncp = modoDisputaIdPncp;
        this.codigoModoDisputa = codigoModoDisputa;
        this.amparoLegalCodigoPncp = amparoLegalCodigoPncp;
        this.amparoLegalNome = amparoLegalNome;
        this.amparoLegalDescricao = amparoLegalDescricao;
        this.informacaoComplementar = informacaoComplementar;
        this.processo = processo;
        this.objetoCompra = objetoCompra;
        this.existeResultado = existeResultado;
        this.orcamentoSigilosoCodigo = orcamentoSigilosoCodigo;
        this.orcamentoSigilosoDescricao = orcamentoSigilosoDescricao;
        this.situacaoCompraIdPncp = situacaoCompraIdPncp;
        this.situacaoCompraNomePncp = situacaoCompraNomePncp;
        this.tipoInstrumentoConvocatorioCodigoPncp = tipoInstrumentoConvocatorioCodigoPncp;
        this.tipoInstrumentoConvocatorioNome = tipoInstrumentoConvocatorioNome;
        this.modoDisputaNomePncp = modoDisputaNomePncp;
        this.valorTotalEstimado = valorTotalEstimado;
        this.valorTotalHomologado = valorTotalHomologado;
        this.dataInclusaoPncp = dataInclusaoPncp;
        this.dataAualizacaoPncp = dataAualizacaoPncp;
        this.dataPublicacaoPncp = dataPublicacaoPncp;
        this.dataAberturaPropostaPncp = dataAberturaPropostaPncp;
        this.dataEncerramentoPropostaPncp = dataEncerramentoPropostaPncp;
        this.existeItem = false;
    }
}
