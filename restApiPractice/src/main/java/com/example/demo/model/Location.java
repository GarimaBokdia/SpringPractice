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
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
