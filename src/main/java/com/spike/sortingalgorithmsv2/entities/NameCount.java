package com.spike.sortingalgorithmsv2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NameCount {
    private String name;
    private Integer count;
}
