package com.jayshreedesai.patient.patientupdates.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
		
	// define constructors
	public Patient() {	
	}


	public Patient(int id, String fullName, String gender, String phoneNumber) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}


	// define getter/setter

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	// define tostring

	@Override
	public String toString() {
		return "Patient [id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", phoneNumber=" + phoneNumber
				+ "]";
	}
		
}











