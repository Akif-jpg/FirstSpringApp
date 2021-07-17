package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetap.models.VehicleMake;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake,Integer> {

}
