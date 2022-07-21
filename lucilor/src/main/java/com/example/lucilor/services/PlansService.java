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

    public List<Plans> getDinos() {
		return repo.findAll();
	}

	public Plans save(Plans plans){
		return repo.save(account);
	}

    public List<Plans> findByPlanSimilar(Int planNumber){
        return repo.findByPlanSimilar(planNumber);
    }

    public List<Plans> findByNameSimilar(String name){
        return repo.findByNameSimilar(name);
    }
}
