package com.mscomm.ngoservice.controller;

import lombok.AllArgsConstructor;

import com.mscomm.donationservice.entity.Donation;
import com.mscomm.ngoservice.dto.ResponseDto;
import com.mscomm.ngoservice.entity.Ngo;
import com.mscomm.ngoservice.service.NgoService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/ngos")
@AllArgsConstructor
public class NgoController {
	  private NgoService ngoService;

	    @PostMapping
	    public ResponseEntity<Ngo> saveNgo(@RequestBody Ngo ngo){
	        Ngo savedNgo = ngoService.saveNgo(ngo);
	        return new ResponseEntity<>(savedNgo, HttpStatus.CREATED);
	    }

	    @GetMapping("{id}")
	    public ResponseEntity<ResponseDto> getNgo(@PathVariable("id") Long ngoId){
	        ResponseDto responseDto = ngoService.getNgo(ngoId);
	        return ResponseEntity.ok(responseDto);
	    }
	    
	  
}
