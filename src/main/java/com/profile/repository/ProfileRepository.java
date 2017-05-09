package com.profile.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.profile.entity.PersonEntity;

@Repository
public interface ProfileRepository extends CrudRepository<PersonEntity, Integer> {
	
	//PersonEntity Save(PersonEntity person);

}
