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

    public List<Devices> getDinos() {
		return repo.findAll();
	}

	public Devices save(Devices devices){
		return repo.save(account);
	}

    public List<Devices> findByPhoneSimilar(Int phone){
        return repo.findByPhoneSimilar(phone);
    }

    public List<Devices> findByPlanSimilar(Int planNumber){
        return repo.findByPlanSimilar(planNumber);
    }
}
