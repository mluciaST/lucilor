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

    public AccountPlans() {
    	super();
    }
    
    public AccountPlans(int planNumber, int accountNumber) {
        super();
        this.plansNumber = planNumber;
        this.accountNumber = accountNumber;
    }

    public AccountPlans(AccountPlansModel accountPlans) {
        this.plansNumber = accountPlans.getPlanNumber();
        this.accountNumber = accountPlans.getAccountNumber();
    }       

    public void setPlanNumber(int planNumber){this.plansNumber = planNumber;}
    public void setAccountNumber(int accountNumber){ this.accountNumber = accountNumber;}

    public int getPlanNumber(){return plansNumber;}
    public int getAccountNumber(){return accountNumber;}
}