package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pedidos_itens_serie database table.
 * 
 */
@Entity
@Table(name="pedidos_itens_serie")
public class PedidoItemSerie implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pedidoItemSerieSq;
	private PedidoItem pedidosIten;
	private ProdutoNumeroSerie produtoNumeroSerie;

    public PedidoItemSerie() {
    }


	@Id
	@Column(name="pedido_item_serie_sq", unique=true, nullable=false)
	public int getPedidoItemSerieSq() {
		return this.pedidoItemSerieSq;
	}

	public void setPedidoItemSerieSq(int pedidoItemSerieSq) {
		this.pedidoItemSerieSq = pedidoItemSerieSq;
	}


	//bi-directional many-to-one association to PedidosIten
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pedido_item_sq", nullable=false)
	public PedidoItem getPedidosIten() {
		return this.pedidosIten;
	}

	public void setPedidosIten(PedidoItem pedidosIten) {
		this.pedidosIten = pedidosIten;
	}
	

	//bi-directional many-to-one association to ProdutoNumeroSerie
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="produto_numero_serie_sq", nullable=false)
	public ProdutoNumeroSerie getProdutoNumeroSerie() {
		return this.produtoNumeroSerie;
	}

	public void setProdutoNumeroSerie(ProdutoNumeroSerie produtoNumeroSerie) {
		this.produtoNumeroSerie = produtoNumeroSerie;
	}
	
}