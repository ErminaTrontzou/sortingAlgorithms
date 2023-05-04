package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.repositories.SalariesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SalariesServiceImpl implements  SalariesService{

    private final SalariesRepository salariesRepository;

    public SalariesServiceImpl(SalariesRepository salariesRepository){
        this.salariesRepository=salariesRepository;
    }

    @Override
    public ResponseEntity<?> listAllSalariesWithProfession(){
        return new ResponseEntity<>(salariesRepository.getAllSalaries(), HttpStatus.OK);
    }
}
