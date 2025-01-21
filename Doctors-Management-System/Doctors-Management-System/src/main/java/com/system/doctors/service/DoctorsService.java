package com.system.doctors.service;

import com.system.doctors.repository.DoctorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorsService {
    @Autowired
    private DoctorsRepo doctorsRepo;


}
