package com.fls;

import java.io.Serializable;

public class Customer implements Serializable
{	//using serialversionid to encode and decode data
	private static final long serialVersionUID=1L;
	private int id;
	private String name;
	private String city;
	private transient int pincode;
	//transient and volatile(excluding from locking & unlocking operations), it helps to remove unnecessary storage spaces
	volatile int abcd;
	public Customer() 
	{
		
	}
	public Customer(int id, String name, String city, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pincode = pincode;
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
