package com.example.lucilor.services;

import java.util.List;
import java.util.Optional;

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

    public AccountInformationModel findByEmail(String email){
        return new AccountInformationModel(repo.findByEmail(email));
    }
    
    public AccountInformationModel findById(int id)
    {
       AccountInformationModel plans;
       Optional<AccountInformation> temp = repo.findById(id);
       if (temp.isPresent()){
            plans = new AccountInformationModel(temp.get());
       } else {
            plans = new AccountInformationModel();
       }

       return plans;
    }
    // ADD account
    public AccountInformation save(AccountInformation account) {
        return repo.save(account);
    }

    // UPDATE account
    public void updateAccount(String email, AccountInformation account) {
        AccountInformation temp = new AccountInformation(findByEmail(email));
        temp = account;
        repo.save(temp);
    }

    // DELETE account
    public void deleteAccount(int id) {
        repo.deleteById(id);
    }

    public List<AccountInformation> findAll() {
        return repo.findAll();
    }
}
