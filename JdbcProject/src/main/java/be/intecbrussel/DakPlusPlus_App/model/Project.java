package be.intecbrussel.DakPlusPlus_App.model;

import java.time.LocalDate;

public class Project {
	private int projectId;
	
	private double projectPrice;
	private String description;
	private LocalDate projectStartDate;
	private LocalDate projectExpectedEndDate;
	
	public Project () {
		
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public double getProjectPrice() {
		return projectPrice;
	}

	public void setProjectPrice(double projectPrice) {
		this.projectPrice = projectPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(LocalDate projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public LocalDate getProjectExpectedEndDate() {
		return projectExpectedEndDate;
	}

	public void setProjectExpectedEndDate(LocalDate projectExpectedEndDate) {
		this.projectExpectedEndDate = projectExpectedEndDate;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectPrice=" + projectPrice + ", description=" + description
				+ ", projectStartDate=" + projectStartDate + ", projectExpectedEndDate=" + projectExpectedEndDate + "]";
	}
	
}
