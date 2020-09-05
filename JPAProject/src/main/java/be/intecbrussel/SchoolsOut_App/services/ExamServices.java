package be.intecbrussel.SchoolsOut_App.services;

import java.time.LocalDate;
import be.intecbrussel.SchoolsOut_App.data.ExamRepository;
import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Module;


public class ExamServices {
	
	
	public Exam insertNewExam(String name, String description, LocalDate date, int weight, int total, Module module) {
		Exam exam = new Exam().setName(name).setDescription(description).setDate(date).setWeight(weight).setTotal(total)
				.setModule(module);
		return ExamRepository.insertNewExam(exam);
	}

	public Exam readExam(Long index) {
		return ExamRepository.readExam(index);
	}

	public Exam updateExam(String name, String description, LocalDate date, int weight, int total, Module module) {
		Exam exam = new Exam().setName(name).setDescription(description).setDate(date).setWeight(weight).setTotal(total)
				.setModule(module);
		return ExamRepository.updateExam(exam);

	}

	public StringBuilder deleteExamWithIndex(Long index) {
		return ExamRepository.deleteExamWithIndex(index);
	}

	public void printListAllExams() {
		ExamRepository.AllExams().forEach(System.out::println);
	}

}
