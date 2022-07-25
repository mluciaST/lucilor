package com.example.lucilor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lucilor.beans.AccountInformation;
import com.example.lucilor.data.AccountInformationRepository;
import com.example.lucilor.models.AccountInformationModel;

@Service
public class AccountInformationService{
    @Autowired
	AccountInformationRepository repo;
	
	public List<AccountInformation> getDinos() {
		return repo.findAll();
	}

	public AccountInformation save(AccountInformation account){
		return repo.save(account);
	}

    public List<AccountInformation> findByNameSimilar(String name){
        return repo.findByNameSimilar(name);
    }

    public List<AccountInformation> findByEmailSimilar(String email){
        return repo.findByEmailSimilar(email);
    }

    public List<AccountInformationModel> findAll() {
        return null;
    }
}
