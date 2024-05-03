package com.jdbc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jdbc.entity.Student;
import com.jdbc.service.StudentService;

@CrossOrigin("https://java-full-stack.onrender.com/")
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/create")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addStudent(student));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getStudent()
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getStudents());
	}
	
	@DeleteMapping("/deletebyid")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String id)
	{
		service.deleteStudent(id);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@GetMapping("/getbyrollno/{rollno}")
	public ResponseEntity<Student> getStudentById(@PathVariable long rollno)
	{
		Student student=service.getStudentByRollno(rollno);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(student);
	}
	
	@PostMapping("/updatestudent")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student)
	{
		return ResponseEntity.status(HttpStatus.OK).body(service.updateStudent(student));
	}
}