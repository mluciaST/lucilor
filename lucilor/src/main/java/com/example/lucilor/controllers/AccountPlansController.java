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

import com.example.lucilor.beans.AccountPlans;
import com.example.lucilor.models.AccountPlansModel;
import com.example.lucilor.services.AccountPlansService;

@RestController
@RequestMapping("/account_plans/v1")
@CrossOrigin("http://localhost:3306")
public class AccountPlansController {

	@Autowired
	private AccountPlansService accountPlansService;

	private static final Logger logger = Logger.getLogger(AccountInformationController.class);

	// VIEW all
	@GetMapping
	public ResponseEntity<List<AccountPlansModel>> findAll() {
		List<AccountPlansModel> models = accountPlansService.findAll();
		logger.debug("Retrieved Models: " + models);

		return new ResponseEntity<List<AccountPlansModel>>(models, HttpStatus.OK);
	}

	// ADD
	@PostMapping
	public ResponseEntity<AccountPlans> save(@RequestBody AccountPlans accountPlans) {
		return new ResponseEntity<AccountPlans>(accountPlansService.save(accountPlans), HttpStatus.CREATED);
	}

	// DELETE
	@DeleteMapping("/{id}")
	public void deleteAccountPlan(@PathVariable int id) {
		accountPlansService.deleteAccountPlan(id);
	}
}