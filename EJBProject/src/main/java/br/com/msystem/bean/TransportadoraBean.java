package br.com.msystem.bean;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.msystem.entidade.Transportadora;

/**
 * Session Bean implementation class TransportadoraBean
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/TransportadoraBean")
public class TransportadoraBean extends GenericBean<Transportadora> implements TransportadoraBeanRemote, TransportadoraBeanLocal {

    /**
     * Default constructor. 
     */
    public TransportadoraBean() {
    }

    @Override
    public Transportadora buscarTransportadoraPadrao() {
		TypedQuery<Transportadora> query = em.createQuery("select t from Transportadora t where t.codigoTransportadora = :codigoTransportadora", Transportadora.class);
		query.setParameter("codigoTransportadora", "");
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;	
		}
    }
}
