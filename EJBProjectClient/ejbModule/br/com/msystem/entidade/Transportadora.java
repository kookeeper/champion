package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the transportadoras database table.
 * 
 */
@Entity
@Table(name="transportadoras")
public class Transportadora implements Serializable {
	private static final long serialVersionUID = 1L;
	private int transportadoraSq;
	private String codigoTransportadora;
	private String complFone;
	private String dddFone;
	private String enderecoTransportadora;
	private String estadoTransportadora;
	private String inscrEstadual;
	private String municipioTransportadora;
	private String nomeTransportadora;
	private String numeroFone;
	private List<Cliente> clientes;
	private List<Nfiscal> nfiscais;
	private List<Pedido> pedidos;

    public Transportadora() {
    }


	@Id
	@Column(name="TRANSPORTADORA_SQ", unique=true, nullable=false)
	public int getTransportadoraSq() {
		return this.transportadoraSq;
	}

	public void setTransportadoraSq(int transportadoraSq) {
		this.transportadoraSq = transportadoraSq;
	}


	@Column(name="CODIGO_TRANSPORTADORA", nullable=false, length=15)
	public String getCodigoTransportadora() {
		return this.codigoTransportadora;
	}

	public void setCodigoTransportadora(String codigoTransportadora) {
		this.codigoTransportadora = codigoTransportadora;
	}


	@Column(name="COMPL_FONE", length=10)
	public String getComplFone() {
		return this.complFone;
	}

	public void setComplFone(String complFone) {
		this.complFone = complFone;
	}


	@Column(name="DDD_FONE", length=4)
	public String getDddFone() {
		return this.dddFone;
	}

	public void setDddFone(String dddFone) {
		this.dddFone = dddFone;
	}


	@Column(name="ENDERECO_TRANSPORTADORA", length=50)
	public String getEnderecoTransportadora() {
		return this.enderecoTransportadora;
	}

	public void setEnderecoTransportadora(String enderecoTransportadora) {
		this.enderecoTransportadora = enderecoTransportadora;
	}


	@Column(name="ESTADO_TRANSPORTADORA", length=2)
	public String getEstadoTransportadora() {
		return this.estadoTransportadora;
	}

	public void setEstadoTransportadora(String estadoTransportadora) {
		this.estadoTransportadora = estadoTransportadora;
	}


	@Column(name="INSCR_ESTADUAL", length=20)
	public String getInscrEstadual() {
		return this.inscrEstadual;
	}

	public void setInscrEstadual(String inscrEstadual) {
		this.inscrEstadual = inscrEstadual;
	}


	@Column(name="MUNICIPIO_TRANSPORTADORA", length=30)
	public String getMunicipioTransportadora() {
		return this.municipioTransportadora;
	}

	public void setMunicipioTransportadora(String municipioTransportadora) {
		this.municipioTransportadora = municipioTransportadora;
	}


	@Column(name="NOME_TRANSPORTADORA", length=50)
	public String getNomeTransportadora() {
		return this.nomeTransportadora;
	}

	public void setNomeTransportadora(String nomeTransportadora) {
		this.nomeTransportadora = nomeTransportadora;
	}


	@Column(name="NUMERO_FONE", length=15)
	public String getNumeroFone() {
		return this.numeroFone;
	}

	public void setNumeroFone(String numeroFone) {
		this.numeroFone = numeroFone;
	}


	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="transportadora")
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	

	//bi-directional many-to-one association to Nfiscai
	@OneToMany(mappedBy="transportadora")
	public List<Nfiscal> getNfiscais() {
		return this.nfiscais;
	}

	public void setNfiscais(List<Nfiscal> nfiscais) {
		this.nfiscais = nfiscais;
	}
	

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="transportadora")
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}