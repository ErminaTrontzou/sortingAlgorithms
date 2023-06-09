package com.spike.sortingalgorithmsv2.controllers;

import com.spike.sortingalgorithmsv2.entities.SalariesOfProfessions;
import com.spike.sortingalgorithmsv2.services.SalariesServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/salaries")
public class SalariesController {

    private final SalariesServiceImpl salariesService;

    public SalariesController(SalariesServiceImpl salariesService){
        this.salariesService=salariesService;
    }

    @GetMapping("")
    public ResponseEntity<List<SalariesOfProfessions>> listAllSalariesWithProfession(){
        return salariesService.listAllSalariesWithProfession();
    }
}
