package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Donors;
import com.javatpoint.repository.DonorsRepository;

//defining the business logic  
@Service
public class DonorsService {
	@Autowired
	DonorsRepository donorsRepository;

//getting all donors record by using the method findaAll() of CrudRepository  
	public List<Donors> getAllDonors() {
		List<Donors> donors = new ArrayList<Donors>();
		donorsRepository.findAll().forEach(donors1 -> donors.add(donors1));
		return donors;
	}

//getting a specific record by using the method findById() of CrudRepository  
	public Donors getDonorsById(int id) {
		return donorsRepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Donors donors) {
		donorsRepository.save(donors);
	}

//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id) {
		donorsRepository.deleteById(id);
	}

//updating a record  
	public void update(Donors donors, int donorid) {
		donorsRepository.save(donors);
	}
}
