package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Volunteers;
import com.javatpoint.repository.VolunteersRepository;

//defining the business logic  
@Service
public class VolunteersService {
	@Autowired
	VolunteersRepository volunteersRepository;

//getting all volunteers record by using the method findaAll() of CrudRepository  
	public List<Volunteers> getAllVolunteers() {
		List<Volunteers> volunteers = new ArrayList<Volunteers>();
		volunteersRepository.findAll().forEach(volunteers1 -> volunteers.add(volunteers1));
		return volunteers;
	}

//getting a specific record by using the method findById() of CrudRepository  
	public Volunteers getVolunteersById(int id) {
		return volunteersRepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Volunteers volunteers) {
		volunteersRepository.save(volunteers);
	}

//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id) {
		volunteersRepository.deleteById(id);
	}

//updating a record  
	public void update(Volunteers volunteers, int volunteerid) {
		volunteersRepository.save(volunteers);
	}
}
