package com.mscomm.ngoservice.service;
import com.mscomm.ngoservice.entity.*;

import java.util.List;

import com.mscomm.donationservice.entity.Donation;
import com.mscomm.ngoservice.dto.ResponseDto;
public interface NgoService {
	Ngo saveNgo(Ngo ngo);

    ResponseDto getNgo(Long ngoId);
   
}
