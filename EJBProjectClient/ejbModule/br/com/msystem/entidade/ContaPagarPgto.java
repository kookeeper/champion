package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the contas_pagar_pgto database table.
 * 
 */
@Entity
@Table(name="contas_pagar_pgto")
public class ContaPagarPgto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int contaPagarPgtoSq;
	private String banco;
	private String conta;
	private Date dtPgto;
	private String formaPgto;
	private String observacao;
	private BigDecimal valorPgto;
	private ContaPagar contasPagar;

    public ContaPagarPgto() {
    }


	@Id
	@Column(name="conta_pagar_pgto_sq", unique=true, nullable=false)
	public int getContaPagarPgtoSq() {
		return this.contaPagarPgtoSq;
	}

	public void setContaPagarPgtoSq(int contaPagarPgtoSq) {
		this.contaPagarPgtoSq = contaPagarPgtoSq;
	}


	@Column(length=10)
	public String getBanco() {
		return this.banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}


	@Column(length=20)
	public String getConta() {
		return this.conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="dt_pgto", nullable=false)
	public Date getDtPgto() {
		return this.dtPgto;
	}

	public void setDtPgto(Date dtPgto) {
		this.dtPgto = dtPgto;
	}


	@Column(name="forma_pgto", length=20)
	public String getFormaPgto() {
		return this.formaPgto;
	}

	public void setFormaPgto(String formaPgto) {
		this.formaPgto = formaPgto;
	}


	@Column(length=100)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(name="valor_pgto", nullable=false, precision=10, scale=2)
	public BigDecimal getValorPgto() {
		return this.valorPgto;
	}

	public void setValorPgto(BigDecimal valorPgto) {
		this.valorPgto = valorPgto;
	}


	//bi-directional many-to-one association to ContasPagar
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="conta_pagar_sq", nullable=false)
	public ContaPagar getContasPagar() {
		return this.contasPagar;
	}

	public void setContasPagar(ContaPagar contasPagar) {
		this.contasPagar = contasPagar;
	}
	
}