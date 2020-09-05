package be.intecbrussel.SchoolsOut_App.services;

import java.util.List;
import be.intecbrussel.SchoolsOut_App.data.ModuleRepository;
import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Exam;



public class ModuleServices {
	
	public Module insertNewModule(String name, String description, Course course,List<Exam> exams)  {
       Module module = new Module().setName(name).setDescription(description).setCourse(course).setExam(exams);
       return ModuleRepository.insertNewModule(module);
	}
	
	public Module readModule(Long index) {
		return ModuleRepository.readModule(index);
	}
	
	public Module updateModule(String name, String description, Course course,List<Exam> exams){
		Module module = new Module().setName(name).setDescription(description).setCourse(course).setExam(exams);
	       return ModuleRepository.updateModule(module);
		
	}
			
	public StringBuilder deleteModule(Long index)  {
          return ModuleRepository.deleteModuleWithIndex(index);
	}
	
	public void printListAllModules() {
		ModuleRepository.AllModules().forEach(System.out::println);
	}
	
}
