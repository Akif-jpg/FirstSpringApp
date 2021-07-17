package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetap.models.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
