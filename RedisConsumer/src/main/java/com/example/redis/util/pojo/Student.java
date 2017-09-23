package com.example.redis.util.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Student implements Serializable{

	private int id;
	
	private String name;
	
	private int contact;
	
	private String dob;

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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
