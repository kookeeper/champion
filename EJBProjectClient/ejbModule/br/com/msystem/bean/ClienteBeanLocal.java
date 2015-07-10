package br.com.msystem.bean;

import javax.ejb.Local;

import br.com.msystem.entidade.Cliente;

@Local
public interface ClienteBeanLocal extends GenericBeanLocal<Cliente> {

	Cliente buscarPorCodigo(String cpf);

	Cliente criarCliente(String cpf);

}
