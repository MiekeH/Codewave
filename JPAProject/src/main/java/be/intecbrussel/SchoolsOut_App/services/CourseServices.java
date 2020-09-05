package be.intecbrussel.SchoolsOut_App.services;

import java.util.List;
import be.intecbrussel.SchoolsOut_App.data.CourseRepository;
import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Module;

public class CourseServices {
		
	public Course insertNewCourse(String name, String description, String code, String imageURL, boolean active,
			List<Module> module) {
		Course course = new Course().setName(name).setDescription(description).setCode(code).setImageURL(imageURL)
				.setActive(active).setModule(module);
		return CourseRepository.insertNewCourse(course);
	}

	public Course readCourse(Long index) {
		return CourseRepository.readCourse(index);
	}

	public Course updateCourse(String name, String description, String code, String imageURL, boolean active,
			List<Module> module) {
		Course course = new Course().setName(name).setDescription(description).setCode(code).setImageURL(imageURL)
				.setActive(active).setModule(module);
		return CourseRepository.updateCourse(course);
	}

	public StringBuilder deleteCourseWithIndex(Long index) {
		return CourseRepository.deleteCourseWithIndex(index);
	}

	public void printListAllCourses() {
		CourseRepository.AllCourses().forEach(System.out::println);
	}

}
