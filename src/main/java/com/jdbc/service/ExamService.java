package com.jdbc.service;

import java.util.List;

import com.jdbc.entity.Exam;

public interface ExamService {
	public Exam createExam(Exam exam);
	
	public List<Exam> getAllExamFromDataBase();
	
	public Exam updateExamToDataBase(Exam updatedExam,String examId);
	
	public Exam getExamById(String examId);
	
	public String deleteAllExam();
	
	public Exam deleteById(String id);
}
