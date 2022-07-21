package com.example.lucilor.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lucilor.beans.Devices;

@Repository
public interface DevicesRepository extends JpaRepository<Devices, Integer> {
	
}
