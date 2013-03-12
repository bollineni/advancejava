package com.excel.classes.jsp.el;

public class Person{
	public String name;
	public Address address;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAddress(Address address){
		this.address = address; 
	}
	public Address getAddress(){
		return address;
	}
}