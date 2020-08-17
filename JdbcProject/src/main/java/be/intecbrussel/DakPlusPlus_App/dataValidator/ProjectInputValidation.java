package be.intecbrussel.DakPlusPlus_App.dataValidator;

import be.intecbrussel.DakPlusPlus_App.model.Project;

public class ProjectInputValidation {

	Project project = new Project();
		
	public boolean projectPriceIsValid() {
	if (project.getProjectPrice()<0) {
		System.out.println("ProjectPrice should be positive number");
	return false;
	}
	return true;
	}
	
	
	
}
