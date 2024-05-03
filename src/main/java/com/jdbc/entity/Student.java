package com.jdbc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	long rollno;
	String name;
	String college;
	String university;
	String email;
	String course;
	String address;
	String contactno;
	String enrollmentno;
}