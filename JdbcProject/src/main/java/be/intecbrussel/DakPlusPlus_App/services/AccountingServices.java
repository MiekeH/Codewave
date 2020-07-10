package be.intecbrussel.DakPlusPlus_App.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import be.intecbrussel.DakPlusPlus_App.data.EmployeeDAO;
import be.intecbrussel.DakPlusPlus_App.model.Employee;


public class AccountingServices {
	private static EmployeeDAO employeeDao;
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	
	private static String getInput() {
     String userInput;
     try {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  userInput = br.readLine();
      }catch(Exception e) {
    return  null;}
    return userInput;
	 }
	
	
	public List<Employee> getListEmployees () throws SQLException {
		return employeeDao.getAllEmployees();
	}

	public static List<Employee> changeEmployeeData () throws SQLException {
	return employeeDao.updateEmployeeData(employeeId, firstName, lastName, 
			phoneNumber, phoneNumber_ICE,dateOfBirth,salaryMonth);
	
	}
	
	public Employee addEmployeeData () throws SQLException {
		//Employee employeeNew = new Employee();
		
		System.out.println("Enter employeeID");
		
		int employeeId = Integer.parseInt(getInput());
		System.out.println("Enter Employee first Name :");
		String firstName = getInput(); 
		while (firstName.isEmpty()|| firstName==null) {
			System.out.println("Wrong entry-please enter ");
				firstName = getInput();
				
			}
		
        System.out.println("Enter Employee last Name :");
        String lastName = getInput();
        
        System.out.println("Enter Employee fixed phone number :");
        String phoneNumber = getInput();
     
        
        System.out.println("Enter Employee mobile phone_ICE :");
        String phoneNumber_ICE = getInput();
        Date birthday;
		
        //employeeNew.getDateOfBirth().isBefore(LocalDate.now().minusMonths(18*12));
        
        try {
			birthday = (Date) sdf.parse(getInput());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
            
        System.out.println(" Employee Date of Birth (MM-DD-YYYY) : ");
        System.out.println("Enter Employee salary (month) :");
        
        Double salaryMonth = Double.parseDouble(getInput());
              
        if (salaryMonth < 0) {
        	System.out.println("Salary should be positive figure, please insert new number");
        };
		
		return employeeDao.insertEmployeeData(firstName,lastName, phoneNumber,phoneNumber_ICE, birthday, salaryMonth);
		
		
	}
	

	public static int removeEmployeeData (int employeeID) throws SQLException  {
		return employeeDao.deleteEmployeeData(employeeID);
	}
	
	
	
}
