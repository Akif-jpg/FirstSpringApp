package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.VehicleStatus;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Integer> {

}
