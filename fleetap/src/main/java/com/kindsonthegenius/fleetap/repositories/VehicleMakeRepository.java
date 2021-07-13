package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.VehicleMaintenance;


public interface VehicleMakeRepository extends JpaRepository<VehicleMaintenance,Integer> {

}
