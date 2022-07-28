package com.example.lucilor.data;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.lucilor.beans.AccountPlans;

@Repository
public interface AccountPlansRepository extends JpaRepository<AccountPlans, Integer> {
}
