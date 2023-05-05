package com.spike.sortingalgorithmsv2.repositories;

import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.entities.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Integer> {

    @Query(value="Select p From Profession p Where p.title = :titleToSearch")
    public List<Profession> findByTitle(@Param("titleToSearch") String titleToSearch);
}
