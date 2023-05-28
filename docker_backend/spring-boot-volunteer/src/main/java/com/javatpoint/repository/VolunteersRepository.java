package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository; 
 
import com.javatpoint.model.Volunteers; 
//repository that extends CrudRepository  
public interface VolunteersRepository extends CrudRepository<Volunteers, Integer>  
{  
}  
