package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Feedbacks;
import com.javatpoint.repository.FeedbacksRepository;

//defining the business logic  
@Service
public class FeedbacksService {
	@Autowired
	FeedbacksRepository feedbacksRepository;

//getting all feedbacks record by using the method findaAll() of CrudRepository  
	public List<Feedbacks> getAllFeedbacks() {
		List<Feedbacks> feedbacks = new ArrayList<Feedbacks>();
		feedbacksRepository.findAll().forEach(feedbacks1 -> feedbacks.add(feedbacks1));
		return feedbacks;
	}

//getting a specific record by using the method findById() of CrudRepository  
	public Feedbacks getFeedbacksById(int id) {
		return feedbacksRepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Feedbacks feedbacks) {
		feedbacksRepository.save(feedbacks);
	}

//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id) {
		feedbacksRepository.deleteById(id);
	}

//updating a record  
	public void update(Feedbacks feedbacks, int feedbackid) {
		feedbacksRepository.save(feedbacks);
	}
}
