package com.jdbc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jdbc.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	public List<Student> getStudents();
	public void deleteStudent(String id);
	public Student getStudentByRollno(long rollno);
	public Student updateStudent(Student student);
}
