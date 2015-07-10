package br.com.msystem.bean;

import java.util.List;

import javax.ejb.Local;

import br.com.msystem.entidade.Produto;

@Local
public interface ProdutoBeanLocal extends GenericBeanLocal<Produto> {

	List<Produto> listarProdutoPorModelo(String listaModelo);

	List<Produto> listarProdutoPorCodigo(String codigoProduto);

	Produto buscarProduto(String codigoProduto);
}
