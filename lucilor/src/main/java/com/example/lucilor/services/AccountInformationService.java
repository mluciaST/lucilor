package com.example.lucilor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lucilor.beans.AccountInformation;
import com.example.lucilor.data.AccountInformationRepository;
import com.example.lucilor.models.AccountInformationModel;

@Service
public class AccountInformationService {
    @Autowired
    private AccountInformationRepository repo;

    // VIEW account info
    public List<AccountInformation> getAccountInfo() {
        return repo.findAll();
    }

    // ADD account
    public AccountInformation save(AccountInformation account) {
        return repo.save(account);
    }

    // GET account info by email
    public AccountInformation findByEmail(String email) {
        return repo.findByEmail(email);
    }

    // UPDATE account
    public void updateAccount(String email, AccountInformation account) {
        repo.save(account);
    }

    // DELETE account
    public void deleteAccount(int id) {
        repo.deleteById(id);
    }

    public List<AccountInformationModel> findAll() {
        return null;
    }
}
