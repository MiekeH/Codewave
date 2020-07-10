package be.intecbrussel.DakPlusPlus_App.model;

import java.sql.Date;
import java.util.List;
import java.util.stream.Stream;

public class Employee {
	protected final static int LENGTH_PHONENUMBER_ICE =9;
	protected final static int LENGTH_PHONENUMBER =10;
	public static final String userInputService = null;
	private int employeeId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String phoneNumber_ICE;
	private Date dateOfBirth;
	private double salaryMonth;
	
	private boolean isPresent;
	
	public Employee () {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		//if (firstName == 0) {
			//System.out.println("Please fill in firstName");
		this.firstName = firstName;
		//}
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (isValidNumber()==true) {
		this.phoneNumber = phoneNumber;
		}
		else {
		System.out.println("wrong number");	
		}
	}

	public String getPhoneNumber_ICE() {
		return phoneNumber_ICE;
	}

	public void setPhoneNumber_ICE(String phoneNumber_ICE) {
		if (isValidNumber()==true) {
		this.phoneNumber_ICE = phoneNumber_ICE;
		}
		else {
		System.out.println("wrong number");
		}
		
		}
	

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(double salaryMonth) {
		this.salaryMonth = salaryMonth;
	}
	
	
	public boolean isValidNumber() {
			Stream.of(phoneNumber).filter(x->x.startsWith("0")&& x.length()<=LENGTH_PHONENUMBER);
			Stream.of(phoneNumber_ICE).filter(x->x.startsWith("0")&& x.length()<LENGTH_PHONENUMBER_ICE);
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", phoneNumber_ICE=" + phoneNumber_ICE + ", dateOfBirth="
				+ dateOfBirth + ", salaryMonth=" + salaryMonth + "]";
	}

	public List<Employee> isPresent() {
		return null;
	}
	
}
