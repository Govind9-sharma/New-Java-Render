package com.jdbc.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.entity.Exam;
import com.jdbc.entity.Question;
import com.jdbc.repository.ExamRepository;
import com.jdbc.service.ExamService;

@Service
public class ExamServiceImpl implements ExamService{

	@Autowired
	ExamRepository repository;
	@Override
	public Exam createExam(Exam exam)
	{
		return repository.save(exam);
	}
	
	@Override
	public List<Exam> getAllExamFromDataBase() {
		Iterable itr=repository.findAll();
		Iterator<Exam> itr1=itr.iterator();
		List<Exam> temp=new ArrayList<Exam>();
		while(itr1.hasNext())
		{
			temp.add(itr1.next());
		}
		return temp;
	}
	
	public Exam getExamById(String examId)
	{
		Optional opt= repository.findById(examId);
		return (Exam) opt.get();
	}

	@Override
	public Exam updateExamToDataBase(Exam updatedExam,String examId) {
		
		Exam exam=getExamById(examId);
		if(updatedExam.getId()==null)
			updatedExam.setId(exam.getId());
		if(updatedExam.getExam_date()==null)
			updatedExam.setExam_date(exam.getExam_date());
		if(updatedExam.getExam_duration_hour()==0)
			updatedExam.setExam_duration_hour(exam.getExam_duration_hour());
		if(updatedExam.getExam_duration_minute()==0)
			updatedExam.setExam_duration_minute(exam.getExam_duration_minute());
		if(updatedExam.getExam_duration_second()==0)
			updatedExam.setExam_duration_second(exam.getExam_duration_second());
		if(updatedExam.getExam_starting_hour()==0)
			updatedExam.setExam_starting_hour(exam.getExam_starting_hour());
		if(updatedExam.getExam_starting_minute()==0)
			updatedExam.setExam_starting_minute(exam.getExam_starting_minute());
		if(updatedExam.getExam_starting_second()==0)
			updatedExam.setExam_starting_second(exam.getExam_starting_second());
//		if(updatedExam.getQuestions().size()==0)
//		updatedExam.setQuestions(exam.getQuestions());
		List<Question> question=new ArrayList<>();
		question.addAll(exam.getQuestions());
		question.addAll(updatedExam.getQuestions());
	    updatedExam.setQuestions(question);
		return repository.save(updatedExam);
	}

	@Override
	public String deleteAllExam() {
		
		repository.deleteAll();
		return "SuccessFully Deleted";
	}

	@Override
	public Exam deleteById(String id) {
		Exam exam=getExamById(id);
		repository.deleteById(id);
		return exam;
	}

}