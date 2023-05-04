package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.entities.NameCount;
import com.spike.sortingalgorithmsv2.patternAlgorithm.NameCounter;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NameCounterService {

    public ResponseEntity<List<NameCount>> getNamesAndCountOfThem();
}
