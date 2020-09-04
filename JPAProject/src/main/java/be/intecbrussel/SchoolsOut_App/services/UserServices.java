package be.intecbrussel.SchoolsOut_App.services;

import be.intecbrussel.SchoolsOut_App.data.UserRepository;
import be.intecbrussel.SchoolsOut_App.model.Person;
import be.intecbrussel.SchoolsOut_App.model.User;

public class UserServices {

	public  User insertNewUser(String login, String passwordhash, boolean active,Person person)  {
        User user=new User()
        .setLogin(login)
        .setPasswordhash(passwordhash)
        .setActive(active)
        .setPerson(person);
        return UserRepository.insertNewUser(user);
	}
	
	public User readUser(int index) {
		return UserRepository.readUser(index);
	}
	
	public User updateUser(String login, String passwordhash, boolean active,Person person) {
		User user = new User()
			.setLogin(login)
			.setPasswordhash(passwordhash)
			.setActive(active)
			.setPerson(person);
		return UserRepository.updateUser(user);
	}
	
	
	
	public  User deleteUser()  {
        //how to find details to delete?
		
		User user=new User()
        .setLogin("vgift")
        .setPasswordhash("gyuft")
        .setActive(true)
        .setPerson(null);
        return UserRepository.deleteUser(user);
	}
	
	//should be static to UserRepository allUserslist or just by creating an instance of UserRepository?
	public void printListAllusers() {
		UserRepository.AllUsers().forEach(System.out::println);
	}
	
	
}
