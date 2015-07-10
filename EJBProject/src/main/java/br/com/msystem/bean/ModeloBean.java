package br.com.msystem.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.msystem.entidade.Modelo;


/**
 * @generated DT_ID=none
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/ModeloBean")
public class ModeloBean
        implements ModeloBeanLocal, ModeloBeanRemote
{

    /**
     * @generated DT_ID=none
     */
    @PersistenceContext(unitName="EJBProject")
    private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public ModeloBean() {
    }

	public List<Node> listarTreeView() {
        Query query = em.createQuery("select m from Modelo m");

        @SuppressWarnings("unchecked")
		List<Modelo> listaModelo = query.getResultList();
        
		List<Node> listaNode = new ArrayList<Node>();
		
		for (Modelo modelo: listaModelo) {
			if (modelo.getModelo() != null)
				continue;

			Node node = new Node(modelo.getModeloSq(), modelo.getDescricaoModelo());
			adicionarFilhos(node, listaModelo, modelo.getModeloSq());

			listaNode.add(node);
		}

        return listaNode;
    }

	private void adicionarFilhos(Node nodePai, List<Modelo> listaModelo, int paiSq) {
		for (Modelo modelo: listaModelo) {
			if (modelo.getModelo() == null)
				continue;
			
			if (modelo.getModelo().getModeloSq() != paiSq)
				continue;
			
			Node node = new Node(modelo.getModeloSq(), modelo.getDescricaoModelo());
			adicionarFilhos(node, listaModelo, modelo.getModeloSq());

			nodePai.getChildren().add(node);
		}
	}

}
