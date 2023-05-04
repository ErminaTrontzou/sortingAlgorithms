package com.spike.sortingalgorithmsv2.services;


import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.patternAlgorithm.WildcardMatcher;
import com.spike.sortingalgorithmsv2.repositories.EmployerRepository;
import com.spike.sortingalgorithmsv2.repositories.SalariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @Override
    public ResponseEntity<List<Object[]>> listAllSalaries(){
        return ResponseEntity.ok( employerRepository.getAllSalaries());
    }


//    @Override
//    public ResponseEntity<?> listAllSortedSalaries(Sort sort){
//        return new ResponseEntity<>(employerRepository.sortAllSalaries(sort),HttpStatus.OK);
//    }
}
