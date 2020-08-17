package be.intecbrussel.DakPlusPlus_App.dataValidator;

import java.time.LocalDate;

import be.intecbrussel.DakPlusPlus_App.model.Employee;

public class EmployeeInputValidation {

	//not sure how to link back with userInputServices? does not work//TESTING
	
	protected final static int LENGTH_PHONENUMBER_ICE =9;
	protected final static int LENGTH_PHONENUMBER =10;
	
	static Employee employee = new Employee();
	
	public static boolean firstNameIsValid() {
		if (employee.getFirstName().isEmpty() || employee.getFirstName() == null) {
			System.out.println("you need to enter the employee's first Name");
		return false;
		}
		return true;

	}

	public static boolean lastNameIsValid() {
		if (employee.getLastName().isEmpty() || employee.getLastName() == null) {
			System.out.println("you need to enter the employee's Last Name");
		return false;
		}
		return true;
	}
	
	public boolean phoneNumberIsValid() {
		if ((!(employee.getPhoneNumber().length() == (LENGTH_PHONENUMBER)))
				|| (!employee.getPhoneNumber().startsWith("0"))) {
			System.out.println("Phone number is not valid, should start with 0 and contains 10 digits");
		return false;
		}
		return true;
	}
	
	public boolean phoneNumber_ICEIsValid() {
		if (!employee.getPhoneNumber_ICE().startsWith("0") && (!(employee.getPhoneNumber_ICE().length() == LENGTH_PHONENUMBER_ICE))) {
			System.out.println("you need to enter a valid phoneNumber with 10 digits starting with 0");
		return false;
		}
		return true;
	}
	
	public boolean salaryIsValid() {
		if(employee.getSalaryMonth()<0) {
		System.out.println("Salary is invalid; you need to enter a positive salary Month amount");
		return false;
		}
		return true;
	}
	
	public boolean birthDateIsValid() {
		if(!employee.getDateOfBirth().isBefore(LocalDate.now().minusMonths(18*12))) {
			System.out.println("Invalid birthdate, employee is too young, should be >=18 years");
			return false;
		}
		return true;
	}

		
		
	}
	
	
	
	
	

