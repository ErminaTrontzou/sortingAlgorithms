package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.entities.SalariesOfProfessions;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SalariesService {

    public ResponseEntity<List<SalariesOfProfessions>> listAllSalariesWithProfession();

}
