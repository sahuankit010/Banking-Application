/**
 * @author Ankit Sahu
 **/
package com.banking.application;

import com.banking.application.models.AccountType;
import com.banking.application.models.TransactionType;

public class BankSystem {

    public static void main(String[] args) {
        Bank bank = Bank.getInstance();

        bank.createCustomerAccount("Ankit Sahu", 1000.00, AccountType.CHECKING);
        bank.createCustomerAccount("Will Smith", 500.00, AccountType.SAVINGS);
        bank.createCustomerAccount("Tom Brady", -500.00, AccountType.SAVINGS);
        bank.createCustomerAccount("Ross Taylor", 5000.00, AccountType.CHECKING);
        bank.createCustomerAccount("Brandon Paine", 2200.00, AccountType.SAVINGS);
        bank.createCustomerAccount("Pat Cummins", 3000.00, AccountType.CHECKING);
        bank.createCustomerAccount("Chris Broad", 800.00, AccountType.CHECKING);
        bank.createCustomerAccount("Ankit Sahu", 1000.00, AccountType.CHECKING);
        bank.createCustomerAccount("Stephen Federer", 500.00, AccountType.SAVINGS);
        bank.createCustomerAccount("Vikram Aditya", 15000.00, AccountType.SAVINGS);


        bank.performTransaction(1, 200.00, TransactionType.DEPOSIT);
        bank.performTransaction(2, 100.00, TransactionType.WITHDRAW);

        bank.performTransaction(1, 2100.00, TransactionType.DEPOSIT);

        /**
         * below transaction is invalid transaction, so it will not be executed as withdrawing amount is more than the balance
         */
        bank.performTransaction(2, 2100.00, TransactionType.WITHDRAW);

        bank.printCustomerDetails();

//        bank.printParticularCustomerDetails(1);
    }
}
