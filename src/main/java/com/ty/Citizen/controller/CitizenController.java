package com.ty.Citizen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ty.Citizen.dao.CitizenDao;
import com.ty.Citizen.dto.Citizen;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

	@Autowired
	private CitizenDao citizenDao;
	
	

	@RequestMapping(path = "/display")
	public ResponseEntity<String> display() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<Citizen> saveCitizen(@RequestBody Citizen citizen) {
		Citizen newCitizen = citizenDao.saveCitizen(citizen);
		return new ResponseEntity<Citizen>(newCitizen, HttpStatus.OK);
	}

	@GetMapping("/getAll/{id}")
	public ResponseEntity<List<Citizen>> getAllByVaccinationCenterId(@PathVariable int id) {
		List<Citizen> citizens = citizenDao.getAllByVaccinationCenterId(id);
		return new ResponseEntity<List<Citizen>>(citizens, HttpStatus.OK);
	}
}
