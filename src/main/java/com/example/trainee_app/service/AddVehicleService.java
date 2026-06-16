package com.example.trainee_app.service;

import com.example.trainee_app.entities.Vehicle;
import com.example.trainee_app.repository.VehicleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AddVehicleService {

    private final VehicleRepository vehicleRepository;

    public AddVehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    // ── CREATE — prevents duplicate vehicleId (business code like "V101") ──
    public Vehicle createVehicle(Vehicle vehicle) {
        if (vehicleRepository.existsByVehicleId(vehicle.getVehicleId())) {
            throw new RuntimeException("Vehicle ID already exists: " + vehicle.getVehicleId());
        }
        return vehicleRepository.save(vehicle);
    }

    // ── READ ALL ──
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // ── READ ALL PAGED ──
    public Page<Vehicle> getAllVehiclesPaged(Pageable pageable) {
        return vehicleRepository.findAll(pageable);
    }

    // ── READ BY DB ID ──
    public Optional<Vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    // ── READ BY BUSINESS CODE ──
    public Optional<Vehicle> getVehicleByCode(String vehicleId) {
        return vehicleRepository.findByVehicleId(vehicleId);
    }

    // ── UPDATE ──
    public Vehicle updateVehicle(Long id, Vehicle updatedVehicle) {
        Vehicle existing = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found with id: " + id));
        existing.setVehicleModel(updatedVehicle.getVehicleModel());
        existing.setRentalPricePerDay(updatedVehicle.getRentalPricePerDay());
        return vehicleRepository.save(existing);
    }

    // ── DELETE ──
    public void deleteVehicle(Long id) {
        if (!vehicleRepository.existsById(id)) {
            throw new RuntimeException("Vehicle not found with id: " + id);
        }
        vehicleRepository.deleteById(id);
    }
}
