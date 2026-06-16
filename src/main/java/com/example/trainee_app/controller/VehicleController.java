package com.example.trainee_app.controller;

import com.example.trainee_app.entities.Vehicle;
import com.example.trainee_app.service.AddVehicleService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final AddVehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // ── POST /vehicles ──
    @PostMapping
    public ResponseEntity<Vehicle> create(@Valid @RequestBody Vehicle vehicle) {
        return ResponseEntity.ok(vehicleService.createVehicle(vehicle));
    }

    // ── GET /vehicles ──
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAll() {
        return ResponseEntity.ok(vehicleService.getAllVehicles());
    }

    // ── GET /vehicles/paged ──
    @GetMapping("/paged")
    public ResponseEntity<Page<Vehicle>> getAllPaged(
            @RequestParam(defaultValue = "0")  int page,
            @RequestParam(defaultValue = "5")  int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sortBy));
        return ResponseEntity.ok(vehicleService.getAllVehiclesPaged(pageRequest));
    }

    // ── GET /vehicles/{id} ──
    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ── GET /vehicles/code/{vehicleId} — find by business code like "V101" ──
    @GetMapping("/code/{vehicleId}")
    public ResponseEntity<Vehicle> getByCode(@PathVariable String vehicleId) {
        return vehicleService.getVehicleByCode(vehicleId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ── PUT /vehicles/{id} ──
    @PutMapping("/{id}")
    public ResponseEntity<Vehicle> update(@PathVariable Long id,
                                          @Valid @RequestBody Vehicle vehicle) {
        return ResponseEntity.ok(vehicleService.updateVehicle(id, vehicle));
    }

    // ── DELETE /vehicles/{id} ──
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
        return ResponseEntity.ok("Vehicle deleted successfully.");
    }
}
