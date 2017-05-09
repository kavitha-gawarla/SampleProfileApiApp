package com.profile.model;

public class Phone {

	String phoneType;
	String phoneNumber;
	String extension;
	
	public Phone(){}
	
	
	public Phone(String phoneType, String phoneNumber, String extension) {
		
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.extension = extension;
	}


	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	
}
