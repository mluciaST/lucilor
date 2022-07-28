package com.example.lucilor.data;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lucilor.beans.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

}