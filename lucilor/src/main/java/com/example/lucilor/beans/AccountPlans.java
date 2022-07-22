package com.example.lucilor.beans;

import java.time.LocalDate;

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
    @Column
    private int plansNumber;
	@Column
    private int accountNumber;

    public AccountPlans() {
    	super();
    }
    
    public AccountPlans(int planNumber, int accountNumber) {
        super();
        this.planNumber = planNumber;
        this.accountNumber = accountNumber;
    }

    public AccountPlansModel(AccountPlansModel accountPlans) {
        this.planNumber = accountPlans.getPlanNumber();
        this.accountNumber = accountPlans.getAccountNumber();
    }       

    public void setPlanNumber(int planNumber){this.planNumber = planNumber;}
    public void setAccountNumber(int accountNumber){ this.accountNumber = accountNumber;}

    public int getPlanNumber(){return planNumber;}
    public int getAccountNumber(){return accountNumber;}
}