package com.example.lucilor.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.jboss.logging.Logger;

import com.example.lucilor.beans.Device;
import com.example.lucilor.models.DeviceModel;
import com.example.lucilor.services.DeviceService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/device/v1")
@CrossOrigin("http://localhost:3306")
public class DeviceController {

	@Autowired
	DeviceService deviceService;

	private static final Logger logger = Logger.getLogger(DeviceController.class);

	@GetMapping
	@Operation(description = "Returns all device")
	public ResponseEntity<List<Device>> getDevice(HttpServletResponse resp){
		logger.debug("Find all device");
		return new ResponseEntity<List<Device>>(deviceService.findAll(), HttpStatus.OK);
	}

	// VIEW by id
	@GetMapping("/{id}")
	public ResponseEntity<DeviceModel> findById(@PathVariable(value = "id") String id) {
		return new ResponseEntity<DeviceModel>(deviceService.findById(id), HttpStatus.OK);
	}

	// Create
	@PostMapping
	public ResponseEntity<Device> createDevice(@RequestBody Device device) {
		return new ResponseEntity<Device>(deviceService.save(device), HttpStatus.CREATED);
	}

	// Create
	@PutMapping("/{device}")
	public ResponseEntity<Device> updateDevice(@RequestBody Device device) {
		return new ResponseEntity<Device>(deviceService.updateDevice(device), HttpStatus.CREATED);
	}

	// DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Device> deleteDevice(@PathVariable String id) {
		deviceService.deleteDevice(id);
		return new ResponseEntity<Device>(HttpStatus.GONE);
	}

}
