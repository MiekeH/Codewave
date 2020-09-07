package be.intecbrussel.SchoolsOut_App.services;

import java.time.LocalDate;
import java.util.List;

import be.intecbrussel.SchoolsOut_App.data.ExamRepository;
import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Module;


public class ExamServices {
	
	//check logic how to set up efficiently:
	
	public Exam insertExamDetailsToGroup(String name, String description, LocalDate date, int weight, int total, Module module) {
		Exam examGroup = new Exam().setName(name).setDescription(description).setDate(date).setWeight(weight).setTotal(total)
				.setModule(module);
		return ExamRepository.insertNewExam(examGroup);
	}
	
	//check to add subexams to the examGroup object and then to add to the List//
	public Exam insertExamSubExamstoList(Exam examGroup) {
		List<Exam> subExams= examGroup.setSubExams(subExams);
		return ExamRepository.insertNewExam(examGroup);
	}
	
	
	
	public Exam insertNewExam(String name, String description, LocalDate date, int weight, int total, Module module, Exam examGroup, List<Exam> subExams) {
		Exam exam = new Exam().setName(name).setDescription(description).setDate(date).setWeight(weight).setTotal(total)
				.setModule(module).setExamGroup(examGroup).setSubExams(subExams);
		return ExamRepository.insertNewExam(exam);
	}

	public Exam readExam(Long index) {
		return ExamRepository.readExam(index);
	}

	public Exam updateExam(String name, String description, LocalDate date, int weight, int total, Module module,Exam examGroup, List<Exam> subExams) {
		Exam exam = new Exam().setName(name).setDescription(description).setDate(date).setWeight(weight).setTotal(total)
				.setModule(module).setExamGroup(examGroup).setSubExams(subExams);
		return ExamRepository.updateExam(exam);

	}

	public StringBuilder deleteExamWithIndex(Long index) {
		return ExamRepository.deleteExamWithIndex(index);
	}

	public void printListAllExams() {
		ExamRepository.AllExams().forEach(System.out::println);
	}
	
	//NEW PART II Print all exams with subexams with grade (cascade to grade)
	public void printListAllExamsSubExams() {
		ExamRepository.AllExamsSubExams().forEach(System.out::println);
	}

}
