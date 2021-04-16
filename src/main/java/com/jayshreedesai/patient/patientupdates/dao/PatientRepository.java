 package com.jayshreedesai.patient.patientupdates.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayshreedesai.patient.patientupdates.entity.Patient;


public interface PatientRepository extends JpaRepository<Patient, Integer> {

	
	// add a method to sort by last name
	public List<Patient> findAllByOrderByFullNameAsc();
	
	public Optional<Patient> findByFullName(String name);
	
	
	
}
