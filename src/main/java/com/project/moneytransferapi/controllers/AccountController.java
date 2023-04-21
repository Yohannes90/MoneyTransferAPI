package com.project.moneytransferapi.controllers;

import com.project.moneytransferapi.domains.Account;
import com.project.moneytransferapi.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/api/accounts")
    public Account registerNewAccount(@RequestBody Account newAccount) throws Exception{
        return accountService.createAccount(newAccount);
    }
}
