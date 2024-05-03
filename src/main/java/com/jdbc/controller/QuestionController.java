package com.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.entity.Question;
import com.jdbc.service.QuestionService;

@RestController
@CrossOrigin("https://java-full-stack.onrender.com/")
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionService service;
	
	@PostMapping("/createquestion")
	public ResponseEntity<Question> createQuestion(@RequestBody Question question)
	{
		return ResponseEntity.ok(service.createQuestion(question));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Question>> getAllQuestions()
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getAllQuestion());
	}
}