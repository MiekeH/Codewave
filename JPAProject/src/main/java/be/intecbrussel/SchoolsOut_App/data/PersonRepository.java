package be.intecbrussel.SchoolsOut_App.data;

import java.util.List;

import javax.persistence.EntityManager;

import be.intecbrussel.SchoolsOut_App.model.Person;

public class PersonRepository {

	public static Person insertNewPerson(Person person) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		return new Person();
	}

	public static Person readPerson(Integer index) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Person person = em.find(Person.class, index);
		System.out.println(person.toString());
		return person;
	}

	public static Person updatePerson(Person person) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.merge(person);
		em.getTransaction().commit();
		return person;
	}

	public static StringBuilder deletePersonWithIndex(Integer index) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Person person = em.find(Person.class, index);
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		StringBuilder sb = new StringBuilder();
		sb.append(person);
		StringBuilder message = sb.append("you have deleted record with index" + index);
		return message;

	}

	public static List<Person> AllPersons() {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		List<Person> result = em.createQuery("from Person", Person.class).getResultList();
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		return result;
	}

}

	
