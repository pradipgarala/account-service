package com.example.account_service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    public List<Account> getAccounts() {
        return List.of(
                new Account(1, "savings", 1, 100),
                new Account(2, "current", 1, 200),
                new Account(11, "savings", 11, 1_100),
                new Account(12, "current", 11, 1_200)
        );
    }

    public List<Account> getAccountsByCustomerId(int customerId) {
        return getAccounts().stream()
                .filter(a -> a.customerId() == customerId)
                .toList();
    }
}
