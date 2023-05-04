package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.entities.SalariesOfProfessions;
import com.spike.sortingalgorithmsv2.repositories.EmployerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SalariesServiceImpl implements  SalariesService{

    private final EmployerRepository employerRepository;

    public SalariesServiceImpl(EmployerRepository employerRepository){
        this.employerRepository=employerRepository;
    }

    @Override
    public ResponseEntity<List<SalariesOfProfessions>> listAllSalariesWithProfession(){
        return  ResponseEntity.ok(employerRepository.getAllSalaries());
    }
}
