package com.spike.sortingalgorithmsv2.entities;

import com.spike.sortingalgorithmsv2.repositories.ProfessionRepository;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "professions")
public class Profession implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "profession")
    private Set<Employer> employers;

    public Profession(String title) {
        this.title = title;
    }

    public Set<Employer> getEmployers(){
        return employers;
    }

    public void setEmployers(Set<Employer> employers){
        this.employers=employers;
    }




    public Profession() {

    }

    public Profession(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
