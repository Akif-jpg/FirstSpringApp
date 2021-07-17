package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetap.models.VehicleType;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType,Integer> {

}
