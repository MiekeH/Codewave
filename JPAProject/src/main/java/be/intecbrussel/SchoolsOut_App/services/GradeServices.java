package be.intecbrussel.SchoolsOut_App.services;

import java.math.BigDecimal;
import java.time.LocalDate;

import be.intecbrussel.SchoolsOut_App.data.CourseRepository;
import be.intecbrussel.SchoolsOut_App.data.GradeRepository;
import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Grade;
import be.intecbrussel.SchoolsOut_App.model.Person;

public class GradeServices {
	
	public Grade insertNewGrade(Person person, Exam exam, BigDecimal gradeValue, String comment, String internalComment, boolean absent, boolean postponed, LocalDate date) {
		Grade grade = new Grade()
				.setPerson(person)
				.setExam(exam)
				.setGradeValue(gradeValue)
				.setComment(internalComment).setInternalComment(internalComment).setAbsent(absent).setPostponed(postponed);
		return GradeRepository.insertNewGrade(grade);
	}

	public Grade readGrade(Long index) {
		return GradeRepository.readGrade(index);
	}

	public Grade updateExam(Person person, Exam exam, BigDecimal gradeValue, String comment, String internalComment, boolean absent, boolean postponed, LocalDate date) {
		Grade grade = new Grade()
				.setPerson(person)
				.setExam(exam)
				.setGradeValue(gradeValue)
				.setComment(internalComment).setInternalComment(internalComment).setAbsent(absent).setPostponed(postponed);
		
		return GradeRepository.updateGrade(grade);

	}

	public StringBuilder deleteGradeWithIndex(Long index) {
		return GradeRepository.deleteGradeWithIndex(index);
	}
	
	public void printListAllGrades() {
		GradeRepository.AllGrades().forEach(System.out::println);
	}

}
