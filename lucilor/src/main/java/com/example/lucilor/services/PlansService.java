package com.example.lucilor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lucilor.beans.Plans;
import com.example.lucilor.data.PlansRepository;
import com.example.lucilor.models.PlansModel;

@Service
public class PlansService {

    @Autowired
    private PlansRepository repo;

    public List<Plans> getDinos() {
		return repo.findAll();
	}

	public Plans save(Plans plans){
		return repo.save(plans);
	}

    public List<Plans> findByPlanSimilar(int planNumber){
        return repo.findByPlanSimilar(planNumber);
    }

    public List<Plans> findByNameSimilar(String name){
        return repo.findByNameSimilar(name);
    }

    public List<PlansModel> findAll() {
        return null;
    }
}
