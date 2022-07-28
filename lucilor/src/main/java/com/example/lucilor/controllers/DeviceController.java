package com.example.lucilor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.jboss.logging.Logger;

import com.example.lucilor.beans.Device;
import com.example.lucilor.models.DeviceModel;
import com.example.lucilor.services.DeviceService;

@RestController
@RequestMapping("/device/v1")
@CrossOrigin("http://localhost:3306")
public class DeviceController {

	@Autowired
	DeviceService deviceService;

	private static final Logger logger = Logger.getLogger(DeviceController.class);

	// VIEW all
	@GetMapping
	public ResponseEntity<List<DeviceModel>> findAll() {
		List<DeviceModel> models = deviceService.findAll();
		logger.debug("Retrieved Models: " + models);

		return new ResponseEntity<List<DeviceModel>>(models, HttpStatus.OK);
	}

	// VIEW by id
	@GetMapping("/{id}")
	public ResponseEntity<DeviceModel> findById(@PathVariable(value = "id") int id) {
		return new ResponseEntity<DeviceModel>(deviceService.findById(id), HttpStatus.OK);
	}

	// UPDATE
	@PostMapping
	public ResponseEntity<Device> updateDevice(@RequestBody Device device) {
		return new ResponseEntity<Device>(deviceService.save(device), HttpStatus.CREATED);
	}

	// DELETE
	@DeleteMapping("/{id}")
	public void deleteDevice(@PathVariable int id) {
		deviceService.deleteDevice(id);
	}

}
