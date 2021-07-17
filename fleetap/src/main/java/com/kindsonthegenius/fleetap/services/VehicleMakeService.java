package com.kindsonthegenius.fleetap.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetap.models.VehicleMake;
import com.kindsonthegenius.fleetap.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
	
	public List<VehicleMake>  getVehicleMakes() {
		return vehicleMakeRepository.findAll();
	}
	
	//Save new location
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}

	//get by id
	public Optional<VehicleMake> findById(Integer id){
		return vehicleMakeRepository.findById(id);
	}
	
	public void delete(Integer id) {
		vehicleMakeRepository.deleteById(id);
	}
}
