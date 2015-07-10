package br.com.msystem.bean;

import java.util.List;

import javax.ejb.Local;


/**
 * @generated DT_ID=none
 */
@Local
public interface EntityBeanLocal
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
