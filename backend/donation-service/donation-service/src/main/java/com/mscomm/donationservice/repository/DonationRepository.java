package com.mscomm.donationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscomm.donationservice.entity.Donation;

public interface DonationRepository extends JpaRepository<Donation,Long> {

}
