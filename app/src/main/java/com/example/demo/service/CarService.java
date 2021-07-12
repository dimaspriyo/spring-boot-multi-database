package com.example.demo.service;

import com.example.demo.repository.mysql.CarRepository;
import com.example.demo.repository.mysql.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<Car> findAll(){
        return carRepository.findAll().stream().collect(Collectors.toList());
    }

    public Car findById(String id) throws Exception {
        return carRepository.findById(id).orElseThrow(() -> new Exception("Car Not Found"));
    }

}
