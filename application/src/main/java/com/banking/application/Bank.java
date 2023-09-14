/**
 * @author Ankit Sahu
 **/


package com.banking.application;

import com.banking.application.models.AccountType;
import com.banking.application.models.TransactionType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Bank {
    private static Bank instance = null;
    private List<Customer> customers = new ArrayList<>();


    /**
     * This helps in implementing Singleton pattern as this constructor is private, other classes will not able to create object of this class.
     * Only getInstance() method can create the instance of this class.
     */
    private Bank() {

    }

    // singleton pattern

    /** personal repository of mine where I practiced various java problems and implementation
     * reference: https://github.com/sahuankit010/Java-Practice/blob/main/src/DesignPattern/Singleton3.java
     * @return instance of the bank class.
     */
    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }

    // As instructed: Bank class should implement creating customer account

    /**
     * @param name: Name of the customer
     * @param initialBalance: initial balance that will be there if user enter initial balance less than 0, then 0 will be initial balance
     * @param accountType: type of account? checking or savings
     */

    public void createCustomerAccount(String name, double initialBalance, AccountType accountType) {
        int accountNumber = customers.size() + 1;
        Account account = accountType == AccountType.CHECKING ? new CheckingAccount(initialBalance) : new SavingsAccount(initialBalance);
        Customer customer = new Customer(name, accountNumber, account);
        customers.add(customer);
    }

    /**
     *
     * @param accountNumber: account number of user
     * @param amount amount need to withdraw or deposit depend on Transaction Type
     * @param type Transaction Type ? Withdraw or Deposit
     */
    public void performTransaction(int accountNumber, double amount, TransactionType type) {
        Customer customer = customers.stream()
                .filter(c -> c.getAccountNumber() == accountNumber)
                .findFirst()
                .orElse(null);
        try {
            if (customer != null) {
                Account account = customer.getAccount();
                if (type == TransactionType.DEPOSIT) {
                    account.deposit(amount);
                } else {
                    account.withdraw(amount);
                }
            }
        } catch (Exception e){
            System.out.println("No Customer found");
        }
    }

    /**
     * Printing all customers account details.
     */
    public void printCustomerDetails() {
        customers.forEach(System.out::println);
    }

    /**
     *
     * @param accountNumber: accountNumber of the user
     * if the account number is not present, else condition will execute.
     */
    public void printParticularCustomerDetails(int accountNumber){
        Optional<Customer> optionalCustomer = customers.stream()
                .filter(c -> c.getAccountNumber() == accountNumber)
                .findFirst();

        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            System.out.println(customer);
        } else {
            System.out.println("Account Number Not found, please recheck");
        }
    }


    // used for testing
    public int getCustomerCount() {
        return customers.size();
    }
}
