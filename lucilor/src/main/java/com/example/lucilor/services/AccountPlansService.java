package com.example.lucilor.services;

import java.util.LinkedList;
import java.util.List;

//import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lucilor.beans.AccountPlans;
import com.example.lucilor.data.AccountPlansRepository;
import com.example.lucilor.models.AccountPlansModel;

@Service
public class AccountPlansService {

	// need some form of that repository here
	@Autowired
	private AccountPlansRepository repository;

	public List<AccountPlansModel> findAll() {
		List<AccountPlans> accountPlans = repository.findAll();
		List<AccountPlansModel> models = new LinkedList<>();

		for (AccountPlans accountPlan : accountPlans){
			AccountPlansModel temp = new AccountPlansModel(accountPlan);
			models.add(temp);
		}

		return models;
	}

	// DELETE account plan
	public void deleteAccountPlan(int id) {
		repository.deleteById(id);
	}

	public AccountPlans save(AccountPlans accountPlans) {
		return repository.save(accountPlans);
	}
}