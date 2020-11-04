package com.jfs.spring.SpringAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	
	private String street;
	
	
	private String city;
	
 
	private String country;
	
	
	public void setStreet(String street) {
		System.out.println("set street");
		this.street = street;
	}
	
	public void setCity(String city) {
		System.out.println("set city");
		this.city = city;
	}
	
	
	public void setCountry(String country) {
		System.out.println("set country");
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	

}
