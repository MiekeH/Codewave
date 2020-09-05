package be.intecbrussel.SchoolsOut_App.services;

import be.intecbrussel.SchoolsOut_App.data.UserRepository;
import be.intecbrussel.SchoolsOut_App.model.Person;
import be.intecbrussel.SchoolsOut_App.model.User;

public class UserServices {

	public User insertNewUser(String login, String passwordhash, boolean active, Person person) {
		User user = new User().setLogin(login).setPasswordhash(passwordhash).setActive(active).setPerson(person);
		return UserRepository.insertNewUser(user);
	}

	public User readUser(String login) {
		return UserRepository.readUser(login);
	}

	public User updateUser(String login, String passwordhash, boolean active, Person person) {
		User user = new User().setLogin(login).setPasswordhash(passwordhash).setActive(active).setPerson(person);
		return UserRepository.updateUser(user);
	}

	public User deleteUser(User user) {
		return UserRepository.deleteUser(user);
	}

	public void printListAllusers() {
		UserRepository.AllUsers().forEach(System.out::println);
	}
	
	
}
