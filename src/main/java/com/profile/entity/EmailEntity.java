package com.profile.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.profile.model.EmailAdddress;

@Entity
@Table(name = "Email")
public class EmailEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmailId")
	private int emailId;
	@Column(name = "EmailAddress")
	private String emailAddress;
//	@Column(name = "AltEmailAddress")
//	private String altEmailAddress;
	@Column(name = "EmailType")
	private String emailType;
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "LastUpdtTs", updatable = false,insertable=true)
	private Date updateDateTime;
	@ManyToOne
	@JoinColumn(name = "PersonId", nullable = false, updatable = true, insertable = true)
	private PersonEntity personEntity;

	public EmailEntity(int emailId, String emailAddress, String altEmailAddress, String emailType,
			PersonEntity personEntity) {
		super();
		this.emailId = emailId;
		this.emailAddress = emailAddress;
		//this.altEmailAddress = altEmailAddress;
		this.emailType = emailType;
		this.personEntity = personEntity;
	}

	public EmailEntity(EmailAdddress email, PersonEntity personEntity) {

		this.emailAddress = email.getEmailAddress();
		//this.altEmailAddress = email.getAltEmailAddress();
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

//	public String getAltEmailAddress() {
//		return altEmailAddress;
//	}
//
//	public void setAltEmailAddress(String altEmailAddress) {
//		this.altEmailAddress = altEmailAddress;
//	}

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

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

}
