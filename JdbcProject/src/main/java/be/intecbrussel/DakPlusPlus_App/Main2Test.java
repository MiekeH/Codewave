package be.intecbrussel.DakPlusPlus_App;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import be.intecbrussel.DakPlusPlus_App.services.AccountingServices;
import be.intecbrussel.DakPlusPlus_App.services.ProjectServices;
import be.intecbrussel.DakPlusPlus_App.services.UserInputServices;

public class Main2Test {
	//check isPresent() boolean in employee class
	//check validator package boolean coding // check accounting service change SQL // check functionality of 
	//auto-generated sql employee id how to retrieve?// check secretary services with dates streams//
	//check calculation of rentability from lists to doubles?
	//final steps - recode the menu show display
	
	public static void main(String[] args) throws SQLException, ParseException {
	
		UserInputServices userInput = new UserInputServices();
		userInput.requestProjectPrice();
		
		userInput.askPhoneNumber();
		//userInput.askBirthDate();
		//userInput.askSalaryMonth();
		
		//display employee data
		//accountingService.getListEmployees();
		//insert employee data
		AccountingServices accountingService = new AccountingServices();
		accountingService.addEmployeeData();
		
		
	}

	
	private static void showMenu() {
		System.out.println("0. Exit");
		System.out.println("1. Management Executive Summary");
		System.out.println("2. Access to the Database");
		System.out.println("3. Secretary");
		System.out.println("4. WorkDone");
	}
	
	
		
}
