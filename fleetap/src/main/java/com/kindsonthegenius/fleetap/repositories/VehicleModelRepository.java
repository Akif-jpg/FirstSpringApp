package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetap.models.VehicleModel;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {

}
