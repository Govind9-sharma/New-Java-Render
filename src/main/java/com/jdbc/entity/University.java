package com.jdbc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class University {

	@Id
	String code;
	String university;
	String contactNo;
	
}
