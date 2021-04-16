package com.jayshreedesai.patient.patientupdates.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jayshreedesai.patient.patientupdates.entity.Patient;
import com.jayshreedesai.patient.patientupdates.service.PatientService;


@Controller
@RequestMapping("/patients")
public class PatientController {

	private PatientService patientService;
	
	public PatientController(PatientService thePatientService) {
		patientService = thePatientService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// get Patients from db
		List<Patient> thePatients = patientService.findAll();
		
		// add to the spring model
		theModel.addAttribute("patients", thePatients);
		
		return "patients/list-patients";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Patient thePatient = new Patient();
		
		theModel.addAttribute("patient", thePatient);
		
		return "patients/patient-form";
	}
	
	@GetMapping("/showFormForSearch")
	public String showFormForSearch(Model theModel) {
		
		// create model attribute to bind form data
		Patient thePatient = new Patient();
		
		theModel.addAttribute("patient", thePatient);
		
		return "patients/search-patient-form";
	}
	
	@GetMapping("/searchResult")
	public String search(@RequestParam("fullName") String name,
			Model theModel) {
		
		// create model attribute to bind form data
		Patient thePatient = patientService.findByfullName(name);
		
		theModel.addAttribute("patient", thePatient);
		
		return "patients/search-patient-form";
	} 
	
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("patientId") int theId,
									Model theModel) {
		
		// get the patient from the service
		Patient thePatient = patientService.findById(theId);
		
		// set patient as a model attribute to pre-populate the form
		theModel.addAttribute("patient", thePatient);
		
		// send over to our form
		return "patients/patient-form";			
	}
	
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("patient") Patient thePatient) {
		
		// save the patient
		patientService.save(thePatient);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/patients/list";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("patientId") int theId) {
		
		// delete the patient
		patientService.deleteById(theId);
		
		// redirect to /patients/list
		return "redirect:/patients/list";
		
	}
}


















