package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.VehicleModel;

public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {

}
