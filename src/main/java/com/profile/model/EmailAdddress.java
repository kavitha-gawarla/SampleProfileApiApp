package com.profile.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class EmailAdddress implements Serializable{
	@NotEmpty(message = "Please enter vaild email.")
	 @NotNull(message = "Please enter vaild email.")
	 @Email(message = "Please enter vaild email.")
	private String emailAddress;
	private String altEmailAddress;
	private String emailType;
	
	
	public EmailAdddress(){}
	public EmailAdddress(String emailAddress, String altEmailAddress, String emailType) {
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
