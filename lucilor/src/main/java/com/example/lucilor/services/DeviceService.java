package com.example.lucilor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lucilor.beans.Device;
import com.example.lucilor.data.DeviceRepository;
import com.example.lucilor.models.DeviceModel;

@Service
public class DeviceService {
    
    
    @Autowired
    private DeviceRepository repo;

    public List<Device> getDevices() {
		return repo.findAll();
	}

	public Device save(Device account){
		return repo.save(account);
	}

    public List<Device> findByPhoneSimilar(int phone){
        return repo.findByPhoneSimilar(phone);
    }

    public List<DeviceModel> findAll() {
        return null;
    }
}
