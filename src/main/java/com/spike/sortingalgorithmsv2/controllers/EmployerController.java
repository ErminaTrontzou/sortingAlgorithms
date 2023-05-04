package com.spike.sortingalgorithmsv2.controllers;


import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.services.EmployerServiceImpl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/employers")
public class EmployerController {

    private final EmployerServiceImpl employerService;

    EmployerController(EmployerServiceImpl employerService){
        this.employerService=employerService;
    }

    @GetMapping("")
    public ResponseEntity<List<Employer>> listAllEmployers(){
        return employerService.listAllEmployers();
    }


//    @GetMapping("/salaries/merge")
//    public ResponseEntity<?> listAllSortedWithMergeSalaries(){
//        Sort sortMethod = new MergeSort();
//        return employerService.listAllSortedSalaries(sortMethod);
//    }

}
