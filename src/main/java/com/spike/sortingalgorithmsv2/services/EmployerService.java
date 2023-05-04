package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.entities.Employer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployerService {

    public  ResponseEntity<List<Employer>> listAllEmployers();


//    public ResponseEntity<?> listAllSortedSalaries(Sort sort);
}
