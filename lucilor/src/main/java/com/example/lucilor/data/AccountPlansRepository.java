package com.example.lucilor.data;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import com.example.lucilor.beans.AccountPlans;

@Repository
public interface AccountPlansRepository extends JpaRepository<AccountPlans, Integer> {

	public List<AccountPlans> findByAccountNumber(int accountNumber);

	public List<AccountPlans> findByPlansNumber(int plansNumber);

	// @Query("from AccountPlans ap select * where ap.accountNumber like
	// :accountNumber")
	// public List<AccountPlans> findByAccountSimiliar(@Param(value =
	// "accountNumber") int accountNumber);

	// @Query("from AccountPlans ap select * where ap.planNumber like :plansNumber")
	// public List<AccountPlans> findByPlanSimilar(@Param(value = "plansNumber") int
	// plansNumber);
}
