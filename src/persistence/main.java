package persistence;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personne = new Personne();
		
		personne.setNom("Camara");
		
		personne.setPrenom("Moussa");
		
		
		PersonneController pers_cont = new PersonneController();
		
		//pers_cont.create(personne);
		
		pers_cont.list();
		
		
		System.out.println("---------------- MANY TO ONE ---------------------------");
		
		Personne test = new Personne();
			
		test.setNom("camata");
		
		test.setPrenom("prenom");
		
		
		Email email = new Email();
		
		email.setEmail("test@afpa.fr");
		
		email.setPersonne(test);
		
		System.out.println(email);
		
		EmailController email_cont = new EmailController();
		
		email_cont.create(email);
		
		
		System.out.println("---------------- MANY TO MANY ---------------------------");
		
		Role role = new Role();
		role.setName("Admin");
		
		List<Role> listRole = new ArrayList<Role>();

		listRole.add(role);
		
		test.setRoles(listRole);
		
		
		PersonneController pers_cont2 = new PersonneController();
		
		pers_cont2.create(test);
		

	}

}
