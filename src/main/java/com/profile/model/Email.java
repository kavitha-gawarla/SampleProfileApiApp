package com.profile.model;

import java.io.Serializable;

public class Email implements Serializable{
	
	private String emailAddress;
	private String altEmailAddress;
	private String emailType;
	
	
	public Email(){}
	public Email(String emailAddress, String altEmailAddress, String emailType) {
		super();
		this.emailAddress = emailAddress;
		this.altEmailAddress = altEmailAddress;
		this.emailType = emailType;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAltEmailAddress() {
		return altEmailAddress;
	}
	public void setAltEmailAddress(String altEmailAddress) {
		this.altEmailAddress = altEmailAddress;
	}
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	
	
}
