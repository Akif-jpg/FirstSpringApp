package com.kindsonthegenius.fleetap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetap.models.VehicleMovement;
import com.kindsonthegenius.fleetap.services.LocationService;
import com.kindsonthegenius.fleetap.services.VehicleMovementService;
import com.kindsonthegenius.fleetap.services.VehicleService;

@Controller
public class VehicleMovementController {


	
	@Autowired	private VehicleMovementService vehicleMovementService;
	@Autowired	private VehicleService vehicleService;
	@Autowired	private LocationService locationService;


	@GetMapping("/vehicleMovements")
	public String getVehicleMovements(Model model) {		
		model.addAttribute("vehicleMovements", vehicleMovementService.getVehicleMovements());	
		
		model.addAttribute("vehicles", vehicleService.getVehicles());
		model.addAttribute("locations", locationService.getLocations());
		

		
		return "VehicleMovement";
	}	
	
	@PostMapping("/vehicleMovements/addNew")
	public String addNew(VehicleMovement vehicleMovement) {
		vehicleMovementService.save(vehicleMovement);
		return "redirect:/vehicleMovements";
	}
	
	@RequestMapping("vehicleMovements/findById")
	@ResponseBody
	public Optional<VehicleMovement> findById(int id) {
	  return vehicleMovementService.findById(id);	
	}	
	
	@RequestMapping(value="/vehicleMovements/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleMovement vehicleMovement) {
		vehicleMovementService.save(vehicleMovement);
		return "redirect:/vehicleMovements";
	}
	
	@RequestMapping(value="/vehicleMovements/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleMovementService.delete(id);
		return "redirect:/vehicleMovements";
	}

}

