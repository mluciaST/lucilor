package com.example.lucilor.services;
import java.util.List;

//import org.jboss.logging.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lucilor.beans.AccountPlans;
import com.example.lucilor.models.AccountPlansModel;

@Service
public class AccountPlansService {
	
	//need some form of that repository here
	//@Autowired
	//private AccountPlansService repository;

	public List<AccountPlansModel> findAll() {
		return null;
	}

    public AccountPlans save(AccountPlans accountPlans) {
        return null;
    }
}