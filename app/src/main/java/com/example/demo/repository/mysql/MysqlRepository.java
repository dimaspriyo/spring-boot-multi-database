package com.example.demo.repository.mysql;

import com.example.demo.repository.mysql.entity.Mysql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlRepository extends JpaRepository<Mysql,String> {
}
