package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.Supplier;

public interface SuppliersRepository extends JpaRepository<Supplier,Integer> {

}
