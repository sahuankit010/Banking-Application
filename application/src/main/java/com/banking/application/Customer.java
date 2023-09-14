/**
 * @author Ankit Sahu
 **/

package com.banking.application;
class Customer extends Person {
    private int accountNumber;
    private Account account;

    /**
     * @param name: using name field from Person class and passing it using super to Parent class -> Person
     * @param accountNumber initializing account number
     * @param account initializing account details
     */
    public Customer(String name, int accountNumber, Account account) {
        super(name);
        this.accountNumber = accountNumber;
        this.account = account;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "name = '" + name + '\'' +
                ", accountNumber = " + accountNumber +
                ", account = " + account +
                '}';
    }
}
