package be.intecbrussel.DakPlusPlus_App.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import be.intecbrussel.DakPlusPlus_App.model.Employee;

public class EmployeeDAO {

	public List<Employee> getAllEmployees() throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM Employee");

		return listOfEmployees(rs);
	}

	private List<Employee> listOfEmployees(ResultSet rs) throws SQLException {

		List<Employee> listOfEmployees = new ArrayList<>();

		while (rs.next()) {
			Employee employee = new Employee();

			employee.setEmployeeId(rs.getInt("employee_id"));
			employee.setFirstName(rs.getString("firstName"));
			employee.setLastName(rs.getString("lastName"));
			employee.setPhoneNumber(rs.getString("phoneNumber"));
			employee.setPhoneNumber_ICE(rs.getString("phoneNumber_ICE"));
			employee.setDateOfBirth(rs.getDate("dateOfBirth"));
			employee.setSalaryMonth(rs.getDouble("salaryMonth"));
			listOfEmployees.add(employee);
		}
		return listOfEmployees;
	}

	public Employee updateEmployeeData(int employeeId, String firstName, String lastName, String phoneNumber,
			String phoneNumber_ICE, Date dateOfBirth, double salaryMonth) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();
		Employee employeeUpdated = new Employee();
		String sqlUpdate = ("UPDATE Employee " + "SET firstName LIKE ? AND lastName LIKE ? " + "OR phoneNumber = ?"
				+ "OR phoneNumber_ICE =?" + "OR dateOfBirth = ?" + "OR salaryMonth = ? "

				+ "WHERE employee_id = ? ");

		PreparedStatement ps = connection.prepareStatement(sqlUpdate);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, phoneNumber);
		ps.setString(4, phoneNumber_ICE);
		ps.setDate(5, (Date) dateOfBirth);
		ps.setDouble(6, salaryMonth);
		ps.setInt(7, employeeId);
		ps.executeUpdate();

		ps.executeUpdate();
		return employeeUpdated;
	}

	public Employee insertEmployeeData(String firstName, String lastName, String phoneNumber, String phoneNumber_ICE,
			java.util.Date dateOfBirth, double salaryMonth) throws SQLException {

		Employee employeeNew = new Employee();

		Connection connection = ConnectionFactory.getConnection();
		String sqlInsert = "INSERT INTO Employee VALUES (NULL,?,?,?,?,?,?)";

		PreparedStatement ps = connection.prepareStatement(sqlInsert);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, phoneNumber);
		ps.setString(4, phoneNumber_ICE);
		ps.setDate(5, (Date) dateOfBirth);
		ps.setDouble(6, salaryMonth);
		ps.executeUpdate();

		return employeeNew;
	}

	public int deleteEmployeeData(int employeeId) throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		String sqlPreparedDelete = "DELETE FROM Employee WHERE employee_id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlPreparedDelete);
		preparedStatement.setInt(1, employeeId);
		int recordsdeleted = preparedStatement.executeUpdate();
		return recordsdeleted;

	}

}
		

	
	
	
	
	
 



	
	

