package br.com.msystem.bean;

import javax.ejb.Remote;

import br.com.msystem.entidade.Natureza;

@Remote
public interface NaturezaBeanRemote extends GenericBeanRemote<Natureza> {

}
