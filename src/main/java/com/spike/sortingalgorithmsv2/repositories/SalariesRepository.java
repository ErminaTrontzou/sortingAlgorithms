package com.spike.sortingalgorithmsv2.repositories;

import com.spike.sortingalgorithmsv2.entities.SalariesOfProfessions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalariesRepository extends CrudRepository<SalariesOfProfessions,Long> {

    @Query(value = "SELECT e.salary, p.title  FROM Employer e LEFT JOIN Profession p ON  e.profession=p.id")
    public List<SalariesOfProfessions> getAllSalaries();
}
