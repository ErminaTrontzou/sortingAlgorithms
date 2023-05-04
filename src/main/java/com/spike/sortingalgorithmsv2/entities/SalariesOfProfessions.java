package com.spike.sortingalgorithmsv2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class SalariesOfProfessions implements Serializable {
    private int salaries;
    private String title;
    @Id
    private Long id;

    public SalariesOfProfessions() {

    }

    public SalariesOfProfessions(int salaries, String title){
        this.salaries=salaries;
        this.title=title;
    }

    public int getSalaries() {
        return salaries;
    }

    public void setSalaries(int salaries) {
        this.salaries = salaries;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
