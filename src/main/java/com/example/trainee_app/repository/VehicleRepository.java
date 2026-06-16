package com.example.trainee_app.repository;

import com.example.trainee_app.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // Custom query: check by Id
    boolean existsByVehicleId(String vehicleId);
    java.util.Optional<Vehicle> findByVehicleId(String vehicleId);}