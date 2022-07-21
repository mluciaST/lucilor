package com.example.lucilor.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.lucilor.beans.Plans;

@Repository
public interface PlansRepository extends JpaRepository<Plans, Integer> {

    // Find phone plan by plan number
    //@Query("plan FROM phonePlan plan WHERE plan.planNumber = :planNumber")
    List<Plans> findByPlanNumber(int planNumber);

}