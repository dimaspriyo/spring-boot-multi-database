package com.example.demo.service;

import com.example.demo.repository.postgresql.ChildRepository;
import com.example.demo.repository.postgresql.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    @Autowired
    ChildRepository childRepository;

    public List<Child> findAll() { return childRepository.findAll(); }

    public Child findById(String id) throws Exception {return childRepository.findById(id).orElseThrow(() -> new Exception("Child Not Found"));}
}
