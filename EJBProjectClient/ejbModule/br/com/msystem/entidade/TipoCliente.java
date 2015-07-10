package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_cliente database table.
 * 
 */
@Entity
@Table(name="tipo_cliente")
public class TipoCliente implements Serializable {
	private static final long serialVersionUID = 1L;
	private int tipoClienteSq;
	private String descricaoTipo;
	private List<Cliente> clientes;

    public TipoCliente() {
    }


	@Id
	@Column(name="tipo_cliente_sq", unique=true, nullable=false)
	public int getTipoClienteSq() {
		return this.tipoClienteSq;
	}

	public void setTipoClienteSq(int tipoClienteSq) {
		this.tipoClienteSq = tipoClienteSq;
	}


	@Column(name="descricao_tipo", nullable=false, length=100)
	public String getDescricaoTipo() {
		return this.descricaoTipo;
	}

	public void setDescricaoTipo(String descricaoTipo) {
		this.descricaoTipo = descricaoTipo;
	}


	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="tipoCliente")
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}