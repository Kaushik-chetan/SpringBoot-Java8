package com.project.model;

public class Address {
	
	private String street;
	
	private String locality;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private Long pinCode;
	
	
	public Address() {
		super();
	}

	public Address(String street, String locality, String city, String state, String country, Long pinCode) {
		super();
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPinCode() {
		return pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	
	
	
	

}
