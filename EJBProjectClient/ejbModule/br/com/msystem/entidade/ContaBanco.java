package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the conta_banco database table.
 * 
 */
@Entity
@Table(name="conta_banco")
public class ContaBanco implements Serializable {
	private static final long serialVersionUID = 1L;
	private int contaBancoSq;
	private String nomeAgencia;
	private String nomeBanco;
	private String numeroConta;
	private List<ContaPagar> contasPagars;

    public ContaBanco() {
    }


	@Id
	@Column(name="conta_banco_sq", unique=true, nullable=false)
	public int getContaBancoSq() {
		return this.contaBancoSq;
	}

	public void setContaBancoSq(int contaBancoSq) {
		this.contaBancoSq = contaBancoSq;
	}


	@Column(name="nome_agencia", length=50)
	public String getNomeAgencia() {
		return this.nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}


	@Column(name="nome_banco", nullable=false, length=50)
	public String getNomeBanco() {
		return this.nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}


	@Column(name="numero_conta", nullable=false, length=50)
	public String getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}


	//bi-directional many-to-one association to ContasPagar
	@OneToMany(mappedBy="contaBanco")
	public List<ContaPagar> getContasPagars() {
		return this.contasPagars;
	}

	public void setContasPagars(List<ContaPagar> contasPagars) {
		this.contasPagars = contasPagars;
	}
	
}