package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
