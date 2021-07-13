package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.State;

public interface StateRepository extends JpaRepository<State,Integer> {

}
