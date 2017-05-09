package com.profile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.profile.model.Email;

@Entity
@Table(name="Email")
public class EmailEntity implements Serializable{
	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "EmailId")
	private int emailId;
	 @Column(name="EmailAddress")
	private String emailAddress;
	 @Column(name="AltEmailAddress")
	private String altEmailAddress;
	 @Column(name="EmailType")
	private String emailType;
	 @ManyToOne
		@JoinColumn(name="PersonId",nullable = false, updatable = true, insertable = true)
	private PersonEntity personEntity;
	 
	 
	public EmailEntity(int emailId, String emailAddress, String altEmailAddress, String emailType,
			PersonEntity personEntity) {
		super();
		this.emailId = emailId;
		this.emailAddress = emailAddress;
		this.altEmailAddress = altEmailAddress;
		this.emailType = emailType;
		this.personEntity = personEntity;
	}
	
	
	public EmailEntity(Email email, PersonEntity personEntity) {
	
		this.emailAddress = email.getEmailAddress();
		this.altEmailAddress = email.getAltEmailAddress();
		this.emailType = email.getEmailType();
		this.personEntity = personEntity;
	}


	public int getEmailId() {
		return emailId;
	}
	public void setEmailId(int emailId) {
		this.emailId = emailId;
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
	public PersonEntity getPersonEntity() {
		return personEntity;
	}
	public void setPersonEntity(PersonEntity personEntity) {
		this.personEntity = personEntity;
	}
	
	 
	 

}
