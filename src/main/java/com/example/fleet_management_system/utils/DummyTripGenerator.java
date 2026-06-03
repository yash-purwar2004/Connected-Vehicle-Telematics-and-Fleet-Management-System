package com.example.fleet_management_system.utils;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.example.fleet_management_system.entity.Trip;
import com.example.fleet_management_system.entity.User;
import com.example.fleet_management_system.entity.Vehicle;
import com.example.fleet_management_system.entity.enums.TripStatus;

@Component
public class DummyTripGenerator {
    private final Random random = new Random();

    public Trip generate(Vehicle vehicle, User driver) {

        LocalDateTime start =
                LocalDateTime.now()
                        .minusHours(random.nextInt(24));

        LocalDateTime end =
                start.plusHours(1 + random.nextInt(10));

        Trip trip = new Trip();

        trip.setVehicle(vehicle);

        trip.setDriver(driver);

        trip.setStartTime(start);

        trip.setEndTime(end);

        trip.setDistanceKm(
                50 + random.nextDouble() * 450
        );

        trip.setTripStatus(TripStatus.COMPLETED);

        return trip;
    }
}
