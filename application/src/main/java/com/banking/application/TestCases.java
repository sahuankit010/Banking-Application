/**
 * @author Ankit Sahu
 **/
package com.banking.application;

import com.banking.application.models.AccountType;
import com.banking.application.models.TransactionType;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCases {
    @Test
    public void testAccountCount(){
        Bank bank = Bank.getInstance();
        bank.createCustomerAccount("Ankit Sahu", 1000.00, AccountType.CHECKING);
        bank.createCustomerAccount("Doordash Eats", 1000.00, AccountType.CHECKING);
        bank.performTransaction(1, 200, TransactionType.DEPOSIT);
        bank.performTransaction(2, 400, TransactionType.WITHDRAW);
        assertEquals(2, bank.getCustomerCount());
        bank.printCustomerDetails();
    }

    @Test
    public void testLargerWithdrawAmountThanTheBalance(){
        Bank bank = Bank.getInstance();
        bank.createCustomerAccount("William Salt", 1000.00, AccountType.CHECKING);
        bank.performTransaction(1, 2000, TransactionType.WITHDRAW);
        System.out.println("The above transaction of withdrawing 2000 from the account will not success.");
        bank.printCustomerDetails();
    }
}
