package be.intecbrussel.DakPlusPlus_App.services;

import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import be.intecbrussel.DakPlusPlus_App.data.EmployeeDAO;
import be.intecbrussel.DakPlusPlus_App.model.Employee;


public class AccountingServices {
	private static EmployeeDAO employeeDao;
		
	public List<Employee> getListEmployees () throws SQLException {
		return employeeDao.getAllEmployees();
	}

	public Employee changeEmployeeData () throws SQLException, ParseException {
		UserInputServices userInput = new UserInputServices();
		int employeeId=userInput.askEmployeeId();
		String firstName = userInput.askfirstName();
		String lastName = userInput.askLastName();
		String phoneNumber = userInput.askPhoneNumber();
		String phoneNumber_ICE = userInput.askPhoneNumber_ICE();
		LocalDate dateOfBirth = userInput.askBirthDate();
		Double salaryMonth = userInput.askSalaryMonth();
			
	return employeeDao.updateEmployeeData(employeeId, firstName, lastName, 
			phoneNumber, phoneNumber_ICE,dateOfBirth,salaryMonth);
	
	}
	
	public Employee addEmployeeData () throws SQLException, ParseException {
		UserInputServices userInput = new UserInputServices();
  
		String firstName = userInput.askfirstName();
		String lastName = userInput.askLastName();
		String phoneNumber = userInput.askPhoneNumber();
		String phoneNumber_ICE = userInput.askPhoneNumber_ICE();
		LocalDate dateOfBirth = userInput.askBirthDate();
		Double salaryMonth = userInput.askSalaryMonth();
		return employeeDao.insertEmployeeData(firstName,lastName, phoneNumber,phoneNumber_ICE, dateOfBirth, salaryMonth);
				
	}
	
	public static int removeEmployeeData (int employeeID) throws SQLException  {
		return employeeDao.deleteEmployeeData(employeeID);
	}
	
	
	
}
