package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the balanco database table.
 * 
 */
@Entity
@Table(name="balanco")
public class Balanco implements Serializable {
	private static final long serialVersionUID = 1L;
	private int balancoSq;
	private Date dataInicioBalanco;
	private Date dataTerminoBalanco;
	private int grupoBalanco;
	private int numeroEstoque;
	private int qtdeContagem;
	private String statusBalanco;
	private Empresa empresa;
	private List<BalancoContagem> balancoContagems;

    public Balanco() {
    }


	@Id
	@Column(name="balanco_sq", unique=true, nullable=false)
	public int getBalancoSq() {
		return this.balancoSq;
	}

	public void setBalancoSq(int balancoSq) {
		this.balancoSq = balancoSq;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="data_inicio_balanco", nullable=false)
	public Date getDataInicioBalanco() {
		return this.dataInicioBalanco;
	}

	public void setDataInicioBalanco(Date dataInicioBalanco) {
		this.dataInicioBalanco = dataInicioBalanco;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="data_termino_balanco")
	public Date getDataTerminoBalanco() {
		return this.dataTerminoBalanco;
	}

	public void setDataTerminoBalanco(Date dataTerminoBalanco) {
		this.dataTerminoBalanco = dataTerminoBalanco;
	}


	@Column(name="grupo_balanco", nullable=false)
	public int getGrupoBalanco() {
		return this.grupoBalanco;
	}

	public void setGrupoBalanco(int grupoBalanco) {
		this.grupoBalanco = grupoBalanco;
	}


	@Column(name="numero_estoque", nullable=false)
	public int getNumeroEstoque() {
		return this.numeroEstoque;
	}

	public void setNumeroEstoque(int numeroEstoque) {
		this.numeroEstoque = numeroEstoque;
	}


	@Column(name="qtde_contagem", nullable=false)
	public int getQtdeContagem() {
		return this.qtdeContagem;
	}

	public void setQtdeContagem(int qtdeContagem) {
		this.qtdeContagem = qtdeContagem;
	}


	@Column(name="status_balanco", nullable=false, length=1)
	public String getStatusBalanco() {
		return this.statusBalanco;
	}

	public void setStatusBalanco(String statusBalanco) {
		this.statusBalanco = statusBalanco;
	}


	//bi-directional many-to-one association to Empresa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="empresa_sq", nullable=false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	

	//bi-directional many-to-one association to BalancoContagem
	@OneToMany(mappedBy="balanco")
	public List<BalancoContagem> getBalancoContagems() {
		return this.balancoContagems;
	}

	public void setBalancoContagems(List<BalancoContagem> balancoContagems) {
		this.balancoContagems = balancoContagems;
	}
	
}