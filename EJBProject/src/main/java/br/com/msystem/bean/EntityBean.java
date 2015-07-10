package br.com.msystem.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * @generated DT_ID=none
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/EntityBean")
public class EntityBean
        implements EntityBeanLocal, EntityBeanRemote
{

    /**
     * @generated DT_ID=none
     */
    @PersistenceContext(unitName="EJBProject")
    private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public EntityBean() {
    }

    /**
     * @generated DT_ID=none
     */
    @SuppressWarnings("rawtypes")
	public List queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }

        List result = query.getResultList();
        return result;
    }

    /**
     * @generated DT_ID=none
     */
    public Object persist(Object registro) {
        em.persist(registro);
        return registro;
    }

    /**
     * @generated DT_ID=none
     */
    public Object merge(Object registro) {
        return em.merge(registro);
    }

    /**
     * @generated DT_ID=none
     */
    public void remove(Object registro) {
    	registro = em.merge(registro);
        em.remove(registro);
    }

}
