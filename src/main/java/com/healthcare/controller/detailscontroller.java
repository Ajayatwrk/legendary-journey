package com.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.healthcare.service.patientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class detailscontroller {
    @Autowired
    public patientService patientService;
    @GetMapping("/login")
    public String login() {
        return "login Successful";
    }
    
}
