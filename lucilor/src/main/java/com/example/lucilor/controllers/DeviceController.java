package com.example.lucilor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lucilor.beans.Device;
import com.example.lucilor.services.DeviceService;

@RestController
@RequestMapping("/device/v1")
public class DeviceController {
	
	@Autowired
	DeviceService deviceService;
	
	@GetMapping
	public ResponseEntity<List<Device>> getDevice() {
		return new ResponseEntity<List<Device>>(deviceService.findAll(), HttpStatus.OK);
	}

}
