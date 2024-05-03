package com.jdbc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jdbc.entity.Exam;

@Repository
public interface ExamRepository extends CrudRepository<Exam,String>{
	
}
