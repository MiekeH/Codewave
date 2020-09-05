package be.intecbrussel.SchoolsOut_App.services;

import be.intecbrussel.SchoolsOut_App.data.PersonRepository;
import be.intecbrussel.SchoolsOut_App.data.UserRepository;
import be.intecbrussel.SchoolsOut_App.model.Course;
import be.intecbrussel.SchoolsOut_App.model.Gender;
import be.intecbrussel.SchoolsOut_App.model.Person;
import be.intecbrussel.SchoolsOut_App.model.User;

public class PersonServices {
	public Person insertNewPerson(String firstName, String familyName, Gender gender, Course course) {
		Person person = new Person().setFirstName(firstName).setFamilyName(familyName).setGender(gender)
				.setCourse(course);
		return PersonRepository.insertNewPerson(person);
	}

	public Person readPerson(Integer index) {
		return PersonRepository.readPerson(index);
	}

	public Person updatePerson(Integer id, String firstName, String familyName, Gender gender, Course course) {
		// check if correct? should be getid and then update the persons details?
		Person personToUpdate = new Person().setFirstName(firstName).setFamilyName(familyName).setGender(gender)
				.setCourse(course);
		return PersonRepository.updatePerson(personToUpdate);
	}

	public StringBuilder deletePerson(Integer index) {
		return PersonRepository.deletePersonWithIndex(index);
	}

	public void printListAllPerson() {
		PersonRepository.AllPersons().forEach(System.out::println);
		
	}

}
