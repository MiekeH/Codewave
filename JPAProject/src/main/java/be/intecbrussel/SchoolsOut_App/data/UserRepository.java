package be.intecbrussel.SchoolsOut_App.data;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import be.intecbrussel.SchoolsOut_App.model.Person;
import be.intecbrussel.SchoolsOut_App.model.User;

public class UserRepository {
	//want to know which method below or combined option with static reference and link to services)
	public User insertNewUser(String login, String passwordhash, boolean active, Person person) throws SQLException {
		//pick up the connection from EMF
		EntityManager em = new EntityManagerProvider().getEntityManager();
					
		//instance of user entity
		User newUser = new User().setLogin(login).setPasswordhash(passwordhash).setActive(true).setPerson(person);
		//persist and commit to the database
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(newUser);
		et.commit();
		return newUser;
	}
	
	//option 2 link with services
	public static User insertNewUser(User user) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		return new User();
	}
	
	public static User readUser (String login){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		User user = em.find(User.class,login);
		System.out.println(user.toString());
		return user;
	}
	
	
	public static User updateUser(User user) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		return user;
	}
	
	public StringBuilder deleteUserWithIndex (String login){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		User user = em.find(User.class,login);
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		StringBuilder sb = new StringBuilder();
		sb.append(user);
		StringBuilder message = sb.append("you have deleted Userrecord with index" +login);
		return message;
		
	}
	
	
	public static User deleteUser (User user){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		em.close();
		return user;
		
	}
	
	
	public static List<User>AllUsers(){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		List<User> result = em.createQuery( "from User", User.class).getResultList();
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		return result;
	}
	    
	    
	    
	
	
	
}
	
	

