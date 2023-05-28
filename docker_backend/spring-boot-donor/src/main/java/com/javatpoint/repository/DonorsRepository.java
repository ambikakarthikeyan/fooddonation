package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository; 
 
import com.javatpoint.model.Donors; 
//repository that extends CrudRepository  
public interface DonorsRepository extends CrudRepository<Donors, Integer>  
{  
}  
