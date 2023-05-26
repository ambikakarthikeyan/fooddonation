package com.javatpoint.controller;
 
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.javatpoint.model.Volunteers;  
import com.javatpoint.service.VolunteersService;  
//mark class as Controller  
@RestController  
public class VolunteersController   
{  
//autowire the VolunteersService class  
@Autowired  
VolunteersService volunteersService;  
//creating a get mapping that retrieves all the volunteers detail from the database   
@GetMapping("/volunteer")  
private List<Volunteers> getAllVolunteers()   
{  
return volunteersService.getAllVolunteers();  
}  
//creating a get mapping that retrieves the detail of a specific volunteer  
@GetMapping("/volunteer/{volunteerid}")  
private Volunteers getVolunteers(@PathVariable("volunteerid") int volunteerid)   
{  
return volunteersService.getVolunteersById(volunteerid);  
}  
//creating a delete mapping that deletes a specified volunteer  
@DeleteMapping("/volunteer/{volunteerid}")  
private void deleteVolunteer(@PathVariable("volunteerid") int volunteerid)   
{  
volunteersService.delete(volunteerid);  
}  
//creating post mapping that post the volunteer detail in the database  
@PostMapping("/volunteers")  
private int saveVolunteer(@RequestBody Volunteers volunteers)   
{  
volunteersService.saveOrUpdate(volunteers);  
return volunteers.getVolunteerid();  
}  
//creating put mapping that updates the volunteer detail   
@PutMapping("/volunteers")  
private Volunteers update(@RequestBody Volunteers volunteers)   
{  
volunteersService.saveOrUpdate(volunteers);  
return volunteers;  
}  
}  
