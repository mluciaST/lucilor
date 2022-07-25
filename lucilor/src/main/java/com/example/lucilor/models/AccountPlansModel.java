package com.example.lucilor.models;

import com.example.lucilor.beans.AccountPlans;

public class AccountPlansModel {

	private int planNumber;
    private int accountNumber;
    
    public AccountPlansModel(AccountPlans accountPlans) {
            this.planNumber = accountPlans.getPlanNumber();
            this.accountNumber = accountPlans.getAccountNumber();

    }

    public AccountPlansModel() {
    	super();
    }
    
    public AccountPlansModel(int planNumber, int accountNumber) {
        super();
        this.planNumber = planNumber;
        this.accountNumber = accountNumber;
    }

    public void setPlanNumber(int planNumber){this.planNumber = planNumber;}
    public void setAccountNumber(int accountNumber){ this.accountNumber = accountNumber;}

    public int getPlanNumber(){return planNumber;}
    public int getAccountNumber(){return accountNumber;}
}
