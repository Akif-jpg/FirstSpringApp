package com.kindsonthegenius.fleetap.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetap.models.Country;
import com.kindsonthegenius.fleetap.models.State;
import com.kindsonthegenius.fleetap.services.CountryService;
import com.kindsonthegenius.fleetap.services.StateService;

@Controller
public class StateController {
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/states")
	public String getstates(Model model) {
		List<State> StateList = stateService.getStates();		
		model.addAttribute("states", StateList);
		
		List<Country> countryList = countryService.getCountries();	
		model.addAttribute("countries", countryList);
		
		return "State";
	}	
	
	@PostMapping("/states/addNew")
	public String addNew(State State) {
		stateService.save(State);
		return "redirect:/states";
	}	
	
	@RequestMapping(value="/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(State State) {
		stateService.save(State);
		return "redirect:/states";
	}
	
	@RequestMapping("/states/findById") 
	@ResponseBody
	public Optional<State> findById(int id)
	{
		return stateService.findById(id);
	}
	
	@RequestMapping(value = "/states/delete", method = {RequestMethod.DELETE , RequestMethod.GET})
	public String delete(Integer id) {
		stateService.delete(id);
		return "redirect:/states";
	}
}
