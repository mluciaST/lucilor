package com.example.lucilor.data;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.lucilor.beans.AccountPlans;

@Repository
public interface AccountPlansRepository extends JpaRepository<AccountPlans, Integer> {
    //List of account plans
    List<AccountPlans> findByAccountNumber(int accountNumber);
    List<AccountPlans> findByPlansNumber(int plansNumber);
}
