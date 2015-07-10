package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the linha database table.
 * 
 */
@Entity
@Table(name="linha")
public class Linha implements Serializable {
	private static final long serialVersionUID = 1L;
	private int linhaSq;
	private String descricaoLinha;
	private String exclusiva;
	private List<Nfiscal> nfiscais;
	private List<Pedido> pedidos;
	private List<Produto> produtos;

    public Linha() {
    }


	@Id
	@Column(name="linha_sq", unique=true, nullable=false)
	public int getLinhaSq() {
		return this.linhaSq;
	}

	public void setLinhaSq(int linhaSq) {
		this.linhaSq = linhaSq;
	}


	@Column(name="descricao_linha", length=50)
	public String getDescricaoLinha() {
		return this.descricaoLinha;
	}

	public void setDescricaoLinha(String descricaoLinha) {
		this.descricaoLinha = descricaoLinha;
	}


	@Column(length=1)
	public String getExclusiva() {
		return this.exclusiva;
	}

	public void setExclusiva(String exclusiva) {
		this.exclusiva = exclusiva;
	}


	//bi-directional many-to-one association to Nfiscai
	@OneToMany(mappedBy="linha")
	public List<Nfiscal> getNfiscais() {
		return this.nfiscais;
	}

	public void setNfiscais(List<Nfiscal> nfiscais) {
		this.nfiscais = nfiscais;
	}
	

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="linha")
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	

	//bi-directional many-to-one association to Produto
	@OneToMany(mappedBy="linha")
	public List<Produto> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}