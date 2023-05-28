package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;
//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table
public class Volunteers {
public int getVolunteerid() {
		return volunteerid;
	}
	public void setVolunteerid(int volunteerid) {
		this.volunteerid = volunteerid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getVechicleno() {
		return vechicleno;
	}
	public void setVechicleno(String vechicleno) {
		this.vechicleno = vechicleno;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	//Defining volunteer id as primary key  
	@Id
	@Column
	private int volunteerid;
	@Column
	private String vname ;
	@Column
	private String location;
	@Column
	private String phoneno;
	@Column
	private String vechicleno;

	@Column
	private String photo;

	
		public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
		@Column
	private String available;
}
