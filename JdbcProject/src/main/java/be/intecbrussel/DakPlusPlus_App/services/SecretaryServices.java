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
	
	public static List<Employee> getEmployeesAtWork() throws SQLException{
		return ((Employee) employeeDao.getAllEmployees()).isPresent();
	}
	
	public static void printEmployeesAtWork() throws SQLException {
		System.out.println(getEmployeesAtWork());
	}
	
	//CHECK STREAMS FUNCTIONALITY/
	public static List<Employee> getBirthdayEmployees() {
		List<Employee> employeeBirthDay= employeeDao.getAllEmployees()
				.stream()
				.filter(x->x.getDateOfBirth() == LocalDate.now()
				.collect(Collectors.toList());
						
	return employeeBirthDay;
	}
	
	//CHECK STREAMS FUNCTIONALITY/
	public List<Employee> getBirthdayIn7DaysEmployees() throws SQLException {
		LocalDate nowDate = LocalDate.now();
		Employee employee = new Employee();
		//.filter(x->x.ChronoUnit.DAYS.between((employee.getDateOfBirth()),nowDate) <= 7));
		
		List<Employee> employeeBirthDay = employeeDao.getAllEmployees()
			.stream()
			.filter(x->x.getDateOfBirth().isAfter(LocalDate.now().plusDays(7))
			.collect(Collectors.toList()).forEach(System.out::println));
	
	return employeeBirthDay;
	}
      	
	public static void printBirthDayList() {
		System.out.println("Happy Birthday for following employee details:" + getBirthdayEmployees().toString());
	}

	public static void getDetailsEmployees(String firstName, String lastName) throws SQLException {
		Employee employee = new Employee();

		employeeDao.getAllEmployees().stream()
				.filter(x -> x.getFirstName() == firstName || (employee.getLastName() == lastName))
				.collect(Collectors.toList()).forEach(System.out::println);

	}
	
	
	
}
