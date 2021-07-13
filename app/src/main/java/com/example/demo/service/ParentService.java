package com.example.demo.service;

import com.example.demo.repository.postgresql.ParentRepository;
import com.example.demo.repository.postgresql.entity.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {

    @Autowired
    ParentRepository parentRepository;

    public List<Parent> findAll(){return parentRepository.findAll();}

    public Parent findById(String id) throws Exception {return parentRepository.findById(id).orElseThrow(() -> new Exception("Parent Not Found"));}
}
