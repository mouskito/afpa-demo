package persistence;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personne = new Personne();
		
		personne.setNom("Camara");
		
		personne.setPrenom("Moussa");
		
		
		PersonneController pers_cont = new PersonneController();
		
		//pers_cont.create(personne);
		
		pers_cont.list();

	}

}
