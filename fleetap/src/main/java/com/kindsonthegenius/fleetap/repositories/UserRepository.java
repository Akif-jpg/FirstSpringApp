package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
