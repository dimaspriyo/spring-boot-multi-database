package com.example.demo.repository.mysql.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mysql_table")
public class Mysql {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private String birthDate;
}

