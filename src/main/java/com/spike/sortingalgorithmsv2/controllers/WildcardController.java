package com.spike.sortingalgorithmsv2.controllers;

import com.spike.sortingalgorithmsv2.services.WildcardServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/wildcard")
public class WildcardController {

    private final WildcardServiceImpl wildcardService;

    public WildcardController(WildcardServiceImpl wildcardService){
        this.wildcardService=wildcardService;
    }

    @GetMapping("/John")
        public ResponseEntity<?> getCountForNameJohn(){
            return wildcardService.getCountForNameJohn();
    }
}
