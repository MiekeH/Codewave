package be.intecbrussel.SchoolsOut_App;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Exam;
import be.intecbrussel.SchoolsOut_App.model.Gender;
import be.intecbrussel.SchoolsOut_App.model.Grade;
import be.intecbrussel.SchoolsOut_App.model.Person;
import be.intecbrussel.SchoolsOut_App.services.CourseServices;
import be.intecbrussel.SchoolsOut_App.services.ExamServices;
import be.intecbrussel.SchoolsOut_App.services.GradeServices;
import be.intecbrussel.SchoolsOut_App.services.PersonServices;
import be.intecbrussel.SchoolsOut_App.services.UserServices;

public class MainTest {

	public static void main(String[] args) {
		
		//Add User data to the table
		
		UserServices userServices = new UserServices();
		userServices.insertNewUser("briochingjkdjskqkjl","234",true,null);
		//userServices.readUser("1"); 
		userServices.updateUser("kikimanjkjkl", "shiiti", true, null);
		//userServices.deleteUser(User user);
		
		//Check table Course//add in Repository if null then create, else 
		CourseServices courseServices = new CourseServices();
		Course course1 = courseServices.insertNewCourse("Masterplan fundamentals", "return of the masterplan", "102", null, true, null);
		Course course2 = courseServices.insertNewCourse("Planning", "Why planning is important", "122", null, true, null);
		Course course3 = courseServices.insertNewCourse("Performance skills", "Why is important", "135", null, true, null);
		courseServices.printListAllCourses();
		
		courseServices.deleteCourseWithIndex((long) 5);
		courseServices.deleteCourseWithIndex((long) 7);
		
		//Check table Person// How to link ActiveCourse and COurseHistory???
				
		PersonServices personServices = new PersonServices();
		Person person3 = personServices.insertNewPerson("Maya", "Buzzy bee", Gender.FEMALE, course1);
		Person person5 = personServices.insertNewPerson("Mike", "Buzzy fly", Gender.MALE, course2);
		
		//cannot create wihth same course object? this two entries were not added to the database
		Person person6 = personServices.insertNewPerson("Mimi", "Buzzy dragon", Gender.FEMALE, course2);
		Person person7 = personServices.insertNewPerson("Mayioioa", "Buzzy mouse", Gender.FEMALE, course2);
		personServices.printListAllPerson();
		personServices.readPerson(3);
		personServices.updatePerson(3, "Miss MAYA", "BEEs family tree", Gender.FEMALE, course1);
		personServices.deletePerson(3);
		
		personServices.printListAllPerson();
		
		//cannot create details of exam,
		//then initialise as examgroup variable, then add subexams to specific table 
		ExamServices examServices = new ExamServices();
		Exam examgroup = examServices.insertExamDetailsToGroup("Society", "global implications", LocalDate.of(2020,9, 11), 87, 80, null);
		
		List<Exam> subExams = new ArrayList<>();
		//add subexams to group?
		Exam exam1 = examServices.insertExamSubExamstoList(examgroup);
				
		//to add exams to subexams? 
				
		
		GradeServices gradeServices = new GradeServices();
		Grade grade6 = gradeServices.insertNewGrade(person6, null, null, "Cum magma lauda", "Excellent", false, false, LocalDate.now());
		
		

	}

}
