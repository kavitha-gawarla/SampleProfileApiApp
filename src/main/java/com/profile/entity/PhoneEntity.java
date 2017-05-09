package com.profile.entity;

import java.io.Serializable;
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

import com.profile.model.Phone;

@Entity
@Table(name = "Phone")
public class PhoneEntity implements Serializable {
	@Column(name = "PhoneId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneId;

	@Column(name = "PhoneType")
	private String phoneType;
	@Column(name = "PhoneNumber")
	private String phoneNumber;
	@Column(name = "PhoneExt")
	private String phoneExt;
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "LastUpdtTs", updatable = false,insertable=true)
	private Date updateDateTime;
	@ManyToOne
	@JoinColumn(name = "PersonId", nullable = false, updatable = true, insertable = true)
	private PersonEntity personEntity;

	public PhoneEntity(int phoneId, String phoneType, String phoneNumber, String phoneExt, PersonEntity personEntity) {
		super();
		this.phoneId = phoneId;
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.phoneExt = phoneExt;
		this.personEntity = personEntity;
	}

	public PhoneEntity(Phone phone, PersonEntity personEntity) {
		this.phoneType = phone.getPhoneType();
		this.phoneNumber = phone.getPhoneNumber();
		this.phoneExt = phone.getExtension();
		this.personEntity = personEntity;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
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

	public String getPhoneExt() {
		return phoneExt;
	}

	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
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
