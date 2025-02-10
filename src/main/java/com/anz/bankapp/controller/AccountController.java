package com.anz.bankapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.bankapp.dto.AccountDto;
import com.anz.bankapp.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping("/getaccounts")
	public ResponseEntity<List<AccountDto>> getAllUserAccounts() {

		log.info("getaccounts API called for the logged in user");
		List<AccountDto> accountDtoList = accountService.getAllUserAccounts();
		return ResponseEntity.ok(accountDtoList);
	}

}
