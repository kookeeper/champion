package br.com.msystem.bean;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.msystem.entidade.Cliente;

/**
 * Session Bean implementation class ClienteBean
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/ClienteBean")
public class ClienteBean extends GenericBean<Cliente> implements
		ClienteBeanRemote, ClienteBeanLocal {

	@EJB(mappedName = "ejb/EARProject/EJBProject/TransportadoraBean")
	TransportadoraBeanLocal transportadoraBean;

	/**
	 * @see GenericBean#GenericBean()
	 */
	public ClienteBean() {
		super();
	}

	@Override
	public Cliente buscarPorCodigo(String cpf) {
		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c where c.codigoCliente = :codigoCliente", Cliente.class);
		query.setParameter("codigoCliente", cpf);
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;	
		}
	}

	@Override
	public Cliente criarCliente(String cpf) {
		Cliente cliente = new Cliente();
		cliente.setCodigoCliente(cpf);
		cliente.setNomeCliente("Consumidor - " + cpf);
		cliente.setTransportadora(transportadoraBean.buscarTransportadoraPadrao());
		
		em.persist(cliente);
		return buscarPorCodigo(cpf);
	}
}