package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetap.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
