package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Ngos;
import com.javatpoint.repository.NgosRepository;

//defining the business logic  
@Service
public class NgosService {
	@Autowired
	NgosRepository ngosRepository;

//getting all ngos record by using the method findaAll() of CrudRepository  
	public List<Ngos> getAllNgos() {
		List<Ngos> ngos = new ArrayList<Ngos>();
		ngosRepository.findAll().forEach(ngos1 -> ngos.add(ngos1));
		return ngos;
	}

//getting a specific record by using the method findById() of CrudRepository  
	public Ngos getNgosById(int id) {
		return ngosRepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Ngos ngos) {
		ngosRepository.save(ngos);
	}

//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id) {
		ngosRepository.deleteById(id);
	}

//updating a record  
	public void update(Ngos ngos, int ngoid) {
		ngosRepository.save(ngos);
	}
}
