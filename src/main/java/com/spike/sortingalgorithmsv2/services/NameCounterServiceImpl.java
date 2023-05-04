package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.entities.NameCount;
import com.spike.sortingalgorithmsv2.patternAlgorithm.NameCounter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class NameCounterServiceImpl implements NameCounterService{

    private final NameCounter nameCounter;

    public NameCounterServiceImpl(NameCounter nameCounter){
        this.nameCounter=nameCounter;
    }

    @Override
    public ResponseEntity<List<NameCount>> getNamesAndCountOfThem(){
        return ResponseEntity.ok(nameCounter.count());
    }
}
