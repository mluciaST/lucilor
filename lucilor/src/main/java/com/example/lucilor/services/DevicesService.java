package com.example.lucilor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lucilor.beans.Devices;
import com.example.lucilor.data.DevicesRepository;

@Service
public class DevicesService {

    @Autowired
    private DevicesRepository repository;

    public List<Devices> findAll() {
        return repository.findAll();
    }
}
