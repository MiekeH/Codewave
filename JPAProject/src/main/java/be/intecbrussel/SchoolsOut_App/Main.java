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
				
//		Course course1 = new Course();
//		Course course2 = new Course();
//		course1.setName("shrinkthis").setDescription("Pschycdelic brains exercising").setCode("345").setActive(true).setImageURL("httpsps");
//		course2.setName("shrinkthistopicinyourbrains").setDescription("Brain drain exercising").setCode("346").setActive(true).setImageURL("httpspsjilllm");
		
		
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
		personServices.printListAllPerson();
		
		
		//check cascading also to add course1 to the person entities
		Person person5 = personServices.insertNewPerson("Mike", "Buzzy fly", Gender.MALE, course1);
		Person person6 = personServices.insertNewPerson("Mimi", "Buzzy dragon", Gender.FEMALE, course1);
		Person person7 = personServices.insertNewPerson("Mayioioa", "Buzzy mouse", Gender.FEMALE, course1);
		//this coding does not work, as entity detached? error?
				
		personServices.readPerson(2);
		Thread.sleep(5000);
		
		
		//check update will be done through new index is this correct?
		personServices.updatePerson(2, "Miss MAYA", "BEEs family tree", Gender.FEMALE, course1);
		personServices.deletePerson(2);
		
		//check how to call up Long id
		//courseServices.deleteCourseWithIndex(1);
		
//		Exam exam1 = new Exam().
//		Exam examGroup1 = new Exam().setExamGroup(exam1);
//		
	
		ExamServices examServices = new ExamServices();
		Exam exam1 = examServices.insertNewExam("Society", "global implications", LocalDate.of(2020,9, 11), 87, 80, null, null, null);
		examServices.printListAllExams();
		
		
		examServices.printListAllExamsSubExams();
		examServices.deleteExamWithIndex((long) 5);
		
		//CHECK - ERROR-naming convention Module constructor
		//ModuleServices moduleServices = new ModuleServices();
		//Module module1 = moduleServices.insertNewModule("Management skills", "Communication Competencies Coding", "101", exams);
		
		
		//check parsing bigdecimal how to write and covert back SQL to BigInt	
		GradeServices gradeServices = new GradeServices();
		Grade grade = gradeServices.insertNewGrade(person6, exam1,null, "Cum magma lauda", "Excellent", false, false, LocalDate.now());
		
		
		
		
		
		

		

	}

}
