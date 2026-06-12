package com.example.fleet_management_system.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.fleet_management_system.entity.User;
import com.example.fleet_management_system.repository.UserRepository;

@Controller
public class AdminController {

    private final UserRepository userRepository;
    public AdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/admin/dashboard")
    public String dashboard(Model model) {
        return "admin/dashboard"; 
    }

    @GetMapping("/admin/users")
    public String users(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "admin/user";
    }
}
