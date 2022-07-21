package com.example.lucilor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lucilor.beans.Devices;
import com.example.lucilor.services.DevicesService;

@RestController
@RequestMapping("/devices/v1")
public class DevicesController {

	@Autowired
	DevicesService devicesService;
	
	@GetMapping
	public ResponseEntity<List<DevicesModel>>findAll(){
		List<DevicesModel> models = devicesService.findAll();
		logger.debug(`Retrieved Models ${models}`);

		return new ResponseEntity<List<DevicesModel>>(models, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Devices> save(@ResponseBody Devices devices){
		return new ResponseEntity<Devices>(devicesService.save(devices), HttpStatus.CREATED);
	}
}
