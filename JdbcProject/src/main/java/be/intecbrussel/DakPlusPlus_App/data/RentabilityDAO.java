package be.intecbrussel.DakPlusPlus_App.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import be.intecbrussel.DakPlusPlus_App.model.Employee;
import be.intecbrussel.DakPlusPlus_App.model.Project;
import be.intecbrussel.DakPlusPlus_App.model.WorkDone;

public class RentabilityDAO {
	public List<Project> getPriceperProject() throws SQLException {
		List<Project> listOfProjects = new ArrayList<>();
		Connection connection = ConnectionFactory.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT price FROM Project");
		
		while (rs.next()) {
			Project project = new Project();
			project.setProjectId(rs.getInt("project_id"));
			project.setProjectPrice(rs.getDouble("price"));
			listOfProjects.add(project);
		}
		return listOfProjects;
		
	}
	
	public List<WorkDone> getHoursperProjectperEmployee() throws SQLException {
		List<WorkDone> listOfHoursProject = new ArrayList<>();
		Connection connection = ConnectionFactory.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT hoursWorked FROM WorkDone");
		
		while (rs.next()) {
			WorkDone workDone = new WorkDone();
			workDone.setProjectId(rs.getInt("project_id"));
			workDone.setHoursWorked(rs.getInt("hoursWorked"));
			listOfHoursProject.add(workDone);
		}
		return listOfHoursProject;
		
	}
	
	public List<Employee> getSalaryperProjectperEmployee() throws SQLException {
		List<Employee> listOfSalaryEmployee = new ArrayList<>();
		Connection connection = ConnectionFactory.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT salaryMonth FROM Employee");
		
		while (rs.next()) {
			Employee employeeSalary = new Employee();
			employeeSalary.setEmployeeId(rs.getInt("employee_id"));
			employeeSalary.setSalaryMonth(rs.getDouble("salaryMonth"));
			listOfSalaryEmployee.add(employeeSalary);
		}
		return listOfSalaryEmployee;
		
	}
	

	
	
	
	
}


