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
	
//	@GetMapping
//	public ResponseEntity<List<AccountInformation>> getAccountInformation() {
//		return new ResponseEntity<List<AccountInformation>>(accountInfoService.findAll(), HttpStatus.OK);
//	}
}
