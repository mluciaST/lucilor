package com.example.lucilor.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lucilor.beans.Devices;

@Repository
public interface DevicesRepository extends JpaRepository<Devices, Integer> {
	
	public List<Devices> findByPhoneSimilar(int phone);
	
	public List<Devices> findByPlanSimilar(int planNumber);
}
