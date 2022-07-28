package com.example.lucilor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import com.example.lucilor.beans.Device;
import com.example.lucilor.data.DeviceRepository;
import com.example.lucilor.models.DeviceModel;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository repo;

    // GET all
    public List<Device> getDevices() {
        return repo.findAll();
    }

    public Device save(Device account) {
        return repo.save(account);
    }

    // GET by id
    public DeviceModel findById(int id) {
        DeviceModel device;
        Optional<Device> temp = repo.findById(id);

        if (temp.isPresent()) {
            device = new DeviceModel(temp.get());
        } else {
            device = new DeviceModel();
        }

        return device;
    }

    // UPDATE
    public void updateDevice(int id, Device device) {
        repo.save(device);
    }

    // DELETE device
    public void deleteDevice(int id) {
        repo.deleteById(id);
    }

    public List<DeviceModel> findAll() {
        return null;
    }
}
