package com.kindsonthegenius.fleetap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetap.models.JobTitle;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle,Integer> {

}
