package com.example.lucilor.services;

import java.util.List;
import java.util.Optional;

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
		return null;
	}

	public AccountPlansModel findById(int id) {
		AccountPlansModel accountPlans;
		Optional<AccountPlans> temp = repository.findById(id);

		if (temp.isPresent()) {
			accountPlans = new AccountPlansModel(temp.get());
		} else {
			accountPlans = new AccountPlansModel();
		}

		return accountPlans;
	}

	// DELETE account plan
	public void deleteAccountPlan(int id) {
		repository.deleteById(id);
	}

	public AccountPlans save(AccountPlans accountPlans) {
		return null;
	}
}