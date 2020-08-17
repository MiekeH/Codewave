package be.intecbrussel.DakPlusPlus_App.services;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import be.intecbrussel.DakPlusPlus_App.dataValidator.EmployeeInputValidation;
import be.intecbrussel.DakPlusPlus_App.dataValidator.ProjectInputValidation;
import be.intecbrussel.DakPlusPlus_App.dataValidator.WorkDoneInputValidation;

public class UserInputServices {
	public UserInputServices () {
		
	}
		
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
	EmployeeInputValidation employeeInputDataChecks = new EmployeeInputValidation();
	ProjectInputValidation projectInputDataChecks = new ProjectInputValidation();
	WorkDoneInputValidation workDoneInputDataChecks = new WorkDoneInputValidation();
			
	public int askEmployeeId() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employeeId");
		int employeeId = keyboard.nextInt();
		return employeeId;
	}

	public String askfirstName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee firstName");
		String firstName = keyboard.nextLine();
		
		//move to validator package firstNameIsValid()
		while (firstName.isEmpty() || firstName == null) {
			System.out.println("you need to enter the employee's firstName");
			firstName = keyboard.nextLine();
		}
		
		return firstName;
	}

	public String askLastName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee LastName");
		String lastName = keyboard.nextLine();

		//move to validator package lastNameIsValid()
		while (lastName.isEmpty() || lastName == null) {
		System.out.println("you need to enter an employee Last Name");
		lastName = keyboard.nextLine();
		}
		
		return lastName;
	}

	public String askPhoneNumber() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee Fixed PhoneNumber starting with 0");
		String PhoneNumber = keyboard.nextLine();
		
		//move to validator package phoneNumberIsValid()
//		while (employeeInputDataChecks.phoneNumberIsValid()) {
//			PhoneNumber = keyboard.nextLine();
//		}
//		return PhoneNumber;

		while (!PhoneNumber.startsWith("0") && PhoneNumber.length() <=9) {
			System.out.println("you need to enter a valid phoneNumber with 10 digits starting with 0");
			PhoneNumber = keyboard.nextLine();
		}
		return PhoneNumber;
	}

	public String askPhoneNumber_ICE() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee Emergency PhoneNumber with 9 digits starting with 0");
		String PhoneNumber_ICE = keyboard.nextLine();
		
		//move to validator package phoneNumber_ICEIsValid()
		if (!PhoneNumber_ICE.startsWith("0") && PhoneNumber_ICE.length() == 10) {
			System.out.println("you need to enter a valid phoneNumber with 10 digits starting with 0");
			PhoneNumber_ICE = keyboard.nextLine();
		}
		
		return PhoneNumber_ICE;
	}

	public double askSalaryMonth() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee salary data");
		double salaryMonth = keyboard.nextDouble();

		//move to validator salaryIsValid()
		while (salaryMonth <= 0) {
			System.out.println("you need to enter a positive salary Month amount");
			salaryMonth = keyboard.nextDouble();
		}
		return salaryMonth;
	}

	public LocalDate askBirthDate() throws ParseException {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the BirthDate with format YYYY-MM-DD");
		String date = keyboard.nextLine();
		
		//move to validator birthDateIsValid()
		LocalDate d = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		if(d.isBefore(LocalDate.now().minusMonths(18*12))) {
		System.out.println("The birthdate of the employee is invalid, please re-enter");
		date = keyboard.nextLine();
		}
		return d; 
	}
	
	
	public double requestProjectPrice() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter project price");
        double inputProjectPrice = scanner.nextDouble();
       
//        if (projectInputDataChecks.projectPriceIsValid()) {
//        	inputProjectPrice = scanner.nextDouble();
//        }
        if (inputProjectPrice <=0) {
        System.out.println("Please enter a new price, not valid");
        inputProjectPrice = scanner.nextDouble();
		} 
        
        return inputProjectPrice;	
	}
   
   
	public LocalDate requestProjectStartDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter project start date with format YYYY-MM-DD");
		String inputStartDate = scanner.next();
		LocalDate d = LocalDate.parse(inputStartDate, DateTimeFormatter.ISO_LOCAL_DATE);   
        return d;
              
	}

	public LocalDate requestProjectEndDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter projectExpectedEndDate with format YYYY-MM-DD");
        String inputEndDate = scanner.next();
        LocalDate d = LocalDate.parse(inputEndDate, DateTimeFormatter.ISO_LOCAL_DATE); 
        
        //move to validator
        if(d.isBefore(requestProjectStartDate())) {
        	System.out.println("End date should be after the project start date, please re-enter");
        	inputEndDate = scanner.next();
        }
        
        return d;
      
               
	}
		
	public String requestProjectDescription() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter description");
        String inputDescription = scanner.nextLine();
        return inputDescription;
	}
	
	
	public LocalDate requestWorkDoneDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter project workDoneDate with format YYYY-MM-DD");
        String workDoneDate = scanner.next();
        LocalDate d = LocalDate.parse(workDoneDate, DateTimeFormatter.ISO_LOCAL_DATE);
        return d;
      
               
	}
	
	public String requestWorkDoneRemarks() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter description remarks");
        String inputRemarks = scanner.nextLine();
        return inputRemarks;
	}
	
	public int requestHoursWorked(int projectId) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter project hours");
        int inputHoursWorked = scanner.nextInt();
        
        //move to validator 
        if (inputHoursWorked <=0) {
        System.out.println("Please enter valid hours worked for project");
        inputHoursWorked = scanner.nextInt();
		} 
        return inputHoursWorked;	
	}
	
	
	public int requestProjectId() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter project id");
        int projectId= scanner.nextInt();
		return projectId;
	}


	public int requestEmployeeId() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id");
        int employeeId= scanner.nextInt();
		return employeeId;
	}


	
}
