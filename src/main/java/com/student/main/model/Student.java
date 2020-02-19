package com.student.main.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Builder;
@Builder
@XmlRootElement
public class Student {
	String ID;
	String name;
	String Address;
	String subject;
	public Student() {}
	
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", Address=" + Address + ", subject=" + subject + "]";
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject1) {
		subject = subject1;
	}

	public Student(String iD, String name, String address, String subject1) {
		super();
		ID = iD;
		this.name = name;
		Address = address;
		subject = subject1;
	}
	
	
	

}
