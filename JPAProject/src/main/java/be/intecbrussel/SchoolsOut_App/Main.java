package be.intecbrussel.SchoolsOut_App;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Gender;
import be.intecbrussel.SchoolsOut_App.model.Person;
import be.intecbrussel.SchoolsOut_App.model.User;
import be.intecbrussel.SchoolsOut_App.services.CourseServices;
import be.intecbrussel.SchoolsOut_App.services.ExamServices;
import be.intecbrussel.SchoolsOut_App.services.GradeServices;
import be.intecbrussel.SchoolsOut_App.services.ModuleServices;
import be.intecbrussel.SchoolsOut_App.services.PersonServices;
import be.intecbrussel.SchoolsOut_App.services.UserServices;


public class Main {

	public static void main(String[] args) {
		//MH COMMENTS:
		//Functionality works with Database: 
		//Crossreference objects into the different methods, added cascade option in Person entity with Course entity - this works but not entirely 
		//Updating data into the database - should this be done through id or by updating, current method results into new id in the database
		//Naming convention for module to be added new annotation as Constructor New Module() does not work because of naming convention in Java
		//Detailed testing below
		
//		Course course1 = new Course();
//		Course course2 = new Course();
//		course1.setName("shrinkthis").setDescription("Pschycdelic brains exercising").setCode("345").setActive(true).setImageURL("httpsps");
//		course2.setName("shrinkthistopicinyourbrains").setDescription("Brain drain exercising").setCode("346").setActive(true).setImageURL("httpspsjilllm");
		
		//check how to set up Module, should rename??? 
//		Module module1 = new module();
//		module1.
		
		UserServices userServices = new UserServices();
		userServices.insertNewUser("brioching","234",true,null);
		
		//userServices.readUser("1"); 
		userServices.updateUser("kikiman", "shiiti", true, null);
		//userServices.deleteUser(User user);
		
		CourseServices courseServices = new CourseServices();
		Course course1 = courseServices.insertNewCourse("Masterplan fundamentals", "return of the masterplan", "102", null, true, null);
		courseServices.printListAllCourses();
		
		
		//not sure how to cross reference the objects in SQL-added cascade in Person entity to ensure course object is cascaded, but error received on detached entity
		PersonServices personServices = new PersonServices();
		personServices.insertNewPerson("Maya", "Buzzy bee", Gender.FEMALE, course1);
		
		//this coding does not work, as entity detached? error?
		//personServices.insertNewPerson("Maya2", "Buzzy bee2", Gender.FEMALE, course1);
			
		personServices.readPerson(2);
		
		//check update will be done through new index is this correct?
		personServices.updatePerson(2, "Miss MAYA", "BEEs family tree", Gender.FEMALE, course1);
		personServices.deletePerson(2);
		
		//check how to call up Long id
		//courseServices.deleteCourseWithIndex(1);
		
		ExamServices examServices = new ExamServices();
		Exam exams = examServices.insertNewExam(null, null, LocalDate.now(), 23, 99, null);	
		examServices.deleteExamWithIndex((long) 5);
		
		//CHECK - ERROR-naming convention Module constructor
		ModuleServices moduleServices = new ModuleServices();
		//Module module1 = moduleServices.insertNewModule("Management skills", "Communication Competencies Coding", "101", exams);
		
		
				
		GradeServices gradeServices = new GradeServices();
		
		
		
		
		
		

		

	}

}
