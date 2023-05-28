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
public class Ngos {
//Defining ngo id as primary key  
	@Id
	@Column
	private int ngoid;
	@Column
	private String ngoName;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String certificate;
	@Column 
	private String location;
	public int getNgoid() {
		return ngoid;
	}
	public void setNgoid(int ngoid) {
		this.ngoid = ngoid;
	}
	public String getNgoName() {
		return ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


}
