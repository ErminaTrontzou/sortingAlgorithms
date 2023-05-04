package com.spike.sortingalgorithmsv2.services;


import com.spike.sortingalgorithmsv2.repositories.EmployerRepository;
import com.spike.sortingalgorithmsv2.repositories.SalariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployerServiceImpl implements EmployerService{
    private final EmployerRepository employerRepository;

    public EmployerServiceImpl(EmployerRepository employerRepository){
        this.employerRepository=employerRepository;
    }


    @Override
    public ResponseEntity<?> listAllEmployers(){
        return new ResponseEntity<>(employerRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> listAllSalaries(){
        return new ResponseEntity<>(employerRepository.getAllSalaries(), HttpStatus.OK);
    }

//    @Override
//    public ResponseEntity<?> listAllSortedSalaries(Sort sort){
//        return new ResponseEntity<>(employerRepository.sortAllSalaries(sort),HttpStatus.OK);
//    }
}
