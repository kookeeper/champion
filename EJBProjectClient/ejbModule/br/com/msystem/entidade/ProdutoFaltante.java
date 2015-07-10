package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the produtos_faltantes database table.
 * 
 */
@Entity
@Table(name="produtos_faltantes")
public class ProdutoFaltante implements Serializable {
	private static final long serialVersionUID = 1L;
	private int produtoFaltanteSq;
	private Timestamp dataProdutoFaltante;
	private int qtdeProdutoFaltante;
	private Cliente cliente;
	private NfEntrada nfEntrada;
	private Produto produto;

    public ProdutoFaltante() {
    }


	@Id
	@Column(name="produto_faltante_sq", unique=true, nullable=false)
	public int getProdutoFaltanteSq() {
		return this.produtoFaltanteSq;
	}

	public void setProdutoFaltanteSq(int produtoFaltanteSq) {
		this.produtoFaltanteSq = produtoFaltanteSq;
	}


	@Column(name="data_produto_faltante", nullable=false)
	public Timestamp getDataProdutoFaltante() {
		return this.dataProdutoFaltante;
	}

	public void setDataProdutoFaltante(Timestamp dataProdutoFaltante) {
		this.dataProdutoFaltante = dataProdutoFaltante;
	}


	@Column(name="qtde_produto_faltante", nullable=false)
	public int getQtdeProdutoFaltante() {
		return this.qtdeProdutoFaltante;
	}

	public void setQtdeProdutoFaltante(int qtdeProdutoFaltante) {
		this.qtdeProdutoFaltante = qtdeProdutoFaltante;
	}


	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cliente_sq")
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	//bi-directional many-to-one association to NfEntrada
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="nf_entrada_sq")
	public NfEntrada getNfEntrada() {
		return this.nfEntrada;
	}

	public void setNfEntrada(NfEntrada nfEntrada) {
		this.nfEntrada = nfEntrada;
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