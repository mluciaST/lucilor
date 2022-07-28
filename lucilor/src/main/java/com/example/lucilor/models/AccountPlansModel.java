package com.example.lucilor.models;

import com.example.lucilor.beans.AccountPlans;

public class AccountPlansModel {

    private int plansNumber;
    private int accountNumber;

    public AccountPlansModel(AccountPlans accountPlans) {
        this.plansNumber = accountPlans.getPlansNumber();
        this.accountNumber = accountPlans.getAccountNumber();

    }

    public AccountPlansModel() {
        super();
    }

    public AccountPlansModel(int plansNumber, int accountNumber, String phoneNumber) {
        super();
        this.plansNumber = plansNumber;
        this.accountNumber = accountNumber;
    }

    public int getPlansNumber() {
        return plansNumber;
    }

    public void setPlansNumber(int plansNumber) {
        this.plansNumber = plansNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    
}
