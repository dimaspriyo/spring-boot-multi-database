package com.example.demo.repository.mysql.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "driver")
public class Driver {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

}
