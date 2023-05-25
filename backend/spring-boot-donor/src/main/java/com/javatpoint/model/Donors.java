package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import java.util.*;
//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table
public class Donors {
//Defining donor id as primary key  
	@Id
	@Column
	private int donorid;
	@Column
	private String donorName;
	@Column
	private String donorEmail;
	@Column
	private String donorPassword;
	@Column
	private String bio;
	@Column 
	private String location;
	public int getDonorid() {
		return donorid;
	}
	public void setDonorid(int donorid) {
		this.donorid = donorid;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getDonorEmail() {
		return donorEmail;
	}
	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}
	public String getDonorPassword() {
		return donorPassword;
	}
	public void setDonorPassword(String donorPassword) {
		this.donorPassword = donorPassword;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


}
