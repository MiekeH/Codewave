package be.intecbrussel.SchoolsOut_App.data;

import java.util.List;

import javax.persistence.EntityManager;

import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Grade;

public class GradeRepository {

	public static Grade insertNewGrade(Grade grade) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.persist(grade);
		em.getTransaction().commit();
		return new Grade();
	}

	
	public static Grade readGrade(Long index) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Grade grade = em.find(Grade.class,index);
		System.out.println(grade.toString());
		return grade;
		}


	public static Grade updateGrade(Grade grade) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.merge(grade);
		em.getTransaction().commit();
		return grade;
	}


	public static StringBuilder deleteGradeWithIndex(Long index) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Grade grade = em.find(Grade.class,index);
		em.getTransaction().begin();
		em.remove(grade);
		em.getTransaction().commit();
		StringBuilder sb = new StringBuilder();
		sb.append(grade);
		StringBuilder message = sb.append("you have deleted Userrecord with index" +index);
		return message;
		}


	public static List<Grade> AllGrades() {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		List<Grade> result = em.createQuery("from Grade", Grade.class).getResultList();
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		return result;
	}
		
	}

	

