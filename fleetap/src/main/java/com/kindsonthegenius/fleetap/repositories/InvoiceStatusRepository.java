package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.InvoiceStatus;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Integer> {

}
