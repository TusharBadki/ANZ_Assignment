package com.anz.bankapp.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_accounts")
@Entity
public class Account {

	@Id
	@Column(name = "user_account_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userAccountId;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "account_number")
	private Long accountNumber;

	@Column(name = "account_name")
	private String accountName;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "balance_date")
	private Date balanceDate;

	@Column(name = "currency")
	private String currency;

	@Column(name = "opening_available_balance")
	private BigDecimal openingAvailableBalance;

}
