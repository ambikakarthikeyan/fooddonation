package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository; 
 
import com.javatpoint.model.Ngos; 
//repository that extends CrudRepository  
public interface NgosRepository extends CrudRepository<Ngos, Integer>  
{  
}  
