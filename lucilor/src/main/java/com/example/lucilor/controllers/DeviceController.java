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
	
	private static final Logger logger = Logger.getLogger(DeviceController.class);

	@GetMapping
	public ResponseEntity<List<DeviceModel>>findAll(){
		List<DeviceModel> models = deviceService.findAll();
		logger.debug(`Retrieved Models ${models}`);

		return new ResponseEntity<List<DeviceModel>>(models, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Device> save(@ResponseBody Device device){
		return new ResponseEntity<Device>(deviceService.save(device), HttpStatus.CREATED);
	}

}
