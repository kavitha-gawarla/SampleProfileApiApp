package com.profile.model;

import java.util.ArrayList;

public class ExperienceDetail {
	
	
	private String employerName;
	private Address employerAddress;
	private String clientName;
	private Address clientAddress;
	private ArrayList<ProjectDetail> projectDetails;
	
	public ExperienceDetail(){}

	public ExperienceDetail(String employerName, Address employerAddress, String clientName, Address clientAddress,
			ArrayList<Phone> phones, ArrayList<ProjectDetail> projectDetails) {
		super();
		this.employerName = employerName;
		this.employerAddress = employerAddress;
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.projectDetails = projectDetails;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Address getEmployerAddress() {
		return employerAddress;
	}

	public void setEmployerAddress(Address employerAddress) {
		this.employerAddress = employerAddress;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Address getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(Address clientAddress) {
		this.clientAddress = clientAddress;
	}


	public ArrayList<ProjectDetail> getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ArrayList<ProjectDetail> projectDetails) {
		this.projectDetails = projectDetails;
	}
	
	

	
}
