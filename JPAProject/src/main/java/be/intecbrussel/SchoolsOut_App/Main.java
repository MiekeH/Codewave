package be.intecbrussel.SchoolsOut_App;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Exam;
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

		UserServices userServices = new UserServices();
		userServices.insertNewUser("gio","234",true,null);
		userServices.readUser(5);
		userServices.updateUser("kik", "shiiti", true, null);
		userServices.deleteUser();
		
		PersonServices personServices = new PersonServices();
		
		
		ModuleServices moduleServices = new ModuleServices();
		
		
		ExamServices examServices = new ExamServices();
		
		
		CourseServices courseServices = new CourseServices();
		
		
		
		GradeServices gradeServices = new GradeServices();
		
		
		
		
		
		

		

	}

}
