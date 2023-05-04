package com.spike.sortingalgorithmsv2.services;


import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.repositories.EmployerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerServiceImpl implements EmployerService{
    private final EmployerRepository employerRepository;

    public EmployerServiceImpl(EmployerRepository employerRepository){
        this.employerRepository=employerRepository;
    }


    @Override
    public ResponseEntity<List<Employer>> listAllEmployers(){
        return  ResponseEntity.ok(employerRepository.findAll());
    }


//    @Override
//    public ResponseEntity<?> listAllSortedSalaries(Sort sort){
//        return new ResponseEntity<>(employerRepository.sortAllSalaries(sort),HttpStatus.OK);
//    }
}
