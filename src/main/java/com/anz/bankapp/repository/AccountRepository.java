package com.anz.bankapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.bankapp.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

	List<Account> findByUserId(String UserId);

}
