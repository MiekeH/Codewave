package be.intecbrussel.DakPlusPlus_App.model;

import java.time.LocalDate;

public class WorkDone {
	private int WorkDoneId;
	private Employee employee;
	private int EmployeeId; 
	private Project project;
	private int ProjectId;
	private LocalDate workDoneDate;
	private int hoursWorked;
	private String remarks;
	
	public WorkDone() {
		
	}
		
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getProjectId() {
		return ProjectId;
	}

	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}

	public LocalDate getWorkDoneDate() {
		return workDoneDate;
	}

	public void setWorkDoneDate(LocalDate workDoneDate) {
		this.workDoneDate = workDoneDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return "WorkDone [WorkDoneId=" + WorkDoneId + ", employee=" + employee.getEmployeeId() 
				+ ", project=" + project.getProjectId() 
				+ ", projectprice" +project.getProjectPrice()
				+ "workDoneDate=" + workDoneDate
				+ ", hoursWorked of employees=" + hoursWorked 
				+ ", remarks=" + remarks + "]";
	}
	

	
	
}
