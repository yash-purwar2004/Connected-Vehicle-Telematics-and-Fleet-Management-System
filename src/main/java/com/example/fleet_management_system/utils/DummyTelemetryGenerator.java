// package com.example.fleet_management_system.utils;

// import java.time.LocalDateTime;
// import java.util.Random;

// import org.springframework.scheduling.annotation.Scheduled;
// import org.springframework.stereotype.Component;

// import com.example.fleet_management_system.entity.Telemetry;
// import com.example.fleet_management_system.entity.Vehicle;

// @Component
// public class DummyTelemetryGenerator {

//     private final Random random = new Random(); // It is used to generate random telemetry data
//     @Scheduled(fixedRate = 5000) // It will run every 5 seconds to generate telemetry data for all vehicles
//     public Telemetry generate(Vehicle vehicle) {

//         Telemetry telemetry = new Telemetry();

//         telemetry.setVehicle(vehicle);

//         telemetry.setLatitude(9.9252 + random.nextDouble() * 0.02);

//         telemetry.setLongitude(78.1198 + random.nextDouble() * 0.02);

//         telemetry.setSpeed(40 + random.nextDouble() * 60);

//         telemetry.setFuelLevel(20 + random.nextDouble() * 80);

//         telemetry.setRecordedAt(LocalDateTime.now());

//         return telemetry;
//     }
// }
