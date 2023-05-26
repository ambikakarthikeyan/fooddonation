package com.mscomm.ngoservice.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ngos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ngo {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String ngoName;
	   
	    private String donationId;
}
