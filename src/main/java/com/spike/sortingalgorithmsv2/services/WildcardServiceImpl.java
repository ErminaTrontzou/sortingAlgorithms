package com.spike.sortingalgorithmsv2.services;

import com.spike.sortingalgorithmsv2.patternAlgorithm.WildcardMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WildcardServiceImpl implements WildcardService {

    private final WildcardMatcher wildcardMatcher;

    public WildcardServiceImpl(WildcardMatcher wildcardMatcher){
        this.wildcardMatcher=wildcardMatcher;
    }

    @Override
    public ResponseEntity<?> getCountForNameJohn(){
        return new ResponseEntity<>(wildcardMatcher.wildcardCounter(), HttpStatus.OK);

    }
}
