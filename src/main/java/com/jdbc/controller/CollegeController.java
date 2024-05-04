
package com.jdbc.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.entity.College;
import com.jdbc.service.CollegeService;

@RestController
@CrossOrigin("https://full-stack-project-8b5c7.web.app/")
@RequestMapping("/college")
public class CollegeController
{
	
	@Autowired
	CollegeService service;
	
	@PostMapping("/create")
	public ResponseEntity<College> createCollege(@RequestBody College college)
	{
		String id=UUID.randomUUID().toString();
		college.setId(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.createCollege(college));
	}
}
