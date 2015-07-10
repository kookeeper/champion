package br.com.msystem.bean;

import java.util.List;

import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface EntityBeanRemote
{

    /**
     * @generated DT_ID=none
     */
    List queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Object persist(Object registro);

    /**
     * @generated DT_ID=none
     */
    public Object merge(Object registro);

    /**
     * @generated DT_ID=none
     */
    public void remove(Object registro);

}
