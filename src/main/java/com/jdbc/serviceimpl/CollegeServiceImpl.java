package com.jdbc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.entity.College;
import com.jdbc.repository.CollegeRepository;
import com.jdbc.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService{

	@Autowired
	CollegeRepository repository;
	
	@Override
	public College createCollege(College college) {
		repository.save(college);
		return college;
	}
	
}
