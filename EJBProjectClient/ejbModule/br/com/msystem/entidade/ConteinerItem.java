package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conteiner_itens database table.
 * 
 */
@Entity
@Table(name="conteiner_itens")
public class ConteinerItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int conteinerItemSq;
	private int quantidade;
	private Conteiner conteiner;
	private Produto produto;

    public ConteinerItem() {
    }


	@Id
	@Column(name="conteiner_item_sq", unique=true, nullable=false)
	public int getConteinerItemSq() {
		return this.conteinerItemSq;
	}

	public void setConteinerItemSq(int conteinerItemSq) {
		this.conteinerItemSq = conteinerItemSq;
	}


	@Column(nullable=false)
	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	//bi-directional many-to-one association to Conteiner
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="conteiner_sq", nullable=false)
	public Conteiner getConteiner() {
		return this.conteiner;
	}

	public void setConteiner(Conteiner conteiner) {
		this.conteiner = conteiner;
	}
	

	//bi-directional many-to-one association to Produto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="produto_sq", nullable=false)
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}