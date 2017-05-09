package com.profile.util;




import java.util.HashSet;

import com.profile.entity.AddressEntity;
import com.profile.entity.EmailEntity;
import com.profile.entity.PersonEntity;
import com.profile.entity.PhoneEntity;
import com.profile.model.*;
import com.profile.model.Email;

public class EntityModelMapper {

	
	public final PersonEntity convertDTOToEntity(Person person){
		
		PersonEntity personEntity=null;
		
		if(person!=null){
			
			personEntity=new PersonEntity(person);
			if(person.getAddress()!=null){
				HashSet<AddressEntity> address = new HashSet<AddressEntity>();
				for(Address addr : person.getAddress()){
				address.add(new AddressEntity(addr,personEntity));
				}
				personEntity.setAddress(address);
			}
			
			if(person.getListOfPhoneDetails()!=null){
				HashSet<PhoneEntity> phones = new HashSet<PhoneEntity>();
				for(Phone phone : person.getListOfPhoneDetails()){
					phones.add(new PhoneEntity(phone,personEntity));
				}
				personEntity.setPhoneDetails(phones);
			}
			
			if(person.getEmail()!=null){
				HashSet<EmailEntity> emails = new HashSet<EmailEntity>();
				for(Email email : person.getEmail()){
					emails.add(new EmailEntity(email,personEntity));
				}
				personEntity.setEmailDetails(emails);
			}
			
			
			
		}
		return personEntity;
		
	}
	
	
}
