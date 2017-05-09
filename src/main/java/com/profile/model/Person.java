package com.profile.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




public class Person {
	
	 @NotNull(message = "Please enter vaild FirstName.")
	 @Size(min=2, max=30,message="Please enter a valid firstName")
	private String firstName;
	 @NotNull(message = "Please enter vaild LastName.")
	 @Size(min=2, max=30,message="Please enter a valid LastName")
	private String lastName;
	 private String dob;
	private ArrayList<Address> address;
	private ArrayList<Phone> listOfPhoneDetails;

	private ArrayList<EmailAdddress> email;
	
//	private ArrayList<EducationDetail> educationDetails;
//	private ArrayList<ExperienceDetail> experienceDetails;
//	
	
	public Person(String firstName, String lastName, ArrayList<Address> address, ArrayList<Phone> listOfPhoneDetails,
			ArrayList<EmailAdddress> email, ArrayList<EducationDetail> educationDetails,
			ArrayList<ExperienceDetail> experienceDetails) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.listOfPhoneDetails = listOfPhoneDetails;
		this.email=email;
	
//		this.educationDetails = educationDetails;
//		this.experienceDetails = experienceDetails;
	}


	public Person(){

	}
	
	
	public Person(String firstName, String lastName, ArrayList<Address> address, ArrayList<Phone> listOfPhoneDetails,
			ArrayList<EmailAdddress> email) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.listOfPhoneDetails = listOfPhoneDetails;
		this.email=email;
	}


	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ArrayList<Address> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}
	
	public ArrayList<Phone> getListOfPhoneDetails() {
		return listOfPhoneDetails;
	}
	public void setListOfPhoneDetails(ArrayList<Phone> listOfPhoneDetails) {
		this.listOfPhoneDetails = listOfPhoneDetails;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public ArrayList<EmailAdddress> getEmail() {
		return email;
	}


	public void setEmail(ArrayList<EmailAdddress> email) {
		this.email = email;
	}


//	public ArrayList<EducationDetail> getEducationDetails() {
//		return educationDetails;
//	}
//
//
//	public void setEducationDetails(ArrayList<EducationDetail> educationDetails) {
//		this.educationDetails = educationDetails;
//	}
//
//
//	public ArrayList<ExperienceDetail> getExperienceDetails() {
//		return experienceDetails;
//	}
//
//
//	public void setExperienceDetails(ArrayList<ExperienceDetail> experienceDetails) {
//		this.experienceDetails = experienceDetails;
//	}
	
	
	
}
