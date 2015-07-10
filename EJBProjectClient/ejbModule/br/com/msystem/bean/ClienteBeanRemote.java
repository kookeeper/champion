package br.com.msystem.bean;

import javax.ejb.Remote;

import br.com.msystem.entidade.Cliente;

@Remote
public interface ClienteBeanRemote extends GenericBeanRemote<Cliente> {

	Cliente buscarPorCodigo(String cpf);

	Cliente criarCliente(String cpf);

}
