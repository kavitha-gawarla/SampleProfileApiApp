package com.profile.model;

import java.util.Date;

public class EducationDetail {

	private String degree;
	private String major;
	private Date startDate;
	private Date endDate;
	private String yearOfPassing;
	
	public EducationDetail(){
		
	}
	
	
	public EducationDetail(String degree, String major, Date startDate, Date endDate, String yearOfPassing) {
		super();
		this.degree = degree;
		this.major = major;
		this.startDate = startDate;
		this.endDate = endDate;
		this.yearOfPassing = yearOfPassing;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
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
	public String getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	
	
	
}
