package com.example.BankAccountManagementSystem.Controller;

import com.example.BankAccountManagementSystem.Entity.BankAccount;
import com.example.BankAccountManagementSystem.Service.BankAccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class BankAccountController {

    private final BankAccountService service;

    public BankAccountController(BankAccountService service) {
        this.service = service;
    }

    // Create Account
    @PostMapping
    public BankAccount createAccount(
            @RequestParam String name,
            @RequestParam double initialBalance) {

        return service.createAccount(name, initialBalance);
    }

    // Deposit
    @PutMapping("/{accountNumber}/deposit")
    public BankAccount deposit(
            @PathVariable Long accountNumber,
            @RequestParam double amount) {

        return service.deposit(accountNumber, amount);
    }

    // Withdraw
    @PutMapping("/{accountNumber}/withdraw")
    public BankAccount withdraw(
            @PathVariable Long accountNumber,
            @RequestParam double amount) {

        return service.withdraw(accountNumber, amount);
    }

    // Check Balance
    @GetMapping("/{accountNumber}/balance")
    public double checkBalance(
            @PathVariable Long accountNumber) {

        return service.checkBalance(accountNumber);
    }
}
