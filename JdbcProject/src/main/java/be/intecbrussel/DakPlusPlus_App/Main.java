package be.intecbrussel.DakPlusPlus_App;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import be.intecbrussel.DakPlusPlus_App.model.Employee;
import be.intecbrussel.DakPlusPlus_App.model.Project;
import be.intecbrussel.DakPlusPlus_App.model.WorkDone;
import be.intecbrussel.DakPlusPlus_App.services.AccountingServices;
import be.intecbrussel.DakPlusPlus_App.services.ProjectServices;
import be.intecbrussel.DakPlusPlus_App.services.RentabilityCalculation;
import be.intecbrussel.DakPlusPlus_App.services.SecretaryServices;
import be.intecbrussel.DakPlusPlus_App.services.WorkDoneServices;

public class Main {

	public static void main(String[] args) throws SQLException {
		// Structure of the Application:
		//1. View Layer : Presentation Layer - Main Program -- Two menus
		//2. Internal Calculations: Services package per type of services (accounting, projects, secretary and workDone)
		//3. Data Layer: Data package (DAO) and Model package (Tables)
		//4. Data validation Layer captured some checkpoints in UserInputServices, but would normally created specific
		//package to check data entered by the user (accounting, secretary, project teams)
		
		//Note: some methods are not completely working as had to perform parsing from String to LocalDate to Dates 
		
		
		//check functionality//
		
		
		
		
		System.out.println("Hi - Good Day - THIS IS YOUR APPLICATION DATABASE:");
			
		showRentabilityMenu();
		int userChoice;
		userChoice = requestInput(1,2);
		handleStartMenu(userChoice);
		
		showMenu();
		int menuChoice;
		menuChoice = requestInput(0, 3);
		handleUserChoice(menuChoice);
		}
				
	private static void handleStartMenu(int userChoice) throws SQLException {

		if (userChoice == 1) {
			RentabilityCalculation rentability = new RentabilityCalculation();
			List<Project> projects = null;

			projects = rentability.getRentabilityProjects();
			projects.forEach(System.out::println);

		}
		if (userChoice == 2) {
			WorkDoneServices workDoneService = new WorkDoneServices();
			List<WorkDone> workProjectsTop3 = null;

			workProjectsTop3 = workDoneService.getHoursWorkedEmployees();
			workProjectsTop3.forEach(System.out::println);

		}
	}

	private static int requestInput(int lower, int upper) {
		Scanner scanner = new Scanner(System.in);
		int input = -1;
		do {
			try {
				System.out.println("Make a choice: ");
				input = scanner.nextInt();
			} catch (InputMismatchException e) {
				input = -1;
			}
			scanner.nextLine();
			if (input < lower || input > upper)
				System.out.println("Select a number of the MENU");
		} while (input < lower || input > upper);

		return input;
	}

	private static void handleUserChoice(int menuChoice) throws SQLException {

		if (menuChoice == 1) {
			AccountingServices accountingService = new AccountingServices();
			List<Employee> employees = null;

			try {
				employees = accountingService.getListEmployees();
				employees.forEach(System.out::println);
			} catch (SQLException ignored) {
				System.out.println("Problems with db...");
			}

		}
		if (menuChoice == 2) {
			ProjectServices projectService = new ProjectServices();
			List<Project> projects = null;

			try {
				projects = projectService.getListCurrentProjects();
				projects.forEach(System.out::println);
			} catch (SQLException ignored) {
				System.out.println("Problems with db...");
			}

		}

		if (menuChoice == 3) {
			SecretaryServices secretaryService = new SecretaryServices();
			List<Employee> employeesBirthDay = null;
			List<Employee> employeesBirthDay7days = null;

			employeesBirthDay = SecretaryServices.getBirthdayEmployees();
			employeesBirthDay7days = secretaryService.getBirthdayIn7DaysEmployees();
			employeesBirthDay.forEach(System.out::println);
			employeesBirthDay7days.forEach(System.out::println);

		}

		if (menuChoice == 4) {
			WorkDoneServices workDoneService = new WorkDoneServices();
			List<WorkDone> workDone = null;

			try {
				workDone = workDoneService.getListProjectsEmployees();
				workDone.forEach(System.out::println);
			} catch (SQLException ignored) {
				System.out.println("Problems with db...");
			}

		}

	}

		private static void showRentabilityMenu() {
			System.out.println("If you want to know the Rentability per Project - press 1");
			System.out.println("If you want to know the TOP 3 Employees per Project - press 2");
			
		}
				
		private static void showMenu() {
	        System.out.println("0. Exit");
	        System.out.println("1. Employee");
	        System.out.println("2. Projects");
	        System.out.println("3. Secretary");
	        System.out.println("4. WorkDone");
	    }
	
	}


