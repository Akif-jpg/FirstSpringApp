package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetap.models.JobTitle;



public interface JobTitleRepository extends JpaRepository<JobTitle,Integer> {

}
