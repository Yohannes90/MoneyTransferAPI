package com.project.moneytransferapi.services;

import com.project.moneytransferapi.domains.Account;
import com.project.moneytransferapi.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Account newAccount) {
        return accountRepository.save(newAccount);
    }

}