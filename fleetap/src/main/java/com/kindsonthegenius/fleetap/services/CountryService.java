package com.kindsonthegenius.fleetap.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetap.models.Country;
import com.kindsonthegenius.fleetap.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	//Save new country
	public void save(Country country) {
		countryRepository.save(country);
	}

	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}
	
}
