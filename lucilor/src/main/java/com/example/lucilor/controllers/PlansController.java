package com.example.lucilor.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lucilor.beans.Plans;
import com.example.lucilor.models.PlansModel;
import com.example.lucilor.services.PlansService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/plans/v1")
@CrossOrigin("http://localhost:3306")
public class PlansController {

	@Autowired
	PlansService plansService;

	private static final Logger logger = Logger.getLogger(DeviceController.class);

	@GetMapping
	@Operation(description = "Returns all plans")
	public ResponseEntity<List<Plans>> getPlans(HttpServletResponse resp){
		logger.debug("Find all plans");
		return new ResponseEntity<List<Plans>>(plansService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	@Operation(description = "Finds plan by Id")
	public ResponseEntity<PlansModel> findById(@PathVariable int id){
		return new ResponseEntity<PlansModel>(plansService.findById(id), HttpStatus.OK);
	}
}