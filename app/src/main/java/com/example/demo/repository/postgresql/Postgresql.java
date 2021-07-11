package com.example.demo.repository.postgresql;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "postgresql-table")
public class Postgresql {

    @Id
    @GeneratedValue
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private String birthDate;

}
