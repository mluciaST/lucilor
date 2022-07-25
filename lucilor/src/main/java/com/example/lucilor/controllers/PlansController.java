package com.example.lucilor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lucilor.beans.Plans;
import com.example.lucilor.models.PlansModel;
import com.example.lucilor.services.PlansService;
import org.jboss.logging.Logger;

@RestController
@RequestMapping("/plans/v1")
@CrossOrigin("http://localhost:3306")
public class PlansController {

	@Autowired
	PlansService plansService;
	
	private static final Logger logger = Logger.getLogger(DeviceController.class);

	@GetMapping
	public ResponseEntity<List<PlansModel>>findAll(){
		List<PlansModel> models = plansService.findAll();
		logger.debug("Retrieved Models: " + models );

		return new ResponseEntity<List<PlansModel>>(models, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Plans> save(@RequestBody Plans plans){
		return new ResponseEntity<Plans>(plansService.save(plans), HttpStatus.CREATED);
	}
}