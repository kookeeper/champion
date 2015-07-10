package br.com.msystem.bean;

import javax.ejb.Local;

import br.com.msystem.entidade.Transportadora;

@Local
public interface TransportadoraBeanLocal extends GenericBeanLocal<Transportadora> {

	Transportadora buscarTransportadoraPadrao();

}
