package com.example.demo.repository.postgresql.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "child")
public class Child {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthDate")
    private Date birthDate;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

}
