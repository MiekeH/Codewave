package be.intecbrussel.SchoolsOut_App.data;

import java.util.List;

import javax.persistence.EntityManager;

import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Grade;


public class ExamRepository {
	public static Exam insertNewExam(Exam exam) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.persist(exam);
		em.getTransaction().commit();
		return new Exam();
	}
	
	public static Exam readExam (Long index){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Exam exam = em.find(Exam.class,index);
		System.out.println(exam.toString());
		return exam;
	}
	
	
	public static Exam updateExam(Exam exam) {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		em.getTransaction().begin();
		em.merge(exam);
		em.getTransaction().commit();
		return exam;
	}
	
	public static StringBuilder deleteExamWithIndex (Long index){
		EntityManager em = new EntityManagerProvider().getEntityManager();
		Exam exam = em.find(Exam.class,index);
		em.getTransaction().begin();
		em.remove(exam);
		em.getTransaction().commit();
		StringBuilder sb = new StringBuilder();
		sb.append(exam);
		StringBuilder message = sb.append("you have deleted Userrecord with index" +index);
		return message;
		
	}
	
	public static List<Exam> AllExams() {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		List<Exam> result = em.createQuery("from Exam", Exam.class).getResultList();
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		return result;
	}
	
	
	
	//NEW retrieve list of Exams and SubExams from Database
	public static List<Exam> AllExamsSubExams() {
		EntityManager em = new EntityManagerProvider().getEntityManager();
		//add if function empty list
		
		List<Exam> result1 = em.createQuery("from Exam", Exam.class).getResultList();
		List<Exam> result2 = em.createQuery("from Exam_Exam",Exam.class).getResultList();
		//check empty list
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		return result1;
	}


	
	
	
	
}
