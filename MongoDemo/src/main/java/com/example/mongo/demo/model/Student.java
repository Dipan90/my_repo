package com.example.mongo.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	
	@Id
	private int st_id;
	
	private String st_name;
	
	private List<Address> st_addresses;

	public int getSt_id() {
		return st_id;
	}

	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public List<Address> getSt_addresses() {
		return st_addresses;
	}

	public void setSt_addresses(List<Address> st_addresses) {
		this.st_addresses = st_addresses;
	}
	
	
	
	

}
