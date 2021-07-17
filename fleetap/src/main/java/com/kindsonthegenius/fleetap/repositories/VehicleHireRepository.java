package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetap.models.VehicleHire;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire,Integer> {

}
