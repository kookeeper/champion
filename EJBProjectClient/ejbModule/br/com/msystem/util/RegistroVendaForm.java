package br.com.msystem.util;

import java.math.BigDecimal;
import java.util.List;

import br.com.msystem.entidade.Produto;

public class RegistroVendaForm {

	private List<Produto> listaProduto;
	private String cpf;
	private BigDecimal vlrDesc;
	private Integer numeroComprovanteCartao;
	private Integer vendedorSq;
	private Integer condPagtoSq1;
	private Integer condPagtoSq2;
	private Integer condPagtoSq3;
	private BigDecimal vlrCondPagto1;
	private BigDecimal vlrCondPagto2;
	private BigDecimal vlrCondPagto3;

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public BigDecimal getVlrDesc() {
		return vlrDesc;
	}

	public void setVlrDesc(BigDecimal vlrDesc) {
		this.vlrDesc = vlrDesc;
	}

	public Integer getNumeroComprovanteCartao() {
		return numeroComprovanteCartao;
	}

	public void setNumeroComprovanteCartao(Integer numeroComprovanteCartao) {
		this.numeroComprovanteCartao = numeroComprovanteCartao;
	}

	public Integer getVendedorSq() {
		return vendedorSq;
	}

	public void setVendedorSq(Integer vendedorSq) {
		this.vendedorSq = vendedorSq;
	}

	public Integer getCondPagtoSq1() {
		return condPagtoSq1;
	}

	public void setCondPagtoSq1(Integer condPagtoSq1) {
		this.condPagtoSq1 = condPagtoSq1;
	}

	public Integer getCondPagtoSq2() {
		return condPagtoSq2;
	}

	public void setCondPagtoSq2(Integer condPagtoSq2) {
		this.condPagtoSq2 = condPagtoSq2;
	}

	public Integer getCondPagtoSq3() {
		return condPagtoSq3;
	}

	public void setCondPagtoSq3(Integer condPagtoSq3) {
		this.condPagtoSq3 = condPagtoSq3;
	}

	public BigDecimal getVlrCondPagto1() {
		return vlrCondPagto1;
	}

	public void setVlrCondPagto1(BigDecimal vlrCondPagto1) {
		this.vlrCondPagto1 = vlrCondPagto1;
	}

	public BigDecimal getVlrCondPagto2() {
		return vlrCondPagto2;
	}

	public void setVlrCondPagto2(BigDecimal vlrCondPagto2) {
		this.vlrCondPagto2 = vlrCondPagto2;
	}

	public BigDecimal getVlrCondPagto3() {
		return vlrCondPagto3;
	}

	public void setVlrCondPagto3(BigDecimal vlrCondPagto3) {
		this.vlrCondPagto3 = vlrCondPagto3;
	}

}