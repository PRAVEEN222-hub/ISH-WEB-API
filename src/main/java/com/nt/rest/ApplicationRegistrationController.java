package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.CitizenData;
import com.nt.exp.InvalidSSNException;
import com.nt.service.ICitizenService;

@RestController
@RequestMapping("/citizenAR-api")
public class ApplicationRegistrationController {
	
	@Autowired
	private ICitizenService citizenService;
	
	@PostMapping("/save")
	
	public ResponseEntity<String> saveCitizen(@RequestBody CitizenData data) throws InvalidSSNException{

		       Integer userRegistration = citizenService.userRegistration(data);
		      
		return new ResponseEntity<String>("Citizen Application Registerde With Id Value::"+userRegistration,HttpStatus.CREATED);
		     
	
	
	}

}
