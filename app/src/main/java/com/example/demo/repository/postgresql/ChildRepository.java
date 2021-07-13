package com.example.demo.repository.postgresql;

import com.example.demo.repository.postgresql.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child,String> {
}
