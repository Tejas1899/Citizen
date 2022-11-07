package com.ty.Citizen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Citizen.dto.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

	List<Citizen> getAllByVaccinationCenterId(int id);
}
