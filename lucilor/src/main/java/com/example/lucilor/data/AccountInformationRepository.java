package com.example.lucilor.data;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.lucilor.beans.AccountInformation;

@Repository
public interface AccountInformationRepository extends JpaRepository<AccountInformation, Integer> {

}