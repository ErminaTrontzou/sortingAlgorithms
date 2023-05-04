package com.spike.sortingalgorithmsv2.controllers;

import com.spike.sortingalgorithmsv2.entities.NameCount;
import com.spike.sortingalgorithmsv2.services.NameCounterServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/name-count")
public class NameCounterController {

    private final NameCounterServiceImpl nameCounterService;

    public NameCounterController(NameCounterServiceImpl nameCounterService){
        this.nameCounterService=nameCounterService;
    }

    @GetMapping("")
    public ResponseEntity<List<NameCount>> listALlNamesAndTheirCounts(){
        return nameCounterService.getNamesAndCountOfThem();
    }
}
