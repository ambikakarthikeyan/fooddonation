package com.mscomm.ngoservice.dto;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
	 private DonationDto donation;
	    private NgoDto ngo;
	    private List<DonationDto> donations;
	  

}
