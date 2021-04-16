package com.jayshreedesai.patient.patientupdates.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayshreedesai.patient.patientupdates.dao.PatientRepository;
import com.jayshreedesai.patient.patientupdates.entity.Patient;


@Service
public class PatientServiceImpl implements PatientService {

	private PatientRepository patientRepository;
	
	@Autowired
	public PatientServiceImpl(PatientRepository thepatientRepository) {
		patientRepository = thepatientRepository;
	}
	
	@Override
	public List<Patient> findAll() {
		return patientRepository.findAllByOrderByFullNameAsc();
	}

	@Override
	public Patient findById(int theId) {
		Optional<Patient> result = patientRepository.findById(theId);
		
		Patient thePatient = null;
		
		if (result.isPresent()) {
			thePatient = result.get();
		}
		else {
			// we didn't find the Patient
			throw new RuntimeException("Did not find Patient id - " + theId);
		}
		
		return thePatient;
	}

	@Override
	public void save(Patient thePatient) {
		patientRepository.save(thePatient);
	}

	@Override
	public void deleteById(int theId) {
		patientRepository.deleteById(theId);
	}

	@Override
	public Patient findByfullName(String name) {
		Optional<Patient> result = patientRepository.findByFullName(name);
		
		Patient thePatient = null;
		
		if (result.isPresent()) {
			thePatient = result.get();
		}
		else {
			// we didn't find the patient
			throw new RuntimeException("Did not find Patient with this name - " + name);
		}
		
		return thePatient;
	}

}






