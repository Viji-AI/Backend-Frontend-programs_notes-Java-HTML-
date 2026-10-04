package com.example.BankAccountManagementSystem.Service;

import com.example.BankAccountManagementSystem.Entity.BankAccount;
import com.example.BankAccountManagementSystem.Repository.BankAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountService(BankAccountRepository repository) {
        this.repository = repository;
    }

    // Create Account
    public BankAccount createAccount(String name, double initialBalance) {

        BankAccount account = new BankAccount();

        account.setAccountHolderName(name);
        account.setBalance(initialBalance);

        return repository.save(account);
    }

    // Deposit
    public BankAccount deposit(Long accountNumber, double amount) {

        BankAccount account = repository.findById(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setBalance(account.getBalance() + amount);

        return repository.save(account);
    }

    // Withdraw
    public BankAccount withdraw(Long accountNumber, double amount) {

        BankAccount account = repository.findById(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        if (amount > account.getBalance()) {
            throw new RuntimeException("Insufficient balance");
        }

        account.setBalance(account.getBalance() - amount);

        return repository.save(account);
    }

    // Check Balance
    public double checkBalance(Long accountNumber) {

        BankAccount account = repository.findById(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        return account.getBalance();
    }
}
