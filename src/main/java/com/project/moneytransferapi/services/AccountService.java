package com.project.moneytransferapi.services;

import com.project.moneytransferapi.Utils.AgeCalculator;
import com.project.moneytransferapi.domains.Account;
import com.project.moneytransferapi.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Account newAccount) throws Exception{
        Integer age = AgeCalculator.calculateAge(newAccount.getDateOfBirth(), LocalDate.now());
        if (age != null) {
            throw new Exception("Date of birth can't be null");
        }
        if (age < 18) {
            throw new Exception("Sorry you can't create account due to age restriction");
        }
        return accountRepository.save(newAccount);
    }

}