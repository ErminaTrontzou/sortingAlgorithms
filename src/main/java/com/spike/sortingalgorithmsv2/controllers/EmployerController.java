package com.spike.sortingalgorithmsv2.controllers;


import com.spike.sortingalgorithmsv2.services.EmployerServiceImpl;
import com.spike.sortingalgorithmsv2.sort.MergeSort;
import com.spike.sortingalgorithmsv2.sort.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employers")
public class EmployerController {

    private final EmployerServiceImpl employerService;

    EmployerController(EmployerServiceImpl employerService){
        this.employerService=employerService;
    }

    @GetMapping("")
    public ResponseEntity<?> listAllEmployers(){
        return employerService.listAllEmployers();
    }

    @GetMapping("/salaries")
    public ResponseEntity<?> listAllSalaries(){
        return employerService.listAllSalaries();
    }

//    @GetMapping("/salaries/merge")
//    public ResponseEntity<?> listAllSortedWithMergeSalaries(){
//        Sort sortMethod = new MergeSort();
//        return employerService.listAllSortedSalaries(sortMethod);
//    }

}
