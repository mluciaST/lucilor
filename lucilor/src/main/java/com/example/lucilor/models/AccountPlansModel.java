package com.example.lucilor.models;

import com.example.lucilor.beans.AccountPlans;

public class AccountPlansModel {

    private int plansNumber;
    private int accountNumber;
    private int phoneNumber;

    public AccountPlansModel(AccountPlans accountPlans) {
        this.plansNumber = accountPlans.getPlansNumber();
        this.accountNumber = accountPlans.getAccountNumber();
        this.phoneNumber = accountPlans.getPhoneNumber();

    }

    public AccountPlansModel() {
        super();
    }

    public AccountPlansModel(int plansNumber, int accountNumber, int phoneNumber) {
        super();
        this.plansNumber = plansNumber;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public void setPlansNumber(int plansNumber) {
        this.plansNumber = plansNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPlansNumber() {
        return plansNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
