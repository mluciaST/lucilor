package com.example.lucilor.models;

import com.example.lucilor.beans.AccountPlans;

public class AccountPlansModel {

    private int plansNumber;
    private int accountNumber;
    private String phoneNumber;

    public AccountPlansModel(AccountPlans accountPlans) {
        this.plansNumber = accountPlans.getPlansNumber();
        this.accountNumber = accountPlans.getAccountNumber();
        this.phoneNumber = accountPlans.getPhoneNumber();

    }

    public AccountPlansModel() {
        super();
    }

    public AccountPlansModel(int plansNumber, int accountNumber, String phoneNumber) {
        super();
        this.plansNumber = plansNumber;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
