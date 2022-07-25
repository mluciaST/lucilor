package com.example.lucilor.data;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lucilor.beans.AccountPlans;

@Repository
public interface AccountPlansRepository extends JpaRepository<AccountPlans, Integer> {
	
	public List<AccountPlans> findByAccountSimilar(int account);
	
	public List<AccountPlans> findByPlanSimilar(int plans);
}
