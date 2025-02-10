package com.anz.bankapp.mapper;

import com.anz.bankapp.dto.TransactionDto;
import com.anz.bankapp.entity.Transaction;

public class TransactionMapper {

	public static TransactionDto mapToTransactionDto(Transaction transaction) {

		TransactionDto transactionDto = new TransactionDto(
				transaction.getAccountNumber(), transaction.getAccountType(), transaction.getTransactionDate(),
				transaction.getCurrency(), transaction.getDebitAmount(), transaction.getCreditAmount(),
				transaction.getTransactionType(), transaction.getTransactionNarrative());

		return transactionDto;
	}
}
