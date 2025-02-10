package com.anz.bankapp.exception;

public class AccountNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(String message, Long accountNumber) {
		super(message + " "+ accountNumber);
	}
}