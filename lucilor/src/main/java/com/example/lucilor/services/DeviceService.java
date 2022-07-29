package com.example.lucilor.services;

import java.util.List;

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
    public List<Device> findAll() {
        return repo.findAll();
    }

    public Device save(Device account) {
        return repo.save(account);
    }

    // GET by id
    public DeviceModel findById(String id) {
        DeviceModel devices;
        Device temp = repo.findByPhoneNumber(id);
        if (temp != null){
            devices = new DeviceModel(temp);
        } else {
            devices = new DeviceModel();
        }
 
        return devices;        
    }

    // UPDATE
    public Device updateDevice(Device device) {
        return repo.save(device);
    }

    // DELETE device
    public int deleteDevice(String id) {
        Device device = repo.findByPhoneNumber(id);
        repo.delete(device);
        return 0;
    }

}
