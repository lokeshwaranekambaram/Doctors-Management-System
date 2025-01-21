package com.system.doctors.controller;

import com.system.doctors.model.Doctors;
import com.system.doctors.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DoctorsController {
    @Autowired
    private DoctorsService doctorsService;

    @GetMapping("/h1")
    public String Welcome()
    {
        return "Hello Boxx,Welcome";
    }
    @GetMapping("/find")
    public List<Doctors>AllDoctors()
    {
        return
    }
}
