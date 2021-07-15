package com.kindsonthegenius.fleetap.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetap.models.State;
import com.kindsonthegenius.fleetap.repositories.StateRepository;

@Service
public class StateService {
	@Autowired
	StateRepository stateRepository;
	
	public List<State> getStates(){
		return stateRepository.findAll();
	}
	
	public void save(State state) {
		stateRepository.save(state);
	}
	
	public void delete(Integer id) {
		stateRepository.deleteById(id);
	}
	
	public Optional<State> findById(Integer id){
		return stateRepository.findById(id);
	}	
}
