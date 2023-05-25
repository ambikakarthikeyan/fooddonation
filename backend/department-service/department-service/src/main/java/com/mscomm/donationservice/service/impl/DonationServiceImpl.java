package com.mscomm.donationservice.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.mscomm.donationservice.entity.Donation;
import com.mscomm.donationservice.repository.DonationRepository;
import com.mscomm.donationservice.service.DonationService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class DonationServiceImpl implements DonationService{
	
	 private DonationRepository donationRepository;
	@Override
	public Donation saveDonation(Donation donation) {
	return donationRepository.save(donation);
	}

	@Override
	public Donation getDonationById(Long donationId) {
		 return donationRepository.findById(donationId).get();
	}
	@Override
    public List<Donation> getAllDonations() {
		List<Donation> donations=new ArrayList<Donation>();
        donationRepository.findAll().forEach(donations1 -> donations.add(donations1));
        return donations;
    }

}
