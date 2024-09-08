package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    void deposit() {
        account.deposit(100);
        assert account.getBalance() == 100;
    }

    @Test
    void withdraw() {
        account.deposit(100);
        account.withdraw(50);
        assert account.getBalance() == 50;
    }

    @Test
    void withdrawOverBalance() {
        account.deposit(100);
        account.withdraw(200);
        assert account.getBalance() == 100;
    }

    @Test
    void getBalance() {
        account.deposit(100);
        assert account.getBalance() == 100;
    }



}