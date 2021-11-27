package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(schema = "public",name="Location")
public class Location {
	
	@Id
	@Column(name="location_id")
	int locationId;
	
	@Column(name="address")
	String address;
	
	@Column(name="zipcode")
	String zipcode;
	
	@Column(name="city")
	String city;
	
	public int getLocationId() {
		return locationId;
	}
	public String getAddress() {
		return address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getCity() {
		return city;
	}
	
}
