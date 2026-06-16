package com.example.trainee_app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Vehicle ID is required")
    @Column(name = "vehicle_code", nullable = false, unique = true)
    private String vehicleId;

    @NotBlank(message = "Vehicle model is required")
    @Column(nullable = false)
    private String vehicleModel;

    @Min(value = 0, message = "Rental price cannot be negative")
    @Column(nullable = false)
    private int rentalPricePerDay;

    // ── No-arg constructor required by JPA ──
    public Vehicle() {}

    public Vehicle(String vehicleId, String vehicleModel, int rentalPricePerDay) {
        this.vehicleId        = vehicleId;
        this.vehicleModel     = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // ── Getters ──
    public Long   getId()                { return id;                }
    public String getVehicleId()         { return vehicleId;         }
    public String getVehicleModel()      { return vehicleModel;      }
    public int    getRentalPricePerDay() { return rentalPricePerDay; }

    // ── Setters ──
    public void setId(Long id)                          { this.id                = id;                }
    public void setVehicleId(String vehicleId)          { this.vehicleId         = vehicleId;         }
    public void setVehicleModel(String vehicleModel)    { this.vehicleModel      = vehicleModel;      }
    public void setRentalPricePerDay(int price)         { this.rentalPricePerDay = price;             }
}
