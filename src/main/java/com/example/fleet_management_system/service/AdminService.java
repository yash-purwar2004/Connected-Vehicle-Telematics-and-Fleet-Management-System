package com.example.fleet_management_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fleet_management_system.entity.User;
import com.example.fleet_management_system.repository.UserRepository;

@Service
public class AdminService {

    private final UserRepository userRepository;

    public AdminService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public long getTotalUsers() {
        return userRepository.count();
    }
}