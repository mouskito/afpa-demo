package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmailController {

	EntityManagerFactory emf;
	
	EntityManager em;
	
	public EmailController() {
		
		emf = Persistence.createEntityManagerFactory("afpa-demo");
		
		em =  emf.createEntityManager();
	}
	
	public void create(Email email) {
		em.getTransaction().begin();
		
		em.merge(email);
		
		 em.getTransaction().commit();
		 
		 em.close();
	}
}
