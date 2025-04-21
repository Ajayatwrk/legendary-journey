package com.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.domain.patientdetails;
import com.healthcare.repository.patientrepo;

@Service
public class patientService<LoginRepo> {
    @Autowired
    public patientdetails log(String username, int id) {
        patientdetails user = patientrepo.findByNameandId(username, id);
        return user;
    }
}
