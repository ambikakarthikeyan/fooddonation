package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository; 
 
import com.javatpoint.model.Feedbacks; 
//repository that extends CrudRepository  
public interface FeedbacksRepository extends CrudRepository<Feedbacks, Integer>  
{  
}  
