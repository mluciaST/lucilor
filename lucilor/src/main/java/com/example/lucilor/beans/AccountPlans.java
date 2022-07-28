package com.example.lucilor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.lucilor.models.AccountPlansModel;

@Entity
@Table(name = "account_plans")
public class AccountPlans {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int accountPlansId;
    @Column
    private int accountNumber;
    @Column
    private int plansNumber;

    public AccountPlans(){}
    public AccountPlans(AccountPlansModel accountPlans){
        this.accountNumber = accountPlans.getAccountNumber();
        this.plansNumber = accountPlans.getPlansNumber();
    }

    public AccountPlans(int accountNumber, int plansNumber){
        this.accountNumber = accountNumber;
        this.plansNumber = plansNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getPlansNumber() {
        return plansNumber;
    }
    public void setPlansNumber(int plansNumber) {
        this.plansNumber = plansNumber;
    }

    public int getAccountPlansId() {
        return accountPlansId;
    }
    public void setAccountPlansId(int accountPlansId) {
        this.accountPlansId = accountPlansId;
    }

}