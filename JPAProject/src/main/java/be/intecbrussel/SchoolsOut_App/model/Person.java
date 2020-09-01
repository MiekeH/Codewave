package be.intecbrussel.SchoolsOut_App.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String familyName;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	//@ManyToOne(mappedBy="person")
	private Course course;
	
	public Integer getId() {
		return id;
	}
	
	public Person setId(Integer id) {
		this.id=id;
		return this;
	}
		
	public String getFirstName() {
		return firstName;
	}
	
	public Person setFirstName(String firstName) {
		this.firstName=firstName;
		return this;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public Person setFamilyName(String familyName) {
		this.familyName=familyName;
		return this;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public Person setGender(Gender gender) {
		this.gender=gender;
		return this;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public Person setCourse(Course course) {
		this.course=course;
		return this;
	}
	
}
