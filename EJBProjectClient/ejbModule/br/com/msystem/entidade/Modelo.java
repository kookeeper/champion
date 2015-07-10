package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the modelos database table.
 * 
 */
@Entity
@Table(name="modelos")
public class Modelo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int modeloSq;
	private String codigoModelo;
	private String descricaoModelo;
	private Modelo modelo;
	private List<Modelo> modelos;
	private List<Produto> produtos;

    public Modelo() {
    }


	@Id
	@Column(name="MODELO_SQ", unique=true, nullable=false)
	public int getModeloSq() {
		return this.modeloSq;
	}

	public void setModeloSq(int modeloSq) {
		this.modeloSq = modeloSq;
	}


	@Column(name="CODIGO_MODELO", nullable=false, length=30)
	public String getCodigoModelo() {
		return this.codigoModelo;
	}

	public void setCodigoModelo(String codigoModelo) {
		this.codigoModelo = codigoModelo;
	}


	@Column(name="DESCRICAO_MODELO", nullable=false, length=200)
	public String getDescricaoModelo() {
		return this.descricaoModelo;
	}

	public void setDescricaoModelo(String descricaoModelo) {
		this.descricaoModelo = descricaoModelo;
	}


	//bi-directional many-to-one association to Modelo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MODELO_SQ_PAI")
	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	

	//bi-directional many-to-one association to Modelo
	@OneToMany(mappedBy="modelo")
	public List<Modelo> getModelos() {
		return this.modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}
	

	//bi-directional many-to-one association to Produto
	@OneToMany(mappedBy="modelo")
	public List<Produto> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}