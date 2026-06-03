package com.example.fleet_management_system.entity;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ServiceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceRecordId;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    private LocalDate serviceDate;

    private String serviceType;

    private Integer odometerReading;

    private Double serviceCost;

    private LocalDate nextServiceDueDate;

    public ServiceRecord(Vehicle vehicle, LocalDate serviceDate, String serviceType, Integer odometerReading, Double serviceCost, LocalDate nextServiceDueDate) {
        this.vehicle = vehicle;
        this.serviceDate = serviceDate;
        this.serviceType = serviceType;
        this.odometerReading = odometerReading;
        this.serviceCost = serviceCost;
        this.nextServiceDueDate = nextServiceDueDate;
    }

    public Integer getServiceRecordId() {
        return serviceRecordId;
    }

    public void setServiceRecordId(Integer serviceRecordId) {
        this.serviceRecordId = serviceRecordId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(Integer odometerReading) {
        this.odometerReading = odometerReading;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public LocalDate getNextServiceDueDate() {
        return nextServiceDueDate;
    }

    public void setNextServiceDueDate(LocalDate nextServiceDueDate) {
        this.nextServiceDueDate = nextServiceDueDate;
    }
}
