package be.intecbrussel.DakPlusPlus_App.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class UserInputServices {
	public UserInputServices () {
		
	}
	
	
	public int askEmployeeId() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employeeId");
		int employeeId = keyboard.nextInt();
		keyboard.close();
		return employeeId;

	}

	public String askfirstName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee firstName");
		String firstName = keyboard.nextLine();

		if (firstName.isEmpty() || firstName == null) {
			System.out.println("you need to enter an employee firstName");
		}
		keyboard.close();
		return firstName;
	}

	public String askLastName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee LastName");
		String lastName = keyboard.nextLine();

		if (lastName.isEmpty() || lastName == null) {
			System.out.println("you need to enter an employee Last Name");
		}
		keyboard.close();
		return lastName;
	}

	public String askPhoneNumber() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee Fixed PhoneNumber");
		String PhoneNumber = keyboard.nextLine();

		if (!PhoneNumber.startsWith("0") || PhoneNumber.length() <= 9) {
			System.out.println("you need to enter a phoneNumber with 9 digits starting with 0");
		}
		keyboard.close();
		return PhoneNumber;
	}

	public String askPhoneNumber_ICE() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee Emergency PhoneNumber");
		String PhoneNumber_ICE = keyboard.nextLine();

		if (!PhoneNumber_ICE.startsWith("0") || PhoneNumber_ICE.length() <= 10) {
			System.out.println("you need to enter a phoneNumber with 10 digits starting with 0");
		}
		keyboard.close();
		return PhoneNumber_ICE;
	}

	public static double askSalaryMonth() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the employee salary data");
		double salaryMonth = keyboard.nextDouble();

		if (salaryMonth <= 0) {
			System.out.println("you need to enter a positive salary Month amount");
		}
		keyboard.close();
		return salaryMonth;
	}

	public LocalDate askBirthDate() {
		Scanner keyboard = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		System.out.println("Enter the BirthDate with format DD/MM/YYYY");
		String dateOfBirth = keyboard.next();
		LocalDate d = LocalDate.parse(dateOfBirth, formatter);
		keyboard.close();
		return d;
	}
	
	
	public double requestProjectPrice() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter project price");
        double inputProjectPrice = scanner.nextDouble();
        if (inputProjectPrice <=0) {
        System.out.println("Please enter a new price, not valid");
		} 
        scanner.close();
        return inputProjectPrice;	
	}
   
   
	public LocalDate requestProjectStartDate() {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		System.out.print("Enter project start date with format DD/MM/YYYY");
		String inputStartDate = scanner.next();
		LocalDate d = LocalDate.parse(inputStartDate, formatter);
		  
        scanner.close();
        return d;
              
	}

	public LocalDate requestProjectEndDate() {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		System.out.print("Enter projectExpectedEndDate with format DD/MM/YYYY");
        String inputEndDate = scanner.next();
        LocalDate d = LocalDate.parse(inputEndDate, formatter);
        if(d.isBefore(requestProjectStartDate())) {
        	System.out.println("End date should be after the project start date, please re-enter");
        }
        scanner.close();
        return d;
      
               
	}
		
	public String requestProjectDescription() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter description");
        String inputDescription = scanner.nextLine();
        scanner.close();
        return inputDescription;
	}
	
	
	public LocalDate requestWorkDoneDate() {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		System.out.print("Enter project workDoneDate with format DD/MM/YYYY");
        String workDoneDate = scanner.next();
        LocalDate d = LocalDate.parse(workDoneDate, formatter);
        scanner.close();
        return d;
      
               
	}
	
	public String requestWorkDoneRemarks() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter description remarks");
        String inputRemarks = scanner.nextLine();
        scanner.close();
        return inputRemarks;
	}
	
	public int requestHoursWorked(int projectId) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter project price");
        int inputHoursWorked = scanner.nextInt();
        if (inputHoursWorked <=0) {
        System.out.println("Please enter hours worked for project");
		} 
        scanner.close();
        return inputHoursWorked;	
	}
	
	
}
