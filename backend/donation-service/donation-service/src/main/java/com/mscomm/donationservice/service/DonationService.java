package com.mscomm.donationservice.service;

import java.util.List;

import com.mscomm.donationservice.entity.*;


public interface DonationService {
    Donation saveDonation(Donation donation);

    Donation getDonationById(Long donationId);

	List<Donation> getAllDonations();
    
    
}