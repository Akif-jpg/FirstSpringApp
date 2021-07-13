package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {

}
