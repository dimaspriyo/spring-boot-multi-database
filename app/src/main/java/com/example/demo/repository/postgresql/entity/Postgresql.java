package com.example.demo.repository.postgresql.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "postgresql_table")
public class Postgresql {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private String birthDate;

}
