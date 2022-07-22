package com.example.lucilor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account_plans/v1")
@CrossOrigin("http://localhost:3306")
public class AccountPlansController {

	@Autowired
	AccountPlansService accountPlansService;
	
	@GetMapping
	public ResponseEntity<List<AccountPlansModel>>findAll(){
		List<AccountPlansModel> models = accountPlansService.findAll();
		logger.debug(`Retrieved Models ${models}`);

		return new ResponseEntity<List<AccountPlansModel>>(models, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<AccountPlans> save(@ResponseBody AccountPlans accountPlans){
		return new ResponseEntity<AccountPlans>(accountPlansService.save(accountPlans), HttpStatus.CREATED);
	}
}