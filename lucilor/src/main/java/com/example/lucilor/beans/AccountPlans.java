package com.example.lucilor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.lucilor.models.AccountPlansModel;

@Entity
@Table
public class AccountPlans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int plansNumber;
    @Column
    private int accountNumber;
    @Column
    private int phoneNumber;

    public AccountPlans() {
        super();
    }

    public AccountPlans(int planNumber, int accountNumber, int phoneNumber) {
        super();
        this.plansNumber = planNumber;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public AccountPlans(AccountPlansModel accountPlans) {
        this.plansNumber = accountPlans.getPlansNumber();
        this.accountNumber = accountPlans.getAccountNumber();
        this.phoneNumber = accountPlans.getPhoneNumber();
    }

    public void setPlansNumber(int planNumber) {
        this.plansNumber = planNumber;
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