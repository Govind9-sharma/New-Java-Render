package com.jdbc.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Exam {
	@Id
	private String id;
	private String subject;
	private String organiser;
	private Date exam_date;
	private String meridian;
	private int exam_duration_hour;
	private int exam_duration_minute;
	private int exam_duration_second;
	private int exam_starting_hour;
	private int exam_starting_minute;
	private int exam_starting_second;
	private long registered_student;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName="id")
	private List<Question> questions;
}
