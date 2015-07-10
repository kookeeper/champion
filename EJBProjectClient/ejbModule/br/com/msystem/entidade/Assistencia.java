package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Time;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the assistencias database table.
 * 
 */
@Entity
@Table(name="assistencias")
public class Assistencia implements Serializable {
	private static final long serialVersionUID = 1L;
	private int assistenciaSq;
	private String contrato;
	private BigDecimal cotacaoDolar;
	private Timestamp dataAssistencia;
	private Timestamp dataChamado;
	private BigDecimal despChamado;
	private BigDecimal despDesloc;
	private BigDecimal despHtecAd;
	private String frete;
	private String garantia;
	private Time horaFim;
	private Time horaInicio;
	private int numeroAssistencia;
	private BigDecimal vlrPecas;
	private BigDecimal vlrTotal;
	private Cliente cliente;
	private CondPagto condPagto;
	private Vendedor vendedore;
	private List<AssistenciaEquip> assistenciasEquips;

    public Assistencia() {
    }


	@Id
	@Column(name="ASSISTENCIA_SQ", unique=true, nullable=false)
	public int getAssistenciaSq() {
		return this.assistenciaSq;
	}

	public void setAssistenciaSq(int assistenciaSq) {
		this.assistenciaSq = assistenciaSq;
	}


	@Column(length=1)
	public String getContrato() {
		return this.contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}


	@Column(name="COTACAO_DOLAR", precision=10, scale=2)
	public BigDecimal getCotacaoDolar() {
		return this.cotacaoDolar;
	}

	public void setCotacaoDolar(BigDecimal cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}


	@Column(name="DATA_ASSISTENCIA", nullable=false)
	public Timestamp getDataAssistencia() {
		return this.dataAssistencia;
	}

	public void setDataAssistencia(Timestamp dataAssistencia) {
		this.dataAssistencia = dataAssistencia;
	}


	@Column(name="DATA_CHAMADO", nullable=false)
	public Timestamp getDataChamado() {
		return this.dataChamado;
	}

	public void setDataChamado(Timestamp dataChamado) {
		this.dataChamado = dataChamado;
	}


	@Column(name="DESP_CHAMADO", precision=10, scale=2)
	public BigDecimal getDespChamado() {
		return this.despChamado;
	}

	public void setDespChamado(BigDecimal despChamado) {
		this.despChamado = despChamado;
	}


	@Column(name="DESP_DESLOC", precision=10, scale=2)
	public BigDecimal getDespDesloc() {
		return this.despDesloc;
	}

	public void setDespDesloc(BigDecimal despDesloc) {
		this.despDesloc = despDesloc;
	}


	@Column(name="DESP_HTEC_AD", precision=10, scale=2)
	public BigDecimal getDespHtecAd() {
		return this.despHtecAd;
	}

	public void setDespHtecAd(BigDecimal despHtecAd) {
		this.despHtecAd = despHtecAd;
	}


	@Column(length=1)
	public String getFrete() {
		return this.frete;
	}

	public void setFrete(String frete) {
		this.frete = frete;
	}


	@Column(length=1)
	public String getGarantia() {
		return this.garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}


	@Column(name="HORA_FIM")
	public Time getHoraFim() {
		return this.horaFim;
	}

	public void setHoraFim(Time horaFim) {
		this.horaFim = horaFim;
	}


	@Column(name="HORA_INICIO", nullable=false)
	public Time getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}


	@Column(name="NUMERO_ASSISTENCIA", nullable=false)
	public int getNumeroAssistencia() {
		return this.numeroAssistencia;
	}

	public void setNumeroAssistencia(int numeroAssistencia) {
		this.numeroAssistencia = numeroAssistencia;
	}


	@Column(name="VLR_PECAS", precision=10, scale=2)
	public BigDecimal getVlrPecas() {
		return this.vlrPecas;
	}

	public void setVlrPecas(BigDecimal vlrPecas) {
		this.vlrPecas = vlrPecas;
	}


	@Column(name="VLR_TOTAL", precision=10, scale=2)
	public BigDecimal getVlrTotal() {
		return this.vlrTotal;
	}

	public void setVlrTotal(BigDecimal vlrTotal) {
		this.vlrTotal = vlrTotal;
	}


	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CLIENTE_SQ", nullable=false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	//bi-directional many-to-one association to CondPagto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COND_PAGTO_SQ")
	public CondPagto getCondPagto() {
		return this.condPagto;
	}

	public void setCondPagto(CondPagto condPagto) {
		this.condPagto = condPagto;
	}
	

	//bi-directional many-to-one association to Vendedore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="vendedor_sq", nullable=false)
	public Vendedor getVendedore() {
		return this.vendedore;
	}

	public void setVendedore(Vendedor vendedore) {
		this.vendedore = vendedore;
	}
	

	//bi-directional many-to-one association to AssistenciasEquip
	@OneToMany(mappedBy="assistencia")
	public List<AssistenciaEquip> getAssistenciasEquips() {
		return this.assistenciasEquips;
	}

	public void setAssistenciasEquips(List<AssistenciaEquip> assistenciasEquips) {
		this.assistenciasEquips = assistenciasEquips;
	}
	
}