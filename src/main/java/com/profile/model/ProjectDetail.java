package com.profile.model;

import java.util.Date;

public class ProjectDetail {

	private String projectName;
	private String decription;
	private String technologies;
	private Date startDate;
	private Date endDate;
	
	public ProjectDetail() {}
	public ProjectDetail(String projectName, String decription, String technologies, Date startDate, Date endDate) {
		super();
		this.projectName = projectName;
		this.decription = decription;
		this.technologies = technologies;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	
}
