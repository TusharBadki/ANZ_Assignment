package com.anz.bankapp.service;

import java.util.List;

import com.anz.bankapp.dto.AccountDto;

public interface AccountService {

	public List<AccountDto> getAllUserAccounts();

}