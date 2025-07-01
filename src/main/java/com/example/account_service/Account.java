package com.example.account_service;

public record Account(
        int accountId,
        String accountType,
        int customerId,
        int balance
) {
}
