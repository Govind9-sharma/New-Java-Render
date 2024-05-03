package com.jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.entity.Student;

public interface StudentRepository extends JpaRepository<Student,String>{
	
	public Student getByRollno(long rollno);

}