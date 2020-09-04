package be.intecbrussel.SchoolsOut_App.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private String login;
	private String passwordhash;
	private boolean active;

	@OneToOne
	private Person person;

	public String getLogin() {
		return login;
	}

	public User setLogin(String login) {
		this.login = login;
		return this;
	}

	public String getPasswordhash() {
		return passwordhash;
	}

	public User setPasswordhash(String passwordhash) {
		this.passwordhash = passwordhash;
		return this;
	}

	public boolean isActive() {
		return active;
	}

	public User setActive(boolean active) {
		this.active = active;
		return this;
	}

	public Person getPerson() {
		return person;
	}

	public User setPerson(Person person) {
		this.person = person;
		return this;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", passwordhash=" + passwordhash + ", active=" + active + ", person=" + person
				+ "]";
	}
	
	
	
}
