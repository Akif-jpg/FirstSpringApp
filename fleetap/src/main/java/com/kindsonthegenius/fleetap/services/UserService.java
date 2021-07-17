package com.kindsonthegenius.fleetap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetap.models.User;
import com.kindsonthegenius.fleetap.repositories.UserRepository;

@Service
public class UserService {
	@Autowired UserRepository userRepository;
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

}
