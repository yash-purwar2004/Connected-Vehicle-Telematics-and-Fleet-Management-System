package com.example.fleet_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fleet_management_system.entity.Telemetry;

public interface TelemetryRepository extends JpaRepository<Telemetry, Integer> {
    
}
