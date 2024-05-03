package com.jdbc.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.entity.Exam;
import com.jdbc.service.ExamService;
import com.jdbc.service.QuestionService;

//@CrossOrigin("http://localhost:5173/")
@CrossOrigin("https://java-full-stack.onrender.com/")
@RestController
@RequestMapping("/exam")
public class ExamController {
	
	@Autowired
	ExamService service;
	
	@Autowired
	QuestionService service1;
	
	
	@PostMapping("/createexam")
	public ResponseEntity<Exam> createExam(@RequestBody Exam exam)
	{
		String id=UUID.randomUUID().toString();
		exam.setId(id);
	    return ResponseEntity.ok(service.createExam(exam));	
	}
	
	@GetMapping("/getallexam")
	public ResponseEntity<List<Exam>> getAllExam()
	{
		return ResponseEntity.ok(service.getAllExamFromDataBase());
	}
	
	@GetMapping("/getexam/{id}")
	public ResponseEntity<Exam> getExamById(@PathVariable String id)
	{
		return ResponseEntity.ok(service.getExamById(id));
	}
	
	@PostMapping("/updateexam/{id}")
	public ResponseEntity<Exam> updateExam(@RequestBody Exam exam,@PathVariable String id)
	{
		Exam updatedexam=service.updateExamToDataBase(exam, id);
		return ResponseEntity.ok(updatedexam);
	}
	
	@DeleteMapping("/deleteallexam")
	public ResponseEntity<String> deleteAllExam()
	{
		return ResponseEntity.ok(service.deleteAllExam());
	}
	
	@DeleteMapping("/deleteexam/{id}")
	public ResponseEntity<Exam> deleteExamById(@PathVariable String id)
	{
		return ResponseEntity.ok(service.deleteById(id));
	}
	
	
}
