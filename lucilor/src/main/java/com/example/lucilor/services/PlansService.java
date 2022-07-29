package com.example.lucilor.services;

import java.util.List;
import java.util.Optional;

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
    public List<Plans> findAll() {
        return repo.findAll();
    }

    public PlansModel findById(int id){
       PlansModel plans;
       Optional<Plans> temp = repo.findById(id);
       if (temp.isPresent()){
            plans = new PlansModel(temp.get());
       } else {
            plans = new PlansModel();
       }

       return plans;
    }

    // Create plans
    public Plans save(Plans plans) {
        return repo.save(plans);
    }

    public void deletePlans(int id){
        repo.deleteById(id);
    }
}
