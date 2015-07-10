package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the classificacao database table.
 * 
 */
@Entity
@Table(name="classificacao")
public class Classificacao implements Serializable {
	private static final long serialVersionUID = 1L;
	private int classificacaoSq;
	private String codigoClassificacao;
	private BigDecimal limiteMaximo;
	private BigDecimal limiteMinimo;
	private int mesesBonus;
	private List<Cliente> clientes;

    public Classificacao() {
    }


	@Id
	@Column(name="CLASSIFICACAO_SQ", unique=true, nullable=false)
	public int getClassificacaoSq() {
		return this.classificacaoSq;
	}

	public void setClassificacaoSq(int classificacaoSq) {
		this.classificacaoSq = classificacaoSq;
	}


	@Column(name="CODIGO_CLASSIFICACAO", nullable=false, length=50)
	public String getCodigoClassificacao() {
		return this.codigoClassificacao;
	}

	public void setCodigoClassificacao(String codigoClassificacao) {
		this.codigoClassificacao = codigoClassificacao;
	}


	@Column(name="LIMITE_MAXIMO", precision=10, scale=2)
	public BigDecimal getLimiteMaximo() {
		return this.limiteMaximo;
	}

	public void setLimiteMaximo(BigDecimal limiteMaximo) {
		this.limiteMaximo = limiteMaximo;
	}


	@Column(name="LIMITE_MINIMO", nullable=false, precision=10, scale=2)
	public BigDecimal getLimiteMinimo() {
		return this.limiteMinimo;
	}

	public void setLimiteMinimo(BigDecimal limiteMinimo) {
		this.limiteMinimo = limiteMinimo;
	}


	@Column(name="MESES_BONUS")
	public int getMesesBonus() {
		return this.mesesBonus;
	}

	public void setMesesBonus(int mesesBonus) {
		this.mesesBonus = mesesBonus;
	}


	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="classificacao")
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}