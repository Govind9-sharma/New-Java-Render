package com.jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdbc.entity.College;
@Repository
public interface CollegeRepository extends JpaRepository<College,String>{
	
}
