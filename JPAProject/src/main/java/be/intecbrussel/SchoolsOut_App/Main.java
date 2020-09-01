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

		//tables were created, removed create in persistence file, but tables were created without the relationships set up properly, cannot set up or update
		//get error on duplicate primary key, would need to drop the tables and recreate, or update//
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
		EntityManager em = emf.createEntityManager();
		
		User user = new User().setLogin("name");
		Person person = new Person().setFirstName("charles").setFamilyName("caps");
		Course course = new Course().setName("physic").setCode("24");
		//check naming convention? Module as name exists in JavaModule module = new Module().
		Exam exam = new Exam().setDescription("Exam PartI");
		
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(user);
		em.persist(person);
	
		em.persist(course);
		em.persist(exam);
		et.commit();
		
		

	}

}
