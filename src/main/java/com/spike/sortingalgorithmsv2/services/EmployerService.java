package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.sort.Sort;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployerService {

    public  ResponseEntity<List<Employer>> listAllEmployers();

    public ResponseEntity<List<Object[]>> listAllSalaries();



//    public ResponseEntity<?> listAllSortedSalaries(Sort sort);
}
