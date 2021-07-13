package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.VehicleMovement;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement,Integer> {

}
