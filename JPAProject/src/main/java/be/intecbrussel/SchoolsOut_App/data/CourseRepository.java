package be.intecbrussel.SchoolsOut_App.data;

import java.util.List;

import javax.persistence.EntityManager;

import be.intecbrussel.SchoolsOut_App.model.Course;


public class CourseRepository {
	public static Course insertNewCourse(Course course) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		return new Course();
	}
	
	public static Course readCourse (Long index){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Course course = em.find(Course.class,index);
		System.out.println(course.toString());
		return course;
	}
	
	
	public static Course updateCourse (Course course) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.merge(course);
		em.getTransaction().commit();
		return course;
	}
	
	public static StringBuilder deleteCourseWithIndex (Long index){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Course course= em.find(Course.class,index);
		em.getTransaction().begin();
		em.remove(course);
		em.getTransaction().commit();
		StringBuilder sb = new StringBuilder();
		sb.append(course);
		StringBuilder message = sb.append("you have deleted Userrecord with index" +index);
		return message;
		
	}
	
	public static List<Course> AllCourses() {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		List<Course> result = em.createQuery("from Course", Course.class).getResultList();
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		return result;
	}
	
	
}
