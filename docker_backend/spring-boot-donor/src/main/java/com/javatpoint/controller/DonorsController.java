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
import com.javatpoint.model.Donors;  
import com.javatpoint.service.DonorsService;  
//mark class as Controller 
@CrossOrigin(origins = "http://localhost:3000")
@RestController  
public class DonorsController   
{  
//autowire the DonorsService class  
@Autowired  
DonorsService donorsService;  
//creating a get mapping that retrieves all the donors detail from the database   
@GetMapping("/donor")  
private List<Donors> getAllDonors()   
{  
return donorsService.getAllDonors();  
}  
//creating a get mapping that retrieves the detail of a specific donor  
@GetMapping("/donor/{donorid}")  
private Donors getDonors(@PathVariable("donorid") int donorid)   
{  
return donorsService.getDonorsById(donorid);  
}  
//creating a delete mapping that deletes a specified donor  
@DeleteMapping("/donor/{donorid}")  
private void deleteDonor(@PathVariable("donorid") int donorid)   
{  
donorsService.delete(donorid);  
}  
//creating post mapping that post the donor detail in the database  
@PostMapping("/donors")  
private int saveDonor(@RequestBody Donors donors)   
{  
donorsService.saveOrUpdate(donors);  
return donors.getDonorid();  
}  
//creating put mapping that updates the donor detail   
@PutMapping("/donors")  
private Donors update(@RequestBody Donors donors)   
{  
donorsService.saveOrUpdate(donors);  
return donors;  
}  
}  
