/**
 * @author Ankit Sahu
 **/

package com.banking.application;
 class CheckingAccount extends Account{
     /**
      * use base class constructor to initialize balance
      * @param balance: initialize new account with balance
      */
    public CheckingAccount(double balance) {
        super(balance);
    }

     /**
      * Adding amount to the balance
      * @param amount amount to deposit in the account
      */
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

     /**
      * TODO: use return value later for validation of the withdraw method
      * @param amount amount to withdraw from the account
      * @return true or false depending
      */
    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        System.out.println("Insufficient balance");
        return false;
    }

    @Override
    public String toString() {
        return "Checking Account with" +
                "balance = " + balance;
    }
}
