package com.example.demo.repository.postgresql;

import com.example.demo.repository.postgresql.entity.Postgresql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresqlRepository extends JpaRepository<Postgresql, String> {

}
