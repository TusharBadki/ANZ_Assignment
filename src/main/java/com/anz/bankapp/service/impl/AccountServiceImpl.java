package com.anz.bankapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.anz.bankapp.dto.AccountDto;
import com.anz.bankapp.entity.Account;
import com.anz.bankapp.mapper.AccountMapper;
import com.anz.bankapp.repository.AccountRepository;
import com.anz.bankapp.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public List<AccountDto> getAllUserAccounts() {

		log.info("Getting all account details of the logged in user");
		List<Account> accounts = accountRepository.findAll();
		return accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
	}

}
