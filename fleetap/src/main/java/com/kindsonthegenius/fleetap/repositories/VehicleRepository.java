package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

}
