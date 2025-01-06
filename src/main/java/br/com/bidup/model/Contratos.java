package br.com.bidup.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TAB_CONTRATOS")
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

    public Contratos() {
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public String getNumeroControlePNCP() {
        return numeroControlePNCP;
    }

    public void setNumeroControlePNCP(String numeroControlePNCP) {
        this.numeroControlePNCP = numeroControlePNCP;
    }

    public Integer getAnoCompraPncp() {
        return anoCompraPncp;
    }

    public void setAnoCompraPncp(Integer anoCompraPncp) {
        this.anoCompraPncp = anoCompraPncp;
    }

    public Integer getSequencialCompraPncp() {
        return sequencialCompraPncp;
    }

    public void setSequencialCompraPncp(Integer sequencialCompraPncp) {
        this.sequencialCompraPncp = sequencialCompraPncp;
    }

    public String getOrgaoEntidadeCnpj() {
        return orgaoEntidadeCnpj;
    }

    public void setOrgaoEntidadeCnpj(String orgaoEntidadeCnpj) {
        this.orgaoEntidadeCnpj = orgaoEntidadeCnpj;
    }

    public String getOrgaoSubrogadoCnpj() {
        return orgaoSubrogadoCnpj;
    }

    public void setOrgaoSubrogadoCnpj(String orgaoSubrogadoCnpj) {
        this.orgaoSubrogadoCnpj = orgaoSubrogadoCnpj;
    }

    public Integer getCodigoOrgao() {
        return codigoOrgao;
    }

    public void setCodigoOrgao(Integer codigoOrgao) {
        this.codigoOrgao = codigoOrgao;
    }

    public String getOrgaoEntidadeRazaoSocial() {
        return orgaoEntidadeRazaoSocial;
    }

    public void setOrgaoEntidadeRazaoSocial(String orgaoEntidadeRazaoSocial) {
        this.orgaoEntidadeRazaoSocial = orgaoEntidadeRazaoSocial;
    }

    public String getOrgaoSubrogadoRazaoSocial() {
        return orgaoSubrogadoRazaoSocial;
    }

    public void setOrgaoSubrogadoRazaoSocial(String orgaoSubrogadoRazaoSocial) {
        this.orgaoSubrogadoRazaoSocial = orgaoSubrogadoRazaoSocial;
    }

    public String getOrgaoEntidadeEsferaId() {
        return orgaoEntidadeEsferaId;
    }

    public void setOrgaoEntidadeEsferaId(String orgaoEntidadeEsferaId) {
        this.orgaoEntidadeEsferaId = orgaoEntidadeEsferaId;
    }

    public String getOrgaoSubrogadoEsferaId() {
        return orgaoSubrogadoEsferaId;
    }

    public void setOrgaoSubrogadoEsferaId(String orgaoSubrogadoEsferaId) {
        this.orgaoSubrogadoEsferaId = orgaoSubrogadoEsferaId;
    }

    public String getOrgaoEntidadePoderId() {
        return orgaoEntidadePoderId;
    }

    public void setOrgaoEntidadePoderId(String orgaoEntidadePoderId) {
        this.orgaoEntidadePoderId = orgaoEntidadePoderId;
    }

    public String getOrgaoSubrogadoPoderId() {
        return orgaoSubrogadoPoderId;
    }

    public void setOrgaoSubrogadoPoderId(String orgaoSubrogadoPoderId) {
        this.orgaoSubrogadoPoderId = orgaoSubrogadoPoderId;
    }

    public String getUnidadeOrgaoCodigoUnidade() {
        return unidadeOrgaoCodigoUnidade;
    }

    public void setUnidadeOrgaoCodigoUnidade(String unidadeOrgaoCodigoUnidade) {
        this.unidadeOrgaoCodigoUnidade = unidadeOrgaoCodigoUnidade;
    }

    public String getUnidadeSubrogadaCodigoUnidade() {
        return unidadeSubrogadaCodigoUnidade;
    }

    public void setUnidadeSubrogadaCodigoUnidade(String unidadeSubrogadaCodigoUnidade) {
        this.unidadeSubrogadaCodigoUnidade = unidadeSubrogadaCodigoUnidade;
    }

    public String getUnidadeOrgaoNomeUnidade() {
        return unidadeOrgaoNomeUnidade;
    }

    public void setUnidadeOrgaoNomeUnidade(String unidadeOrgaoNomeUnidade) {
        this.unidadeOrgaoNomeUnidade = unidadeOrgaoNomeUnidade;
    }

    public String getUnidadeSubrogadaNomeUnidade() {
        return unidadeSubrogadaNomeUnidade;
    }

    public void setUnidadeSubrogadaNomeUnidade(String unidadeSubrogadaNomeUnidade) {
        this.unidadeSubrogadaNomeUnidade = unidadeSubrogadaNomeUnidade;
    }

    public String getUnidadeOrgaoUfSigla() {
        return unidadeOrgaoUfSigla;
    }

    public void setUnidadeOrgaoUfSigla(String unidadeOrgaoUfSigla) {
        this.unidadeOrgaoUfSigla = unidadeOrgaoUfSigla;
    }

    public String getUnidadeSubrogadaUfSigla() {
        return unidadeSubrogadaUfSigla;
    }

    public void setUnidadeSubrogadaUfSigla(String unidadeSubrogadaUfSigla) {
        this.unidadeSubrogadaUfSigla = unidadeSubrogadaUfSigla;
    }

    public String getUnidadeOrgaoMunicipioNome() {
        return unidadeOrgaoMunicipioNome;
    }

    public void setUnidadeOrgaoMunicipioNome(String unidadeOrgaoMunicipioNome) {
        this.unidadeOrgaoMunicipioNome = unidadeOrgaoMunicipioNome;
    }

    public String getUnidadeSubrogadaMunicipioNome() {
        return unidadeSubrogadaMunicipioNome;
    }

    public void setUnidadeSubrogadaMunicipioNome(String unidadeSubrogadaMunicipioNome) {
        this.unidadeSubrogadaMunicipioNome = unidadeSubrogadaMunicipioNome;
    }

    public Integer getUnidadeOrgaoCodigoIbge() {
        return unidadeOrgaoCodigoIbge;
    }

    public void setUnidadeOrgaoCodigoIbge(Integer unidadeOrgaoCodigoIbge) {
        this.unidadeOrgaoCodigoIbge = unidadeOrgaoCodigoIbge;
    }

    public String getUnidadeSubrogadaCodigoIbge() {
        return unidadeSubrogadaCodigoIbge;
    }

    public void setUnidadeSubrogadaCodigoIbge(String unidadeSubrogadaCodigoIbge) {
        this.unidadeSubrogadaCodigoIbge = unidadeSubrogadaCodigoIbge;
    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public Integer getModalidadeIdPncp() {
        return modalidadeIdPncp;
    }

    public void setModalidadeIdPncp(Integer modalidadeIdPncp) {
        this.modalidadeIdPncp = modalidadeIdPncp;
    }

    public Integer getCodigoModalidade() {
        return codigoModalidade;
    }

    public void setCodigoModalidade(Integer codigoModalidade) {
        this.codigoModalidade = codigoModalidade;
    }

    public String getModalidadeNome() {
        return modalidadeNome;
    }

    public void setModalidadeNome(String modalidadeNome) {
        this.modalidadeNome = modalidadeNome;
    }

    public boolean isSrp() {
        return srp;
    }

    public void setSrp(boolean srp) {
        this.srp = srp;
    }

    public Integer getModoDisputaIdPncp() {
        return modoDisputaIdPncp;
    }

    public void setModoDisputaIdPncp(Integer modoDisputaIdPncp) {
        this.modoDisputaIdPncp = modoDisputaIdPncp;
    }

    public Integer getCodigoModoDisputa() {
        return codigoModoDisputa;
    }

    public void setCodigoModoDisputa(Integer codigoModoDisputa) {
        this.codigoModoDisputa = codigoModoDisputa;
    }

    public Integer getAmparoLegalCodigoPncp() {
        return amparoLegalCodigoPncp;
    }

    public void setAmparoLegalCodigoPncp(Integer amparoLegalCodigoPncp) {
        this.amparoLegalCodigoPncp = amparoLegalCodigoPncp;
    }

    public String getAmparoLegalNome() {
        return amparoLegalNome;
    }

    public void setAmparoLegalNome(String amparoLegalNome) {
        this.amparoLegalNome = amparoLegalNome;
    }

    public String getAmparoLegalDescricao() {
        return amparoLegalDescricao;
    }

    public void setAmparoLegalDescricao(String amparoLegalDescricao) {
        this.amparoLegalDescricao = amparoLegalDescricao;
    }

    public String getInformacaoComplementar() {
        return informacaoComplementar;
    }

    public void setInformacaoComplementar(String informacaoComplementar) {
        this.informacaoComplementar = informacaoComplementar;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public String getObjetoCompra() {
        return objetoCompra;
    }

    public void setObjetoCompra(String objetoCompra) {
        this.objetoCompra = objetoCompra;
    }

    public boolean isExisteResultado() {
        return existeResultado;
    }

    public void setExisteResultado(boolean existeResultado) {
        this.existeResultado = existeResultado;
    }

    public Integer getOrcamentoSigilosoCodigo() {
        return orcamentoSigilosoCodigo;
    }

    public void setOrcamentoSigilosoCodigo(Integer orcamentoSigilosoCodigo) {
        this.orcamentoSigilosoCodigo = orcamentoSigilosoCodigo;
    }

    public String getOrcamentoSigilosoDescricao() {
        return orcamentoSigilosoDescricao;
    }

    public void setOrcamentoSigilosoDescricao(String orcamentoSigilosoDescricao) {
        this.orcamentoSigilosoDescricao = orcamentoSigilosoDescricao;
    }

    public Integer getSituacaoCompraIdPncp() {
        return situacaoCompraIdPncp;
    }

    public void setSituacaoCompraIdPncp(Integer situacaoCompraIdPncp) {
        this.situacaoCompraIdPncp = situacaoCompraIdPncp;
    }

    public String getSituacaoCompraNomePncp() {
        return situacaoCompraNomePncp;
    }

    public void setSituacaoCompraNomePncp(String situacaoCompraNomePncp) {
        this.situacaoCompraNomePncp = situacaoCompraNomePncp;
    }

    public Integer getTipoInstrumentoConvocatorioCodigoPncp() {
        return tipoInstrumentoConvocatorioCodigoPncp;
    }

    public void setTipoInstrumentoConvocatorioCodigoPncp(Integer tipoInstrumentoConvocatorioCodigoPncp) {
        this.tipoInstrumentoConvocatorioCodigoPncp = tipoInstrumentoConvocatorioCodigoPncp;
    }

    public String getTipoInstrumentoConvocatorioNome() {
        return tipoInstrumentoConvocatorioNome;
    }

    public void setTipoInstrumentoConvocatorioNome(String tipoInstrumentoConvocatorioNome) {
        this.tipoInstrumentoConvocatorioNome = tipoInstrumentoConvocatorioNome;
    }

    public String getModoDisputaNomePncp() {
        return modoDisputaNomePncp;
    }

    public void setModoDisputaNomePncp(String modoDisputaNomePncp) {
        this.modoDisputaNomePncp = modoDisputaNomePncp;
    }

    public BigDecimal getValorTotalEstimado() {
        return valorTotalEstimado;
    }

    public void setValorTotalEstimado(BigDecimal valorTotalEstimado) {
        this.valorTotalEstimado = valorTotalEstimado;
    }

    public BigDecimal getValorTotalHomologado() {
        return valorTotalHomologado;
    }

    public void setValorTotalHomologado(BigDecimal valorTotalHomologado) {
        this.valorTotalHomologado = valorTotalHomologado;
    }

    public LocalDateTime getDataInclusaoPncp() {
        return dataInclusaoPncp;
    }

    public void setDataInclusaoPncp(LocalDateTime dataInclusaoPncp) {
        this.dataInclusaoPncp = dataInclusaoPncp;
    }

    public LocalDateTime getDataAualizacaoPncp() {
        return dataAualizacaoPncp;
    }

    public void setDataAualizacaoPncp(LocalDateTime dataAualizacaoPncp) {
        this.dataAualizacaoPncp = dataAualizacaoPncp;
    }

    public LocalDateTime getDataPublicacaoPncp() {
        return dataPublicacaoPncp;
    }

    public void setDataPublicacaoPncp(LocalDateTime dataPublicacaoPncp) {
        this.dataPublicacaoPncp = dataPublicacaoPncp;
    }

    public LocalDateTime getDataAberturaPropostaPncp() {
        return dataAberturaPropostaPncp;
    }

    public void setDataAberturaPropostaPncp(LocalDateTime dataAberturaPropostaPncp) {
        this.dataAberturaPropostaPncp = dataAberturaPropostaPncp;
    }

    public LocalDateTime getDataEncerramentoPropostaPncp() {
        return dataEncerramentoPropostaPncp;
    }

    public void setDataEncerramentoPropostaPncp(LocalDateTime dataEncerramentoPropostaPncp) {
        this.dataEncerramentoPropostaPncp = dataEncerramentoPropostaPncp;
    }

    public boolean isExisteItem() {
        return existeItem;
    }

    public void setExisteItem(boolean existeItem) {
        this.existeItem = existeItem;
    }
}
