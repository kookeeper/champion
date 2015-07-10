package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the fornecedor database table.
 * 
 */
@Entity
@Table(name="fornecedor")
public class Fornecedor implements Serializable {
	private static final long serialVersionUID = 1L;
	private int fornecedorSq;
	private String bairro;
	private String celular;
	private String cep;
	private String cidade;
	private String cnpjFornecedor;
	private String complemento;
	private String contato;
	private String eMail;
	private String estado;
	private String inscrEstadual;
	private String inscrMunicipal;
	private String logradouro;
	private String nomeFornecedor;
	private String numero;
	private String observacao;
	private String pais;
	private String telefone;
	private List<ContaPagar> contasPagars;

    public Fornecedor() {
    }


	@Id
	@Column(name="fornecedor_sq", unique=true, nullable=false)
	public int getFornecedorSq() {
		return this.fornecedorSq;
	}

	public void setFornecedorSq(int fornecedorSq) {
		this.fornecedorSq = fornecedorSq;
	}


	@Column(length=30)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	@Column(length=50)
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}


	@Column(length=8)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}


	@Column(length=30)
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	@Column(name="cnpj_fornecedor", nullable=false, length=15)
	public String getCnpjFornecedor() {
		return this.cnpjFornecedor;
	}

	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}


	@Column(length=50)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	@Column(length=50)
	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}


	@Column(name="e_mail", length=100)
	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}


	@Column(length=2)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Column(name="inscr_estadual", length=20)
	public String getInscrEstadual() {
		return this.inscrEstadual;
	}

	public void setInscrEstadual(String inscrEstadual) {
		this.inscrEstadual = inscrEstadual;
	}


	@Column(name="inscr_municipal", length=20)
	public String getInscrMunicipal() {
		return this.inscrMunicipal;
	}

	public void setInscrMunicipal(String inscrMunicipal) {
		this.inscrMunicipal = inscrMunicipal;
	}


	@Column(length=50)
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	@Column(name="nome_fornecedor", nullable=false, length=50)
	public String getNomeFornecedor() {
		return this.nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}


	@Column(length=20)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


    @Lob()
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(length=50)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


	@Column(length=50)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	//bi-directional many-to-one association to ContasPagar
	@OneToMany(mappedBy="fornecedor")
	public List<ContaPagar> getContasPagars() {
		return this.contasPagars;
	}

	public void setContasPagars(List<ContaPagar> contasPagars) {
		this.contasPagars = contasPagars;
	}
	
}