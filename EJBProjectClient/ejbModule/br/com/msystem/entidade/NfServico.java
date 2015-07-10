package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the nf_servicos database table.
 * 
 */
@Entity
@Table(name="nf_servicos")
public class NfServico implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nfServicoSq;
	private BigDecimal aliqIssNfServico;
	private Timestamp dataNfServico;
	private int numeroNfServico;
	private BigDecimal ttlNfServico;
	private BigDecimal vlrIssNfServico;
	private Cliente cliente;

    public NfServico() {
    }


	@Id
	@Column(name="NF_SERVICO_SQ", unique=true, nullable=false)
	public int getNfServicoSq() {
		return this.nfServicoSq;
	}

	public void setNfServicoSq(int nfServicoSq) {
		this.nfServicoSq = nfServicoSq;
	}


	@Column(name="ALIQ_ISS_NF_SERVICO", nullable=false, precision=10, scale=2)
	public BigDecimal getAliqIssNfServico() {
		return this.aliqIssNfServico;
	}

	public void setAliqIssNfServico(BigDecimal aliqIssNfServico) {
		this.aliqIssNfServico = aliqIssNfServico;
	}


	@Column(name="DATA_NF_SERVICO", nullable=false)
	public Timestamp getDataNfServico() {
		return this.dataNfServico;
	}

	public void setDataNfServico(Timestamp dataNfServico) {
		this.dataNfServico = dataNfServico;
	}


	@Column(name="NUMERO_NF_SERVICO", nullable=false)
	public int getNumeroNfServico() {
		return this.numeroNfServico;
	}

	public void setNumeroNfServico(int numeroNfServico) {
		this.numeroNfServico = numeroNfServico;
	}


	@Column(name="TTL_NF_SERVICO", nullable=false, precision=10, scale=2)
	public BigDecimal getTtlNfServico() {
		return this.ttlNfServico;
	}

	public void setTtlNfServico(BigDecimal ttlNfServico) {
		this.ttlNfServico = ttlNfServico;
	}


	@Column(name="VLR_ISS_NF_SERVICO", nullable=false, precision=10, scale=2)
	public BigDecimal getVlrIssNfServico() {
		return this.vlrIssNfServico;
	}

	public void setVlrIssNfServico(BigDecimal vlrIssNfServico) {
		this.vlrIssNfServico = vlrIssNfServico;
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
	
}