package com.Happy_Trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Happy_Trip.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead , Long> {

}
