package be.intecbrussel.DakPlusPlus_App.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import be.intecbrussel.DakPlusPlus_App.model.Employee;
import be.intecbrussel.DakPlusPlus_App.model.Project;
import be.intecbrussel.DakPlusPlus_App.model.WorkDone;

public class WorkDoneDAO {

	public List<WorkDone> getProjectsEmployees() throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM Workdone");

		return listOfEmployees(rs);
	}

	private List<WorkDone> listOfEmployees(ResultSet rs) throws SQLException {

		List<WorkDone> listOfProjectEmployees = new ArrayList<>();

		while (rs.next()) {
			WorkDone workDone = new WorkDone();
			workDone.setEmployeeId(rs.getInt("employee_id"));
			workDone.setProjectId(rs.getInt("project_id"));
			workDone.setWorkDoneDate(rs.getDate("date").toLocalDate());
			workDone.setHoursWorked(rs.getInt("hoursworked"));
			workDone.setRemarks(rs.getString("remarks"));

			listOfProjectEmployees.add(workDone);
		}
		return listOfProjectEmployees;
	}

	public WorkDone insertData(LocalDate workDoneDate, int hoursWorked, String remarks, int employeeId, int projectId) throws SQLException {
		WorkDone workdoneNew = new WorkDone();
		Connection connection = ConnectionFactory.getConnection();
		String sqlInsert = "INSERT INTO WorkDone VALUES (?,?,?,?,?)";

		PreparedStatement ps = connection.prepareStatement(sqlInsert);
		ps.setInt(1, employeeId);
		ps.setInt(2, projectId);
		ps.setDate(3, java.sql.Date.valueOf(workDoneDate));
		ps.setInt(4, hoursWorked);
		ps.setString(5, remarks);
			
		ps.executeUpdate();
		return workdoneNew;
		
	}

	public int deleteProjectData(int projectId) throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		String sqlPreparedDelete = "DELETE FROM Workdone WHERE project_id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlPreparedDelete);
		preparedStatement.setInt(1, projectId);
		int recordsdeleted = preparedStatement.executeUpdate();
		return recordsdeleted;
		}

	public List<WorkDone> getHoursWorkedEmployees() throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT MAX(HoursWorked) FROM Workdone GROUP BY project_id LIMIT 3");
		return listOfEmployees(rs);
		
	}
	
	
	
	
	
	
}
