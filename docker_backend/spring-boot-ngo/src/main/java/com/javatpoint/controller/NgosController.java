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
import com.javatpoint.model.Ngos;  
import com.javatpoint.service.NgosService;  
//mark class as Controller  
@CrossOrigin(origins = "http://localhost:3000")
@RestController  
public class NgosController   
{  
//autowire the NgosService class  
@Autowired  
NgosService ngosService;  
//creating a get mapping that retrieves all the ngos detail from the database   
@GetMapping("/ngo")  
private List<Ngos> getAllNgos()   
{  
return ngosService.getAllNgos();  
}  
//creating a get mapping that retrieves the detail of a specific ngo  
@GetMapping("/ngo/{ngoid}")  
private Ngos getNgos(@PathVariable("ngoid") int ngoid)   
{  
return ngosService.getNgosById(ngoid);  
}  
//creating a delete mapping that deletes a specified ngo  
@DeleteMapping("/ngo/{ngoid}")  
private void deleteNgo(@PathVariable("ngoid") int ngoid)   
{  
ngosService.delete(ngoid);  
}  
//creating post mapping that post the ngo detail in the database  
@PostMapping("/ngos")  
private int saveNgo(@RequestBody Ngos ngos)   
{  
ngosService.saveOrUpdate(ngos);  
return ngos.getNgoid();  
}  
//creating put mapping that updates the ngo detail   
@PutMapping("/ngos")  
private Ngos update(@RequestBody Ngos ngos)   
{  
ngosService.saveOrUpdate(ngos);  
return ngos;  
}  
}  
