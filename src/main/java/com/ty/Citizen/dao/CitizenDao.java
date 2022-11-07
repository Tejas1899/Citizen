package com.ty.Citizen.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Citizen.dto.Citizen;
import com.ty.Citizen.repository.CitizenRepository;

@Repository
public class CitizenDao {

	@Autowired
	private CitizenRepository citizenRepository;

	public Citizen saveCitizen(Citizen citizen) {
		return citizenRepository.save(citizen);
	}

	public List<Citizen> getAllByVaccinationCenterId(int id) {
		return citizenRepository.getAllByVaccinationCenterId(id);
	}

}
