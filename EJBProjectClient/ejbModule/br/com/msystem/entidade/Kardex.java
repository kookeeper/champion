package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the kardex database table.
 * 
 */
@Entity
@Table(name="kardex")
public class Kardex implements Serializable {
	private static final long serialVersionUID = 1L;
	private int kardexSq;
	private Timestamp data;
	private int nfiscal;
	private String nrSerie;
	private int numeroEstoque;
	private int qtde;
	private String tipoMov;
	private BigDecimal valor;
	private PedidoItem pedidosIten;
	private Produto produto;
	private Usuario usuario;

    public Kardex() {
    }


	@Id
	@Column(name="KARDEX_SQ", unique=true, nullable=false)
	public int getKardexSq() {
		return this.kardexSq;
	}

	public void setKardexSq(int kardexSq) {
		this.kardexSq = kardexSq;
	}


	@Column(nullable=false)
	public Timestamp getData() {
		return this.data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}


	public int getNfiscal() {
		return this.nfiscal;
	}

	public void setNfiscal(int nfiscal) {
		this.nfiscal = nfiscal;
	}


    @Lob()
	@Column(name="NR_SERIE")
	public String getNrSerie() {
		return this.nrSerie;
	}

	public void setNrSerie(String nrSerie) {
		this.nrSerie = nrSerie;
	}


	@Column(name="numero_estoque")
	public int getNumeroEstoque() {
		return this.numeroEstoque;
	}

	public void setNumeroEstoque(int numeroEstoque) {
		this.numeroEstoque = numeroEstoque;
	}


	public int getQtde() {
		return this.qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}


	@Column(name="TIPO_MOV", length=1)
	public String getTipoMov() {
		return this.tipoMov;
	}

	public void setTipoMov(String tipoMov) {
		this.tipoMov = tipoMov;
	}


	@Column(precision=10, scale=2)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	//bi-directional many-to-one association to PedidosIten
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pedido_item_sq")
	public PedidoItem getPedidosIten() {
		return this.pedidosIten;
	}

	public void setPedidosIten(PedidoItem pedidosIten) {
		this.pedidosIten = pedidosIten;
	}
	

	//bi-directional many-to-one association to Produto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRODUTO_SQ")
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USUARIO_SQ")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}