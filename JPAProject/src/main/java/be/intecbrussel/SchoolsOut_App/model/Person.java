package be.intecbrussel.SchoolsOut_App.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String familyName;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	private Course courseActive;
	
	//check if oneToMany
	@ManyToMany
	List<Course> courseHistory;
	
	
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
		return courseActive;
	}
	
	public Person setCourse(Course courseActive) {
		//add ? statement link with Course entity for active boolean ==true
		Course course = new Course().setActive(true);
		this.courseActive=courseActive;
		return this;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", familyName=" + familyName + ", gender=" + gender
				+ ", course=" + courseActive + "]";
	}
	
	
	
	
}
