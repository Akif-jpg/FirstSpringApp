package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetap.models.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

}
