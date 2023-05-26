package com.mscomm.donationservice.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mscomm.donationservice.entity.Donation;
import com.mscomm.donationservice.service.DonationService;

import lombok.AllArgsConstructor;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/donations")
@AllArgsConstructor
public class DonationController {

	private DonationService donationService;

    @PostMapping
    public ResponseEntity<Donation> saveDonation(@RequestBody Donation donation){
        Donation savedDonation = donationService.saveDonation(donation);
        return new ResponseEntity<>(savedDonation, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Donation> getDonationById(@PathVariable("id") Long donationId){
        Donation donation = donationService.getDonationById(donationId);
        return ResponseEntity.ok(donation);
    }
    @GetMapping
    public ResponseEntity<List<Donation>> getAllDonations() {
        List<Donation> donations = donationService.getAllDonations();
        return ResponseEntity.ok(donations);
    }

}

