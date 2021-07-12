package com.example.demo.repository.postgresql.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "parent")
public class Parent {
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "parent")
    private List<Child> child;
}
