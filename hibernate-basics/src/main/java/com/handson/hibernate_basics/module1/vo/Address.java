package com.handson.hibernate_basics.module1.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="Test")
@Setter
@Getter
public class Address {

	@Id
	@GeneratedValue
	private int addressId;

	private String streetName;
	private String city;
	private String state;
	private int zipcode;

	public Address(String streetName, String city, String state, int zipcode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

}
