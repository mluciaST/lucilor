package com.example.lucilor.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lucilor.beans.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

    Device findByPhoneNumber(String phoneNumber);

    void deleteByPhoneNumber(String id);

}