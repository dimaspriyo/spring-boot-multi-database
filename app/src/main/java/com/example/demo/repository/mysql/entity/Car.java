package com.example.demo.repository.mysql.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "car")
public class Car {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "production_date")
    private Date productionDate;

    @OneToMany(mappedBy = "car")
    private List<Driver> driver;

}

