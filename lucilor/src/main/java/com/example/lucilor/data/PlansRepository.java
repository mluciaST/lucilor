package com.example.lucilor.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.lucilor.beans.Plans;

@Repository
public interface PlansRepository extends JpaRepository<Plans, Integer> {

    public List<Plans> findByPlanSimilar(int planNumber);
    
    public List<Plans> findByNameSimilar(int name);

    public List<Plans> findByNameSimilar(String name);

}
