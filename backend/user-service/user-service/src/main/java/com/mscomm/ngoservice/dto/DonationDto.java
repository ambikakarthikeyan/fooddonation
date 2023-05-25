package com.mscomm.ngoservice.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DonationDto {
	    private Long id;
	    private String itemName;
	    private String itemDescription;
	    private String ngoName;
	    private String date;
	    private String quantity;
	    private String imageUrl;
}
