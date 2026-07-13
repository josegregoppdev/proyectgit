package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.UserService;

@Controller
public class DashboardController {

    private final UserService userService;

    public DashboardController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("totalUsers", userService.findAll().size());
        model.addAttribute("users", userService.findAll());
        return "dashboard";
    }
}
