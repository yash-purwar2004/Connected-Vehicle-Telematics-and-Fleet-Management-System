package com.example.fleet_management_system.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.fleet_management_system.entity.User;
import com.example.fleet_management_system.service.AdminService;

@Controller
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admin/dashboard")
    public String dashboard(Model model) {

        model.addAttribute("totalUsers",
                adminService.getTotalUsers());

        return "admin/dashboard";
    }

    @GetMapping("/admin/users")
    public String users(Model model) {

        List<User> users = adminService.getAllUsers();

        model.addAttribute("users", users);

        return "admin/user";
    }
}