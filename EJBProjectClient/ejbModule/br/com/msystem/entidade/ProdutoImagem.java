package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the produto_imagem database table.
 * 
 */
@Entity
@Table(name="produto_imagem")
public class ProdutoImagem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int produtoImagemSq;
	private byte[] produtoImagem;
	private String produtoImagemUrl;
	private Produto produto;

    public ProdutoImagem() {
    }


	@Id
	@Column(name="produto_imagem_sq", unique=true, nullable=false)
	public int getProdutoImagemSq() {
		return this.produtoImagemSq;
	}

	public void setProdutoImagemSq(int produtoImagemSq) {
		this.produtoImagemSq = produtoImagemSq;
	}


    @Lob()
	@Column(name="produto_imagem")
	public byte[] getProdutoImagem() {
		return this.produtoImagem;
	}

	public void setProdutoImagem(byte[] produtoImagem) {
		this.produtoImagem = produtoImagem;
	}


	@Column(name="produto_imagem_url", length=500)
	public String getProdutoImagemUrl() {
		return this.produtoImagemUrl;
	}

	public void setProdutoImagemUrl(String produtoImagemUrl) {
		this.produtoImagemUrl = produtoImagemUrl;
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