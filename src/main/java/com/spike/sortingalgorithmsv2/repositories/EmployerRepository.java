package com.spike.sortingalgorithmsv2.repositories;

import com.spike.sortingalgorithmsv2.entities.Employer;
import com.spike.sortingalgorithmsv2.entities.SalariesOfProfessions;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployerRepository extends CrudRepository<Employer,Integer> {

    @NotNull
    List<Employer> findAll();

    @Query(value = "SELECT e.salary,p.title  FROM Employer e LEFT JOIN Profession p ON  e.profession=p.id GROUP BY p.title")
    public List<Object[]> queryAllSalaries();

     default List<SalariesOfProfessions> getAllSalaries() {
        List<Object[]> rows = queryAllSalaries();
        List<SalariesOfProfessions> result = new ArrayList<>();
        for (Object[] row : rows) {
            result.add(new SalariesOfProfessions((Integer) row[0], (String) row[1]));
        }
        return result;
    }


//    default List<Integer> sortAllSalaries(Sort sort){
//        List<Integer> salaries =  getAllSalaries();
//        sort.sort(salaries);
//        return salaries;
//    }

}

