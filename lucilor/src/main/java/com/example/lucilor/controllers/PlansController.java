package com.example.lucilor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plans/v1")
public class PlansController {

	@Autowired
	PlansService plansService;
	
	@GetMapping
	public ResponseEntity<List<PlansModel>>findAll(){
		List<PlansModel> models = plansService.findAll();
		logger.debug(`Retrieved Models ${models}`);

		return new ResponseEntity<List<PlansModel>>(models, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Plans> save(@ResponseBody Plans plans){
		return new ResponseEntity<Plans>(plansService.save(plans), HttpStatus.CREATED);
	}
}