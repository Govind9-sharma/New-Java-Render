package com.jdbc.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.entity.Question;
import com.jdbc.repository.QuestionRepository;
import com.jdbc.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	QuestionRepository repository;
	@Override
	public Question createQuestion(Question question) {
		repository.save(question);
		return null;
	}
	@Override
	public List<Question> getAllQuestion() {
		
		Iterable i=repository.findAll();
	    Iterator itr=i.iterator();
	    List<Question> list=new ArrayList<Question>();
	    while(itr.hasNext())
	    {
	    	Question question=(Question) itr.next();
	    	list.add(question);
	    }
	    return list;
	}

}
