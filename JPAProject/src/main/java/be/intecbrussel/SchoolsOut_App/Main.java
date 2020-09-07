package be.intecbrussel.SchoolsOut_App;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Gender;
import be.intecbrussel.SchoolsOut_App.model.Grade;
import be.intecbrussel.SchoolsOut_App.model.Person;
import be.intecbrussel.SchoolsOut_App.model.User;
import be.intecbrussel.SchoolsOut_App.services.CourseServices;
import be.intecbrussel.SchoolsOut_App.services.ExamServices;
import be.intecbrussel.SchoolsOut_App.services.GradeServices;
import be.intecbrussel.SchoolsOut_App.services.ModuleServices;
import be.intecbrussel.SchoolsOut_App.services.PersonServices;
import be.intecbrussel.SchoolsOut_App.services.UserServices;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		//MH COMMENTS: PART I & PART II
		//Functionality works with Database: 
		//check LoB function, size annotation to description to increase to 2000 characters
		//check Module() java annotation?naming convention
		//Crossreference objects into the different methods, added cascade option in Person entity with Course entity - this works but not entirely 
		//Updating data into the database - should this be done through id or by updating, current method results into new id in the database
		//CHECK relationship Person onetoMany or ManyToMany for courseHistory
					
		//not sure how to cross reference the objects in SQL-added cascade in Person entity to ensure course object is cascaded, but error received on detached entity

	
	
		ExamServices examServices = new ExamServices();
		Exam exam1 = examServices.insertNewExam("Society", "global implications", LocalDate.of(2020,9, 11), 87, 80, null, null, null);
		examServices.printListAllExams();
		
		
		examServices.printListAllExamsSubExams();
		examServices.deleteExamWithIndex((long) 5);
		
		//CHECK - ERROR-naming convention Module constructor
		//ModuleServices moduleServices = new ModuleServices();
		//Module module1 = moduleServices.insertNewModule("Management skills", "Communication Competencies Coding", "101", exams);
		
		
		
		
		
		
		
		
		

		

	}

}
