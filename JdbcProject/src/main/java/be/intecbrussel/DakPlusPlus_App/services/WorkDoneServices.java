package be.intecbrussel.DakPlusPlus_App.services;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import be.intecbrussel.DakPlusPlus_App.data.WorkDoneDAO;
import be.intecbrussel.DakPlusPlus_App.model.WorkDone;

public class WorkDoneServices {

	static WorkDoneDAO workDoneDao = new WorkDoneDAO();
	
	public List<WorkDone> getListProjectsEmployees () throws SQLException {
		return workDoneDao.getProjectsEmployees();
	}
	
	public WorkDone addWorkDoneData () throws SQLException {
		UserInputServices userInput = new UserInputServices();
		String remarks = userInput.requestWorkDoneRemarks();
		int projectId = userInput.requestProjectId(); 
		
		int hoursWorked = userInput.requestHoursWorked(projectId);
		LocalDate workDoneDate =userInput.requestWorkDoneDate();
		
		
		int employeeId = userInput.requestEmployeeId();
		return workDoneDao.insertData(workDoneDate,hoursWorked,remarks,projectId,employeeId);
	}
	

	public static int removeProjectData(int projectId) throws SQLException {
		return workDoneDao.deleteProjectData(projectId);
		
	}

	public List<WorkDone> getHoursWorkedEmployees() throws SQLException {
		return workDoneDao.getHoursWorkedEmployees();
	}
	
	
	
}
