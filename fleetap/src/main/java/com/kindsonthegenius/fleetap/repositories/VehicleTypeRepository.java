package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.VehicleType;

public interface VehicleTypeRepository extends JpaRepository<VehicleType,Integer> {

}
