package com.example.lucilor.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lucilor.beans.Plans;

@Repository
public interface PlansRepository extends JpaRepository<Plans, Integer> {

}
