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

import com.profile.model.Address;

@Entity
@Table(name = "address")
public class AddressEntity implements Serializable {
	
	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "AddressId")
	private int id;
	 @Column(name="AddressLine1")
	private String addressLine1;
	 @Column(name="AddressLine2")
	private String addressLine2;
	 @Column(name="City")
	private String city;
	 @Column(name="State")
	private String state;
	 @Column(name="Zip")
	private String zipCode;
	
	 @ManyToOne
		@JoinColumn(name="PersonId",nullable = false, updatable = true, insertable = true)
		private PersonEntity person;
		
	 
	
	 public AddressEntity(Address address,PersonEntity person){
		 this.addressLine1 = address.getAddressLine1();
			this.addressLine2 = address.getAddressLine2();
			this.city = address.getCity();
			this.state = address.getState();
			this.zipCode = address.getZip();
			this.person=person;
		 
	 }
	 
	 
	public AddressEntity(String addressLine1, String addressLine2, String city, String state, String zipCode,PersonEntity person) {
		super();
		
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.person=person;
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	
	public PersonEntity getPerson() {
		return person;
	}


	public void setPerson(PersonEntity person) {
		this.person = person;
	}
	

	 
	 
}
