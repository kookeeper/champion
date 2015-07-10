package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the balanco_contagem database table.
 * 
 */
@Entity
@Table(name="balanco_contagem")
public class BalancoContagem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int balancoContagemSq;
	private Date dataInicioContagem;
	private Date dataTerminoContagem;
	private int numeroContagem;
	private int statusContagem;
	private Balanco balanco;
	private List<BalancoContagemProduto> balancoContagemProdutos;

    public BalancoContagem() {
    }


	@Id
	@Column(name="balanco_contagem_sq", unique=true, nullable=false)
	public int getBalancoContagemSq() {
		return this.balancoContagemSq;
	}

	public void setBalancoContagemSq(int balancoContagemSq) {
		this.balancoContagemSq = balancoContagemSq;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="data_inicio_contagem")
	public Date getDataInicioContagem() {
		return this.dataInicioContagem;
	}

	public void setDataInicioContagem(Date dataInicioContagem) {
		this.dataInicioContagem = dataInicioContagem;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="data_termino_contagem")
	public Date getDataTerminoContagem() {
		return this.dataTerminoContagem;
	}

	public void setDataTerminoContagem(Date dataTerminoContagem) {
		this.dataTerminoContagem = dataTerminoContagem;
	}


	@Column(name="numero_contagem", nullable=false)
	public int getNumeroContagem() {
		return this.numeroContagem;
	}

	public void setNumeroContagem(int numeroContagem) {
		this.numeroContagem = numeroContagem;
	}


	@Column(name="status_contagem", nullable=false)
	public int getStatusContagem() {
		return this.statusContagem;
	}

	public void setStatusContagem(int statusContagem) {
		this.statusContagem = statusContagem;
	}


	//bi-directional many-to-one association to Balanco
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="balanco_sq", nullable=false)
	public Balanco getBalanco() {
		return this.balanco;
	}

	public void setBalanco(Balanco balanco) {
		this.balanco = balanco;
	}
	

	//bi-directional many-to-one association to BalancoContagemProduto
	@OneToMany(mappedBy="balancoContagem")
	public List<BalancoContagemProduto> getBalancoContagemProdutos() {
		return this.balancoContagemProdutos;
	}

	public void setBalancoContagemProdutos(List<BalancoContagemProduto> balancoContagemProdutos) {
		this.balancoContagemProdutos = balancoContagemProdutos;
	}
	
}