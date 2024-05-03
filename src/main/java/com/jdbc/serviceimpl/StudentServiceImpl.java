package com.jdbc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.entity.Student;
import com.jdbc.repository.StudentRepository;
import com.jdbc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository repository;
	
	@Override
	public Student addStudent(Student student) 
	{
		int no=(int)(Math.random()*(100000000-10000+1)+10000);
		student.setEnrollmentno(String.valueOf(no).concat("aktu"));
		repository.save(student);
		return student;
	}

	@Override
	public List<Student> getStudents() {
		return repository.findAll();
	}

	@Override
	public void deleteStudent(String id) 
	{	
		 repository.deleteById(id); 
	}

	@Override
	public Student getStudentByRollno(long rollno) 
	{
		return repository.getByRollno(rollno);
	}

	@Override
	public Student updateStudent(Student student) 
	{
		Student temp=repository.getByRollno(student.getRollno());
		if(student.getAddress()==null)
		{
			student.setAddress(temp.getAddress());
		}
		if(student.getCollege()==null)
		{
			student.setCollege(temp.getCollege());
		}
		if(student.getContactno()==null)
		{
			student.setContactno(temp.getContactno());
		}
		if(student.getUniversity()==null)
		{
			student.setUniversity(temp.getUniversity());
		}
		if(student.getCourse()==null)
		{
			student.setCourse(temp.getCourse());
		}
		if(student.getEmail()==null)
		{
			student.setEmail(temp.getEmail());
		}
		student.setName(temp.getName());
		student.setEnrollmentno(temp.getEnrollmentno());
		return repository.save(student);
	}
}