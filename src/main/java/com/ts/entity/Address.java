package com.ts.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;
	private String location;
	private String country;
	private Integer pincode;
	private Integer houseNum;
	
	
	public Address(String city, String location, String country, Integer pincode, Integer houseNum) {
		this.city = city;
		this.location = location;
		this.country = country;
		this.pincode = pincode;
		this.houseNum = houseNum;
	}
	
	
	public Address() {
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Integer getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(Integer houseNum) {
		this.houseNum = houseNum;
	}
	
	
	
}
