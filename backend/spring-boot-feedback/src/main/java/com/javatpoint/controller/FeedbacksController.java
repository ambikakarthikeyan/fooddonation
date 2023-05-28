package com.javatpoint.controller;
 
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.javatpoint.model.Feedbacks;  
import com.javatpoint.service.FeedbacksService;  
//mark class as Controller 
@CrossOrigin(origins = "http://localhost:3000")
@RestController  
public class FeedbacksController   
{  
//autowire the FeedbacksService class  
@Autowired  
FeedbacksService feedbacksService;  
//creating a get mapping that retrieves all the feedbacks detail from the database   
@GetMapping("/feedback")  
private List<Feedbacks> getAllFeedbacks()   
{  
return feedbacksService.getAllFeedbacks();  
}  
//creating a get mapping that retrieves the detail of a specific feedback  
@GetMapping("/feedback/{feedbackid}")  
private Feedbacks getFeedbacks(@PathVariable("feedbackid") int feedbackid)   
{  
return feedbacksService.getFeedbacksById(feedbackid);  
}  
//creating a delete mapping that deletes a specified feedback  
@DeleteMapping("/feedback/{feedbackid}")  
private void deleteFeedback(@PathVariable("feedbackid") int feedbackid)   
{  
feedbacksService.delete(feedbackid);  
}  
//creating post mapping that post the feedback detail in the database  
@PostMapping("/feedbacks")  
private int saveFeedback(@RequestBody Feedbacks feedbacks)   
{  
feedbacksService.saveOrUpdate(feedbacks);  
return feedbacks.getFeedbackid();  
}  
//creating put mapping that updates the feedback detail   
@PutMapping("/feedbacks")  
private Feedbacks update(@RequestBody Feedbacks feedbacks)   
{  
feedbacksService.saveOrUpdate(feedbacks);  
return feedbacks;  
}  
}  
