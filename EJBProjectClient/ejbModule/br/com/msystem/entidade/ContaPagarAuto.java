package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the contas_pagar_auto database table.
 * 
 */
@Entity
@Table(name="contas_pagar_auto")
public class ContaPagarAuto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int contaPagarAutoSq;
	private Date dataInicial;
	private byte[] observacao;
	private int parcelas;
	private BigDecimal valor;
	private Cliente cliente;

    public ContaPagarAuto() {
    }


	@Id
	@Column(name="conta_pagar_auto_sq", unique=true, nullable=false)
	public int getContaPagarAutoSq() {
		return this.contaPagarAutoSq;
	}

	public void setContaPagarAutoSq(int contaPagarAutoSq) {
		this.contaPagarAutoSq = contaPagarAutoSq;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="data_inicial", nullable=false)
	public Date getDataInicial() {
		return this.dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}


    @Lob()
	public byte[] getObservacao() {
		return this.observacao;
	}

	public void setObservacao(byte[] observacao) {
		this.observacao = observacao;
	}


	@Column(nullable=false)
	public int getParcelas() {
		return this.parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}


	@Column(nullable=false, precision=10, scale=2)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fornecedor_sq", nullable=false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}