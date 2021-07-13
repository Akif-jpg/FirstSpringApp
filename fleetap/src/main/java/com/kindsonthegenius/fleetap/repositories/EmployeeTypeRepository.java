package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.EmployeeType;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Integer> {

}