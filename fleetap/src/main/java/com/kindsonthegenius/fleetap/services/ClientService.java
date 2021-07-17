package com.kindsonthegenius.fleetap.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetap.models.Client;
import com.kindsonthegenius.fleetap.repositories.ClientRepository;



@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	//Get list of all clients
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
	
	//Save new client
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	//get by id
	public Optional<Client> findById(int id) {
		return clientRepository.findById(id);
	}

	public void delete(Integer id) {
		clientRepository.deleteById(id);
	}

}