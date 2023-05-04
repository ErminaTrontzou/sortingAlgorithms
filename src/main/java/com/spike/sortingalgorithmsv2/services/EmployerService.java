package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.sort.Sort;
import org.springframework.http.ResponseEntity;

public interface EmployerService {

    public  ResponseEntity<?> listAllEmployers();

    public ResponseEntity<?> listAllSalaries();



//    public ResponseEntity<?> listAllSortedSalaries(Sort sort);
}
