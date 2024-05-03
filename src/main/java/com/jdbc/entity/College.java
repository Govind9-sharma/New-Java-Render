package com.jdbc.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class College {
	
	@Id
	String id;
	String collegename;
	String address;
	String contactno;
	List<String> courses;
	int students;
}
