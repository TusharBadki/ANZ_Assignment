package com.anz.bankapp.dto;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionDto {

	@NotNull(message = "Account Number can not be null")
	private Long accountNumber;

	private String accountType;
	private Date transactionDate;
	private String currency;
	private BigDecimal debitAmount;
	private BigDecimal creditAmount;
	private String transactionType;
	private String transactionNarrative;

}
