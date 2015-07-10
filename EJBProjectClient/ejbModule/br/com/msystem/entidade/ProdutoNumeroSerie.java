package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the produto_numero_serie database table.
 * 
 */
@Entity
@Table(name="produto_numero_serie")
public class ProdutoNumeroSerie implements Serializable {
	private static final long serialVersionUID = 1L;
	private int produtoNumeroSerieSq;
	private Timestamp dataUltimaEntrada;
	private Timestamp dataUltimaSaida;
	private int numeroEstoque;
	private int numeroNfEnt;
	private String numeroSerie;
	private List<NfiscalItemSerie> nfiscaisItensSeries;
	private List<PedidoItemSerie> pedidosItensSeries;
	private Produto produto;

    public ProdutoNumeroSerie() {
    }


	@Id
	@Column(name="produto_numero_serie_sq", unique=true, nullable=false)
	public int getProdutoNumeroSerieSq() {
		return this.produtoNumeroSerieSq;
	}

	public void setProdutoNumeroSerieSq(int produtoNumeroSerieSq) {
		this.produtoNumeroSerieSq = produtoNumeroSerieSq;
	}


	@Column(name="data_ultima_entrada", nullable=false)
	public Timestamp getDataUltimaEntrada() {
		return this.dataUltimaEntrada;
	}

	public void setDataUltimaEntrada(Timestamp dataUltimaEntrada) {
		this.dataUltimaEntrada = dataUltimaEntrada;
	}


	@Column(name="data_ultima_saida")
	public Timestamp getDataUltimaSaida() {
		return this.dataUltimaSaida;
	}

	public void setDataUltimaSaida(Timestamp dataUltimaSaida) {
		this.dataUltimaSaida = dataUltimaSaida;
	}


	@Column(name="numero_estoque", nullable=false)
	public int getNumeroEstoque() {
		return this.numeroEstoque;
	}

	public void setNumeroEstoque(int numeroEstoque) {
		this.numeroEstoque = numeroEstoque;
	}


	@Column(name="numero_nf_ent")
	public int getNumeroNfEnt() {
		return this.numeroNfEnt;
	}

	public void setNumeroNfEnt(int numeroNfEnt) {
		this.numeroNfEnt = numeroNfEnt;
	}


	@Column(name="numero_serie", length=100)
	public String getNumeroSerie() {
		return this.numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}


	//bi-directional many-to-one association to NfiscaisItensSerie
	@OneToMany(mappedBy="produtoNumeroSerie")
	public List<NfiscalItemSerie> getNfiscaisItensSeries() {
		return this.nfiscaisItensSeries;
	}

	public void setNfiscaisItensSeries(List<NfiscalItemSerie> nfiscaisItensSeries) {
		this.nfiscaisItensSeries = nfiscaisItensSeries;
	}
	

	//bi-directional many-to-one association to PedidosItensSerie
	@OneToMany(mappedBy="produtoNumeroSerie")
	public List<PedidoItemSerie> getPedidosItensSeries() {
		return this.pedidosItensSeries;
	}

	public void setPedidosItensSeries(List<PedidoItemSerie> pedidosItensSeries) {
		this.pedidosItensSeries = pedidosItensSeries;
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