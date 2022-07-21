package com.example.lucilor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lucilor.beans.AccountInformation;
import com.example.lucilor.services.AccountInformationService;

@RestController
@RequestMapping("/accountinfo/v1")
public class AccountInformationController {
	@Autowired
	AccountInformationService accountInfoService;
	
	private static final Logger logger = Logger.getLogger(AccountInformationController.class);

	@GetMapping
	public ResponseEntity<List<AccountInformationModel>>findAll(){
		List<AccountInformationModel> models = accountInfoService.findAll();
		logger.debug(`Retrieved Models ${models}`);

		return new ResponseEntity<List<AccountInformationModel>>(models, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<AccountInformation> save(@ResponseBody AccountInformation account){
		return new ResponseEntity<AccountInformation>(accountInfoService.save(account), HttpStatus.CREATED);
	}
}
