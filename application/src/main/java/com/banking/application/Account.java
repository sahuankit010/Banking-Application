/**
 * @author Ankit Sahu
 **/
package com.banking.application;

/**
 * This class will be used by Checking and Savings Account which will implement withdraw and deposit methods in the their own implementation
 */
abstract class Account {

    protected double balance;

    /**
     * currently not allowing customers to have negative initial balance
     * @param balance that is the initial balance:
     */
    public Account(double balance) {
        // Initial balance should not be less than 0, so balance should be minimum of 0
        if(balance >= 0){
            this.balance = balance;
        } else{
            this.balance = 0;
        }
    }

    /**
     * Implementations of below two methods are provided in Checking and Customer Account.
     * @param amount amount to deposit in the account
     */
    public abstract void deposit(double amount);

    /**
     * @param amount amount to withdraw from the account
     * @return boolean value which can be used later to check validation of the transaction
     */
    public abstract boolean withdraw(double amount);
}
