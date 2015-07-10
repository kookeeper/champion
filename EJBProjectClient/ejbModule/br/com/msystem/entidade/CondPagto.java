package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cond_pagto database table.
 * 
 */
@Entity
@Table(name="cond_pagto")
public class CondPagto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int condPagtoSq;
	private int codigoCondPagto;
	private int d00;
	private int d01;
	private int d02;
	private int d03;
	private int d04;
	private int d05;
	private int d06;
	private int d07;
	private int d08;
	private int d09;
	private String descricaoCondPagto;
	private int p00;
	private int p01;
	private int p02;
	private int p03;
	private int p04;
	private int p05;
	private int p06;
	private int p07;
	private int p08;
	private int p09;
	private int parcelas;
	private List<Assistencia> assistencias;
	private List<Nfiscal> nfiscais;
	private List<Pedido> pedidos;

    public CondPagto() {
    }

    public CondPagto(int condPagtoSq, int codigoCondPagto, String descricaoCondPagto) {
    	this.condPagtoSq = condPagtoSq;
    	this.codigoCondPagto = codigoCondPagto;
    	this.descricaoCondPagto = descricaoCondPagto;
    }

	@Id
	@Column(name="COND_PAGTO_SQ", unique=true, nullable=false)
	public int getCondPagtoSq() {
		return this.condPagtoSq;
	}

	public void setCondPagtoSq(int condPagtoSq) {
		this.condPagtoSq = condPagtoSq;
	}


	@Column(name="CODIGO_COND_PAGTO", nullable=false)
	public int getCodigoCondPagto() {
		return this.codigoCondPagto;
	}

	public void setCodigoCondPagto(int codigoCondPagto) {
		this.codigoCondPagto = codigoCondPagto;
	}


	public int getD00() {
		return this.d00;
	}

	public void setD00(int d00) {
		this.d00 = d00;
	}


	public int getD01() {
		return this.d01;
	}

	public void setD01(int d01) {
		this.d01 = d01;
	}


	public int getD02() {
		return this.d02;
	}

	public void setD02(int d02) {
		this.d02 = d02;
	}


	public int getD03() {
		return this.d03;
	}

	public void setD03(int d03) {
		this.d03 = d03;
	}


	public int getD04() {
		return this.d04;
	}

	public void setD04(int d04) {
		this.d04 = d04;
	}


	public int getD05() {
		return this.d05;
	}

	public void setD05(int d05) {
		this.d05 = d05;
	}


	public int getD06() {
		return this.d06;
	}

	public void setD06(int d06) {
		this.d06 = d06;
	}


	public int getD07() {
		return this.d07;
	}

	public void setD07(int d07) {
		this.d07 = d07;
	}


	public int getD08() {
		return this.d08;
	}

	public void setD08(int d08) {
		this.d08 = d08;
	}


	public int getD09() {
		return this.d09;
	}

	public void setD09(int d09) {
		this.d09 = d09;
	}


	@Column(name="DESCRICAO_COND_PAGTO", nullable=false, length=50)
	public String getDescricaoCondPagto() {
		return this.descricaoCondPagto;
	}

	public void setDescricaoCondPagto(String descricaoCondPagto) {
		this.descricaoCondPagto = descricaoCondPagto;
	}


	public int getP00() {
		return this.p00;
	}

	public void setP00(int p00) {
		this.p00 = p00;
	}


	public int getP01() {
		return this.p01;
	}

	public void setP01(int p01) {
		this.p01 = p01;
	}


	public int getP02() {
		return this.p02;
	}

	public void setP02(int p02) {
		this.p02 = p02;
	}


	public int getP03() {
		return this.p03;
	}

	public void setP03(int p03) {
		this.p03 = p03;
	}


	public int getP04() {
		return this.p04;
	}

	public void setP04(int p04) {
		this.p04 = p04;
	}


	public int getP05() {
		return this.p05;
	}

	public void setP05(int p05) {
		this.p05 = p05;
	}


	public int getP06() {
		return this.p06;
	}

	public void setP06(int p06) {
		this.p06 = p06;
	}


	public int getP07() {
		return this.p07;
	}

	public void setP07(int p07) {
		this.p07 = p07;
	}


	public int getP08() {
		return this.p08;
	}

	public void setP08(int p08) {
		this.p08 = p08;
	}


	public int getP09() {
		return this.p09;
	}

	public void setP09(int p09) {
		this.p09 = p09;
	}


	@Column(nullable=false)
	public int getParcelas() {
		return this.parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}


	//bi-directional many-to-one association to Assistencia
	@OneToMany(mappedBy="condPagto")
	public List<Assistencia> getAssistencias() {
		return this.assistencias;
	}

	public void setAssistencias(List<Assistencia> assistencias) {
		this.assistencias = assistencias;
	}
	

	//bi-directional many-to-one association to Nfiscai
	@OneToMany(mappedBy="condPagto")
	public List<Nfiscal> getNfiscais() {
		return this.nfiscais;
	}

	public void setNfiscais(List<Nfiscal> nfiscais) {
		this.nfiscais = nfiscais;
	}
	

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="condPagto")
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}