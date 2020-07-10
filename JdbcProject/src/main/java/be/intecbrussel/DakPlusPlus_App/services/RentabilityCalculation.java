package be.intecbrussel.DakPlusPlus_App.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.intecbrussel.DakPlusPlus_App.data.EmployeeDAO;
import be.intecbrussel.DakPlusPlus_App.data.ProjectDAO;
import be.intecbrussel.DakPlusPlus_App.data.RentabilityDAO;
import be.intecbrussel.DakPlusPlus_App.model.Project;

public class RentabilityCalculation {
	static RentabilityDAO rentabilityDao = new RentabilityDAO();
	static EmployeeDAO employeeDao = new EmployeeDAO();
	static ProjectDAO projectDao = new ProjectDAO();
	static Project project = new Project();
	
	int workDaysPerMonth = 22;
	int workHoursperWeek = 40;
	int workHoursperDay = 8;
	
	
	public List<Project> getRentabilityProjects() throws SQLException {
		List<Project> rentabilityList = new ArrayList<>();
		
		rentabilityDao.getPriceperProject();
		rentabilityDao.getHoursperProjectperEmployee();
		rentabilityDao.getSalaryperProjectperEmployee();
		double salaryMonth;
		int hoursWorked;
		
		double salaryDay = salaryMonth/workDaysPerMonth;
		double salaryHour = salaryDay/workHoursPerDay;
		double totalCostProject = (hoursWorked * salaryHour);
		double totalPriceProject = rentabilityDao.getPriceperProject().
		double rentability = totalPriceProject - totalCostProject;
		
		rentabilityList.add(totalPriceProject,totalCostProject);
		
		return rentabilityList;
	}

	
}
