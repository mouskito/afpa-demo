package persistence;

import java.io.Serializable;

import javax.persistence.*;

@Entity @Table(name="email")
public class Email implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="personne", nullable = true)
	private Personne personne;

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Email(String email, Personne personne) {
		super();
		this.email = email;
		this.personne = personne;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + ", personne=" + personne + "]";
	}
}
