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

    // VIEW all plans
    public List<Plans> getPlans() {
        return repo.findAll();
    }

    public Plans save(Plans plans) {
        return repo.save(plans);
    }

    public List<PlansModel> findAll() {
        return null;
    }
}
