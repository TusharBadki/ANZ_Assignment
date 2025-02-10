package com.anz.bankapp.mapper;

import com.anz.bankapp.dto.AccountDto;
import com.anz.bankapp.entity.Account;

public class AccountMapper {

	public static AccountDto mapToAccountDto(Account account) {

		AccountDto accountDto = new AccountDto(
				account.getAccountNumber(), account.getAccountName(), account.getAccountType(),
				account.getBalanceDate(), account.getCurrency(), account.getOpeningAvailableBalance());

		return accountDto;
	}

}
