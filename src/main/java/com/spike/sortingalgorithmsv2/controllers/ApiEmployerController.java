package com.spike.sortingalgorithmsv2.controllers;


import com.spike.sortingalgorithmsv2.services.ApiEmployerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/api-employer")
public class ApiEmployerController {

    private final ApiEmployerService apiEmployerService;

    public ApiEmployerController(ApiEmployerService apiEmployerService){
        this.apiEmployerService=apiEmployerService;
    }

    @GetMapping("")
    public ResponseEntity<?> getApiEmployer(){
        return apiEmployerService.getEmployerFromApi();
    }
}
