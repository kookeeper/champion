package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the rma_item database table.
 * 
 */
@Entity
@Table(name="rma_item")
public class RmaItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int rmaItemSq;
	private String acessorioProduto;
	private Timestamp dataRetornoProduto;
	private String defeitoProduto;
	private String finalizacaoProduto;
	private int nfDevolucaoProduto;
	private String nrSerieProduto;
	private int qtdeProduto;
	private BigDecimal vlrUnitProduto;
	private Produto produto;
	private Rma rma;

    public RmaItem() {
    }


	@Id
	@Column(name="rma_item_sq", unique=true, nullable=false)
	public int getRmaItemSq() {
		return this.rmaItemSq;
	}

	public void setRmaItemSq(int rmaItemSq) {
		this.rmaItemSq = rmaItemSq;
	}


	@Column(name="acessorio_produto", length=100)
	public String getAcessorioProduto() {
		return this.acessorioProduto;
	}

	public void setAcessorioProduto(String acessorioProduto) {
		this.acessorioProduto = acessorioProduto;
	}


	@Column(name="data_retorno_produto")
	public Timestamp getDataRetornoProduto() {
		return this.dataRetornoProduto;
	}

	public void setDataRetornoProduto(Timestamp dataRetornoProduto) {
		this.dataRetornoProduto = dataRetornoProduto;
	}


	@Column(name="defeito_produto", length=100)
	public String getDefeitoProduto() {
		return this.defeitoProduto;
	}

	public void setDefeitoProduto(String defeitoProduto) {
		this.defeitoProduto = defeitoProduto;
	}


	@Column(name="finalizacao_produto", length=100)
	public String getFinalizacaoProduto() {
		return this.finalizacaoProduto;
	}

	public void setFinalizacaoProduto(String finalizacaoProduto) {
		this.finalizacaoProduto = finalizacaoProduto;
	}


	@Column(name="nf_devolucao_produto")
	public int getNfDevolucaoProduto() {
		return this.nfDevolucaoProduto;
	}

	public void setNfDevolucaoProduto(int nfDevolucaoProduto) {
		this.nfDevolucaoProduto = nfDevolucaoProduto;
	}


	@Column(name="nr_serie_produto", length=100)
	public String getNrSerieProduto() {
		return this.nrSerieProduto;
	}

	public void setNrSerieProduto(String nrSerieProduto) {
		this.nrSerieProduto = nrSerieProduto;
	}


	@Column(name="qtde_produto", nullable=false)
	public int getQtdeProduto() {
		return this.qtdeProduto;
	}

	public void setQtdeProduto(int qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}


	@Column(name="vlr_unit_produto", precision=10, scale=2)
	public BigDecimal getVlrUnitProduto() {
		return this.vlrUnitProduto;
	}

	public void setVlrUnitProduto(BigDecimal vlrUnitProduto) {
		this.vlrUnitProduto = vlrUnitProduto;
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
	

	//bi-directional many-to-one association to Rma
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rma_sq", nullable=false)
	public Rma getRma() {
		return this.rma;
	}

	public void setRma(Rma rma) {
		this.rma = rma;
	}
	
}