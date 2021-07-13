package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.Location;

public interface LocationRepository extends JpaRepository<Location,Integer> {

}
