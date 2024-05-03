package com.jdbc.service;

import java.util.List;

import com.jdbc.entity.Question;

public interface QuestionService {
	
	public Question createQuestion(Question question);
	public List<Question> getAllQuestion();
}
