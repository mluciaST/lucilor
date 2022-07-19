package com.example.lucilor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lucilor.beans.Device;
import com.example.lucilor.data.DeviceRepository;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository repository;

    public List<Device> findAll() {
        return repository.findAll();
    }

}
