package persistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table(name="role")
public class Role {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	public Role(String name) {
		super();
		this.name = name;
	}

	@ManyToMany(mappedBy = "roles")
	private List<Personne> users;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int id, String name, List<Personne> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
	}

	public Role(String name, List<Personne> users) {
		super();
		this.name = name;
		this.users = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Personne> getUsers() {
		return users;
	}

	public void setUsers(List<Personne> users) {
		this.users = users;
	}
}
