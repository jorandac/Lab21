package co.grandcircus.coffeeshoplab19;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository 
@Transactional 
public class CoffeeShopHibernateItemDao {
	
	@PersistenceContext 
	private EntityManager em; 
 
	public List<Item> findAll(){
		List<Item> items = em.createQuery("FROM Item", Item.class).getResultList();
		return items;
       }
}