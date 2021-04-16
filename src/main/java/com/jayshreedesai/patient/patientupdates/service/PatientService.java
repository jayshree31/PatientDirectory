package com.jayshreedesai.patient.patientupdates.service;

import java.util.List;

import com.jayshreedesai.patient.patientupdates.entity.Patient;


public interface PatientService {

	public List<Patient> findAll();
	
	public Patient findById(int theId);
	
	public Patient findByfullName(String name);
	
	public void save(Patient thePatient);
	
	public void deleteById(int theId);
	
	
	
}
