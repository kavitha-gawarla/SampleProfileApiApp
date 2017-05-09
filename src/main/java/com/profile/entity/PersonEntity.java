package com.profile.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.profile.model.Person;



@Entity
@Table(name = "persons")
public class PersonEntity implements Serializable{
	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "PersonId")
	private int id;
	@Column(name="FirstName")
	 private String firstName;
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="DOB")
	private String dob;
	
	
	@OneToMany(mappedBy="personEntity",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<EmailEntity> emailDetails;
	
	@OneToMany(mappedBy="personEntity",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<PhoneEntity> phoneDetails;

	
	@OneToMany(mappedBy="person",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<AddressEntity> address;
	
	public PersonEntity(){}
	
	public PersonEntity (Person person){
		
		this.firstName=person.getFirstName();
		this.lastName=person.getLastName();
		this.dob=person.getDob();
	}
	
	public PersonEntity(String firstName, String lastName, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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


	public Set<AddressEntity> getAddress() {
		return address;
	}
	
	
	public void setAddress(Set<AddressEntity> address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Set<EmailEntity> getEmailDetails() {
		return emailDetails;
	}

	public void setEmailDetails(Set<EmailEntity> emailDetails) {
		this.emailDetails = emailDetails;
	}

	public Set<PhoneEntity> getPhoneDetails() {
		return phoneDetails;
	}

	public void setPhoneDetails(Set<PhoneEntity> phoneDetails) {
		this.phoneDetails = phoneDetails;
	}

	
	
	
	
	
}
