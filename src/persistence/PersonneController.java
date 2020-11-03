package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonneController {
	
	EntityManagerFactory emf;
	
	EntityManager em;
	
	public PersonneController() {
		
		emf = Persistence.createEntityManagerFactory("afpa-demo");
		
		em =  emf.createEntityManager();
	}
	
	public void create(Personne personne) {
		em.getTransaction().begin();
		
		em.merge(personne);
		 em.getTransaction().commit();
		 
		 em.close();
	}
	
	public void list() {
		
		
		List<Personne> personnes = em.createQuery("from Personne", Personne.class).getResultList();
		
			for(Personne personne: personnes) {
				System.out.println("Nom" + personne.getNom());
				System.out.println("Prénom" + personne.getPrenom());
			}
		}
}
