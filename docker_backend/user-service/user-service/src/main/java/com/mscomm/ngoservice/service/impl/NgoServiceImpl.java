package com.mscomm.ngoservice.service.impl;
import com.mscomm.ngoservice.dto.ResponseDto;
import com.mscomm.ngoservice.entity.Ngo;
import com.mscomm.ngoservice.service.*;
import com.mscomm.ngoservice.repository.*;
import org.springframework.web.client.RestTemplate;

import com.mscomm.donationservice.entity.Donation;
import com.mscomm.ngoservice.dto.*;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor

public class NgoServiceImpl implements NgoService {

	 private NgoRepository ngoRepository;
	    private RestTemplate restTemplate;
	@Override
	public Ngo saveNgo(Ngo ngo) {
		return ngoRepository.save(ngo);
	}
	
	@Override
	public ResponseDto getNgo(Long ngoId) {

        ResponseDto responseDto = new ResponseDto();
        Ngo ngo = ngoRepository.findById(ngoId).get();
        NgoDto ngoDto = mapToNgo(ngo);

        ResponseEntity<DonationDto> responseEntity = restTemplate
                .getForEntity("http://springboot-donationservice:8082/api/donations/" + ngo.getDonationId(),
                DonationDto.class);

        DonationDto donationDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        responseDto.setNgo(ngoDto);
        responseDto.setDonation(donationDto);

        return responseDto;
	}
	
	
	private NgoDto mapToNgo(Ngo ngo){
        NgoDto ngoDto = new NgoDto();
        ngoDto.setId(ngo.getId());
        ngoDto.setNgoName(ngo.getNgoName());
        
        return ngoDto;
    }
	@Override
	public List<Ngo> getAllNgos() {
	    return ngoRepository.findAll();
	}
	@Override
	public ResponseDto getNgoByName(String ngoName) {
	    ResponseDto responseDto = new ResponseDto();
	    List<Ngo> ngos = ngoRepository.findByNgoName(ngoName);
	    List<DonationDto> donationDtos = new ArrayList<>();

	    for (Ngo ngo : ngos) {
	        NgoDto ngoDto = mapToNgo(ngo);

	        ResponseEntity<DonationDto> responseEntity = restTemplate
	                .getForEntity("http://springboot-donationservice:8082/api/donations/" + ngo.getDonationId(),
	                        DonationDto.class);

	        DonationDto donationDto = responseEntity.getBody();

	        System.out.println(responseEntity.getStatusCode());

	        donationDtos.add(donationDto);
	        responseDto.setNgo(ngoDto);
	    }

	    responseDto.setDonations(donationDtos);

	    return responseDto;
	}


}
