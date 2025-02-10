package com.anz.bankapp.service;

import java.util.List;

import com.anz.bankapp.dto.TransactionDto;

public interface AccountTransactionsService {

	public List<TransactionDto> getTransactionsByAccountNumber(Long accountNumber);
}
