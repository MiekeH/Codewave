package be.intecbrussel.DakPlusPlus_App.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import be.intecbrussel.DakPlusPlus_App.data.ConnectionFactory;
import be.intecbrussel.DakPlusPlus_App.data.EmployeeDAO;
import be.intecbrussel.DakPlusPlus_App.model.Employee;
import be.intecbrussel.DakPlusPlus_App.model.Project;

public class SecretaryServices {
	static EmployeeDAO employeeDao = new EmployeeDAO();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public static List<Employee> getEmployeesAtWork(){
		return ((Employee) employeeDao.getAllEmployees()).isPresent();
	}
	
	public static void printEmployeesAtWork() {
		System.out.println(getEmployeesAtWork());
	}
	
	public static List<Employee> getBirthdayEmployees() {
		Stream<Employee> employeeBirthDay= employeeDao.getAllEmployees()
				.stream()
				.filter(x->x.employee.getDateOfBirth().toLocalDate() ==LocalDate.now());
						
	return employeeBirthDay;
	}
	
	public static void printBirthDayList() {
		System.out.println("Happy Birthday for following employee details:" + getBirthdayEmployees().toString());
	}

	public List<Employee> getBirthdayIn7DaysEmployees() {
		LocalDate nowDate = LocalDate.now();
		Employee employee = new Employee();
		//cast to Date of SQL?//birthday = (Date) sdf.parse(getInput())
		List<Employee> employeeBirthDay= 
				(List<Employee>) employeeDao.getAllEmployees()
				.stream()
				//.filter(x->x.ChronoUnit.DAYS.between(Date.valueOf(employee.getDateOfBirth()), nowDate) <= 7);
		
				.filter(x->x.employee.getDateOfBirth().toLocalDate().isAfter(LocalDate.now().plusDays(7)));
	return employeeBirthDay;
	}
      	
	
	public Employee getDetailsEmployees (String firstName,String lastName ) throws SQLException {
		
		Employee employee = new Employee();
		
		employeeDao.getAllEmployees()
		.stream()
		.filter(x->x.employee.getFirstName()==firstName)|| (employee.getLastName()==lastName))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}
	
	
	
}
