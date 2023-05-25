package com.mscomm.donationservice.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Donation")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Donation {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String itemName;
	    private String itemDescription;
	    private String ngoName;
	    private String date;
	    private String quantity;
	    private String imageUrl;
}
