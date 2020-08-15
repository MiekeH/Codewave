package be.intecbrussel.DakPlusPlus_App.services;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;


import be.intecbrussel.DakPlusPlus_App.data.ProjectDAO;
import be.intecbrussel.DakPlusPlus_App.model.Project;

public class ProjectServices {
	static ProjectDAO projectDao = new ProjectDAO();
	static Project project = new Project();
	
	public List<Project> getListCurrentProjects () throws SQLException {
		return projectDao.getAllCurrentProjects();
	}

	public static List<Project> getListNewProjects () throws SQLException {
		return projectDao.getProjectsStartingNow();
		}
		
	public Project addProjectData () throws SQLException {
		UserInputServices userInput = new UserInputServices();
		String description = userInput.requestProjectDescription();
		double projectPrice = userInput.requestProjectPrice();
		LocalDate projectStartDate =userInput.requestProjectStartDate();
		LocalDate projectExpectedEndDate = userInput.requestProjectEndDate();
		
		return projectDao.insertProjectData(projectStartDate,description,projectPrice,projectExpectedEndDate);
	}
	

	public static int removeProjectData(int projectId) throws SQLException {
		return projectDao.deleteProjectData(projectId);
		
	}
}
