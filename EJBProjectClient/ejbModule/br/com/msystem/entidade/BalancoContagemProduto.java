package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the balanco_contagem_produto database table.
 * 
 */
@Entity
@Table(name="balanco_contagem_produto")
public class BalancoContagemProduto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int balancoContagemProdutoSq;
	private int qtdeContada;
	private int qtdeEstoque;
	private BalancoContagem balancoContagem;
	private Produto produto;

    public BalancoContagemProduto() {
    }


	@Id
	@Column(name="balanco_contagem_produto_sq", unique=true, nullable=false)
	public int getBalancoContagemProdutoSq() {
		return this.balancoContagemProdutoSq;
	}

	public void setBalancoContagemProdutoSq(int balancoContagemProdutoSq) {
		this.balancoContagemProdutoSq = balancoContagemProdutoSq;
	}


	@Column(name="qtde_contada")
	public int getQtdeContada() {
		return this.qtdeContada;
	}

	public void setQtdeContada(int qtdeContada) {
		this.qtdeContada = qtdeContada;
	}


	@Column(name="qtde_estoque")
	public int getQtdeEstoque() {
		return this.qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}


	//bi-directional many-to-one association to BalancoContagem
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="balanco_contagem_sq", nullable=false)
	public BalancoContagem getBalancoContagem() {
		return this.balancoContagem;
	}

	public void setBalancoContagem(BalancoContagem balancoContagem) {
		this.balancoContagem = balancoContagem;
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