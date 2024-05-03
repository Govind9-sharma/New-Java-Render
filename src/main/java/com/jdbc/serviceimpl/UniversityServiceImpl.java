package com.jdbc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.jdbc.entity.University;
import com.jdbc.repository.UniversityRepository;
import com.jdbc.service.UniversityService;

public class UniversityServiceImpl implements UniversityService{

	@Autowired
	UniversityRepository repository;
	
	@Override
	public University addUniversity(University university) {
		University temp=repository.save(university);
		return temp;
	}

}
