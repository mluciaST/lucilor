package com.example.lucilor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lucilor.beans.Plans;
import com.example.lucilor.data.PlansRepository;

@Service
public class PlansService {

    @Autowired
    private PlansRepository repository;

    public List<Plans> findAll() {
        return repository.findAll();
    }
}
