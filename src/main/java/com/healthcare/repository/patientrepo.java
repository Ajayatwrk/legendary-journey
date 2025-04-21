package com.healthcare.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.domain.patientdetails;
public interface  patientrepo extends JpaRepository<patientdetails, String> {
    public static patientdetails findByNameandId(String name,int id) {
        throw new UnsupportedOperationException("Unimplemented method 'findByNameandId'");
    }
}
