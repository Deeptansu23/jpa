package com.example.springjpademo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Salary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "salary_id")
    private  Long id;
    @Column
    private Company company;
    @Column
    private Integer level;
    @Column
    private Integer bonusPercentage;
    @Column
    private Double startingSalary;
    @Column
    private Double currentSalary;
    @Column
    private  boolean activeFlag;
    @Column
    private String title;

    public Salary(Double currentSalary, boolean activeFlag) {

        this.currentSalary = currentSalary;
        this.activeFlag = activeFlag;
    }



}
