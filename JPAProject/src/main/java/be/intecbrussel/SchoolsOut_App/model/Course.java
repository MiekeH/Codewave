package be.intecbrussel.SchoolsOut_App.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Course {
@Id
@GeneratedValue
private Long id;
private String name;
@Lob
private String description;
private String code;
private String imageURL;
private boolean active;

//add fetch type eager, standard setting is lazy
@OneToMany(mappedBy ="course", fetch=FetchType.EAGER)
private List<Module> module;


public Long getId() {
	return id;
}

public Course setId(Long id) {
	this.id=id;
	return this;
}
public String getName() {
	return name;
}

public Course setName(String name) {
	this.name = name;
	return this;
}

public String getDescription() {
	return description;
}

public Course setDescription(String description) {
	this.description = description;
	return this;
}

public String getCode() {
	return code;
}

public Course setCode(String code) {
	this.code = code;
	return this;
}

public String getImageURL() {
	return imageURL;
}

public Course setImageURL(String imageURL) {
	this.imageURL = imageURL;
	return this;
}

public boolean isActive() {
	return active;
}

public Course setActive(boolean active) {
	//?? or make link here with Person course active
	this.active = active;
	return this;
}

public List<Module> getModule() {
	return module;
}

public Course setModule(List<Module> module) {
	this.module = module;
	return this;
}

@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", description=" + description + ", code=" + code + ", imageURL="
			+ imageURL + ", active=" + active + ", module=" + module + "]";
}





}
