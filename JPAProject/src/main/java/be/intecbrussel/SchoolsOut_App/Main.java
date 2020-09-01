package be.intecbrussel.SchoolsOut_App;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Person;
import be.intecbrussel.SchoolsOut_App.model.User;


public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		
//		em.getTransaction().commit();
//		
//		em.close();
//		emf.close();
		
		
		
		User user = new User().setLogin("name");
		Person person = new Person().setFirstName("charles").setFamilyName("caps");
		Course course = new Course().setName("physic").setCode("24");
		Exam exam = new Exam().setDescription("Exam PartI");
		
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(user);
		em.persist(person);
		em.persist(course);
		em.persist(exam);
		et.commit();
		
		emf.close();
		
		//find data
		
		
		//delete entries
		//message message = em.find(Product.class, 2)
		//em.getTransaction§).begin();
		//em.remove(message);
		//em.getTransaction().commit();
		
		

	}

}
