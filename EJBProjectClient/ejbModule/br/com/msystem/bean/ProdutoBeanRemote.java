package br.com.msystem.bean;

import java.util.List;

import javax.ejb.Remote;

import br.com.msystem.entidade.Produto;

@Remote
public interface ProdutoBeanRemote extends GenericBeanRemote<Produto> {

	List<Produto> listarProdutoPorModelo(String listaModelo);

	List<Produto> listarProdutoPorCodigo(String codigoProduto);

}
