package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the contas_pagar database table.
 * 
 */
@Entity
@Table(name="contas_pagar")
public class ContaPagar implements Serializable {
	private static final long serialVersionUID = 1L;
	private int contaPagarSq;
	private int contaPagarAutoSq;
	private Date dtPgto;
	private Date dtcadastroDuplicata;
	private Date dtvencimentoDuplicata;
	private String formaPgto;
	private String numeroDuplicata;
	private byte[] observacao;
	private int referenciaAuto;
	private BigDecimal valorDesconto;
	private BigDecimal valorDuplicata;
	private BigDecimal valorJuros;
	private BigDecimal valorPgto;
	private ContaBanco contaBanco;
	private Fornecedor fornecedor;
	private List<ContaPagarPgto> contasPagarPgtos;

    public ContaPagar() {
    }


	@Id
	@Column(name="conta_pagar_sq", unique=true, nullable=false)
	public int getContaPagarSq() {
		return this.contaPagarSq;
	}

	public void setContaPagarSq(int contaPagarSq) {
		this.contaPagarSq = contaPagarSq;
	}


	@Column(name="conta_pagar_auto_sq")
	public int getContaPagarAutoSq() {
		return this.contaPagarAutoSq;
	}

	public void setContaPagarAutoSq(int contaPagarAutoSq) {
		this.contaPagarAutoSq = contaPagarAutoSq;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="dt_pgto")
	public Date getDtPgto() {
		return this.dtPgto;
	}

	public void setDtPgto(Date dtPgto) {
		this.dtPgto = dtPgto;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="dtcadastro_duplicata", nullable=false)
	public Date getDtcadastroDuplicata() {
		return this.dtcadastroDuplicata;
	}

	public void setDtcadastroDuplicata(Date dtcadastroDuplicata) {
		this.dtcadastroDuplicata = dtcadastroDuplicata;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="dtvencimento_duplicata", nullable=false)
	public Date getDtvencimentoDuplicata() {
		return this.dtvencimentoDuplicata;
	}

	public void setDtvencimentoDuplicata(Date dtvencimentoDuplicata) {
		this.dtvencimentoDuplicata = dtvencimentoDuplicata;
	}


	@Column(name="forma_pgto", length=20)
	public String getFormaPgto() {
		return this.formaPgto;
	}

	public void setFormaPgto(String formaPgto) {
		this.formaPgto = formaPgto;
	}


	@Column(name="numero_duplicata", nullable=false, length=20)
	public String getNumeroDuplicata() {
		return this.numeroDuplicata;
	}

	public void setNumeroDuplicata(String numeroDuplicata) {
		this.numeroDuplicata = numeroDuplicata;
	}


    @Lob()
	public byte[] getObservacao() {
		return this.observacao;
	}

	public void setObservacao(byte[] observacao) {
		this.observacao = observacao;
	}


	@Column(name="referencia_auto")
	public int getReferenciaAuto() {
		return this.referenciaAuto;
	}

	public void setReferenciaAuto(int referenciaAuto) {
		this.referenciaAuto = referenciaAuto;
	}


	@Column(name="valor_desconto", precision=10, scale=2)
	public BigDecimal getValorDesconto() {
		return this.valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}


	@Column(name="valor_duplicata", precision=10, scale=2)
	public BigDecimal getValorDuplicata() {
		return this.valorDuplicata;
	}

	public void setValorDuplicata(BigDecimal valorDuplicata) {
		this.valorDuplicata = valorDuplicata;
	}


	@Column(name="valor_juros", precision=10, scale=2)
	public BigDecimal getValorJuros() {
		return this.valorJuros;
	}

	public void setValorJuros(BigDecimal valorJuros) {
		this.valorJuros = valorJuros;
	}


	@Column(name="valor_pgto", precision=10, scale=2)
	public BigDecimal getValorPgto() {
		return this.valorPgto;
	}

	public void setValorPgto(BigDecimal valorPgto) {
		this.valorPgto = valorPgto;
	}


	//bi-directional many-to-one association to ContaBanco
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="conta_banco_sq")
	public ContaBanco getContaBanco() {
		return this.contaBanco;
	}

	public void setContaBanco(ContaBanco contaBanco) {
		this.contaBanco = contaBanco;
	}
	

	//bi-directional many-to-one association to Fornecedor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fornecedor_sq", nullable=false)
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	

	//bi-directional many-to-one association to ContasPagarPgto
	@OneToMany(mappedBy="contasPagar")
	public List<ContaPagarPgto> getContasPagarPgtos() {
		return this.contasPagarPgtos;
	}

	public void setContasPagarPgtos(List<ContaPagarPgto> contasPagarPgtos) {
		this.contasPagarPgtos = contasPagarPgtos;
	}
	
}