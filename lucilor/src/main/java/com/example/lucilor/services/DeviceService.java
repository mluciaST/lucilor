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

    public List<Device> getDinos() {
		return repo.findAll();
	}

	public Device save(Device device){
		return repo.save(account);
	}

    public List<Device> findByPhoneSimilar(Int phone){
        return repo.findByPhoneSimilar(phone);
    }
}
