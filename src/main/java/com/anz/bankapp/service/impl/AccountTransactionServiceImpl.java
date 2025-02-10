package com.anz.bankapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.anz.bankapp.dto.TransactionDto;
import com.anz.bankapp.entity.Transaction;
import com.anz.bankapp.exception.AccountNotFoundException;
import com.anz.bankapp.mapper.TransactionMapper;
import com.anz.bankapp.repository.TransactionRepository;
import com.anz.bankapp.service.AccountTransactionsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AccountTransactionServiceImpl implements AccountTransactionsService {

	private TransactionRepository transactionRepository;

	public AccountTransactionServiceImpl(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	@Override
	public List<TransactionDto> getTransactionsByAccountNumber(Long accountNumber) {

		log.info("Getting transaction details of the user for account number : {}", accountNumber);

		List<Transaction> transactionList = transactionRepository.findByAccountNumber(accountNumber);

		if (ObjectUtils.isEmpty(transactionList)) {
			throw new AccountNotFoundException("No records found for given account number : ", accountNumber);
		} else {
			return transactionList.stream().map((transaction) -> TransactionMapper.mapToTransactionDto(transaction))
					.collect(Collectors.toList());
		}
	}

}
