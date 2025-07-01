package com.example.account_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping
    List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/customers/{customerId}")
    List<Account> getAccountsByCustomerId(@PathVariable int customerId) {
        return accountService.getAccountsByCustomerId(customerId);
    }

}
