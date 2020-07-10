package be.intecbrussel.DakPlusPlus_App.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import be.intecbrussel.DakPlusPlus_App.model.Project;


public class ProjectDAO {
	
	public List<Project> getAllCurrentProjects() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Project");
        return listOfProjects(rs);
    }
	
	public List<Project> getProjectsStartingNow() throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM Project");
		LocalDate nowDate = LocalDate.now();
		List<Project> newList = listOfProjects(rs).stream().filter(i -> i.getProjectStartDate() == nowDate)
				.collect(Collectors.toList());
		return newList;
	}

	private List<Project> listOfProjects(ResultSet rs) throws SQLException {
		List<Project> listOfProjects = new ArrayList<>();

		while (rs.next()) {
			Project project = new Project();
			project.setProjectId(rs.getInt("project_id"));
			project.setProjectStartDate(rs.getDate("startDate"));
			project.setDescription(rs.getString("description"));
			project.setProjectPrice(rs.getDouble("price"));
			project.(java.sql.Date)setProjectExpectedEndDate(rs.getDate("expectedEndDate"));
			listOfProjects.add(project);
		}
		return listOfProjects;
	}

	public Project insertProjectData(LocalDate projectStartDate, String description, Double projectPrice,
		LocalDate projectExpectedEndDate) throws SQLException {
		
		Project projectNew = new Project();
		Connection connection = ConnectionFactory.getConnection();
		String sqlInsert = "INSERT INTO Project VALUES (NULL,?,?,?,?)";

		PreparedStatement ps = connection.prepareStatement(sqlInsert);
		ps.setDate(1, projectStartDate);
		ps.setString(2, description);
		ps.setDouble(3, projectPrice);
		ps.setDate(4, projectExpectedEndDate);
		ps.executeUpdate();
		return projectNew;
	}

	public int deleteProjectData(int projectId) throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		String sqlPreparedDelete = "DELETE FROM Project WHERE project_id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlPreparedDelete);
		preparedStatement.setInt(1, projectId);
		int recordsdeleted = preparedStatement.executeUpdate();
		return recordsdeleted;
	}

}
