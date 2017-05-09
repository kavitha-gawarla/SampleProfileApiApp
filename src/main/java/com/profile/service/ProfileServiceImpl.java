package com.profile.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.entity.PersonEntity;
import com.profile.model.Person;
import com.profile.repository.ProfileRepository;
import com.profile.util.EntityModelMapper;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	ProfileRepository profileRepository;
	

	@Override
	public void saveProfile(Person person) {
		PersonEntity personEntity=null;
		if(person!=null){
			personEntity=new EntityModelMapper().convertDTOToEntity(person);
			personEntity=profileRepository.save(personEntity);
		}

		

	}


	

}
