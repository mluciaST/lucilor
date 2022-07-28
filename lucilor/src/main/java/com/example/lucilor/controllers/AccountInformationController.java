package com.example.lucilor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lucilor.beans.AccountInformation;
import com.example.lucilor.models.AccountInformationModel;
import com.example.lucilor.services.AccountInformationService;
import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/accountinfo/v1")
@CrossOrigin("http://localhost:3306")
public class AccountInformationController {
	@Autowired
	private AccountInformationService accountInfoService;

	private static final Logger logger = Logger.getLogger(AccountInformationController.class);

	@GetMapping
	public ResponseEntity<List<AccountInformationModel>> findAll() {
		List<AccountInformationModel> models = accountInfoService.findAll();
		logger.debug("Retrieved Models: " + models);

		return new ResponseEntity<List<AccountInformationModel>>(models, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<AccountInformation> save(@RequestBody AccountInformation account) {
		return new ResponseEntity<AccountInformation>(accountInfoService.save(account), HttpStatus.CREATED);
	}

	@PutMapping("/{email}")
	public void updateAccount(@PathVariable String email, @RequestBody AccountInformation accountInformation) {
		accountInfoService.updateAccount(email, accountInformation);
	}

	@DeleteMapping("/{id}")
	public void deleteAccount(@PathVariable int id) {
		accountInfoService.deleteAccount(id);
	}
}
