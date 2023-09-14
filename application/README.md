Task:

Implement a Java application that simulates a simple banking system. The application should include the following components:

• Bank class with methods for creating customer accounts and performing transactions.

• Customer class with attributes like name, account number, and balance.

• Account class with methods for depositing and withdrawing funds.

Approach:

First thing is that only one single entry point of the application have to there so that the transactions are atomic. So for this I only declared one public
class i.e. BankSystem which access Bank instance through getInstance Method. It can be done using new keyword as only one instance creation is allowed and 
thus private constructor is provided for Bank class.

First Defined the MODELS that are used for Account Type and Transaction Type;

ENUMS used AccountType and TransactionType

AccountType: Currently, Savings and Checking account have same functionality but there are 
a lot of different features that can be added in those type of account.

TransactionType: There are two kinds of transaction: WITHDRAW, and DEPOSIT.

Creating Customer class:

Thought process is that I should create a base class like Person, 
which can be used for Customer, and if later I wanted to extend my project to include employee,
then also it can be used. I defined the only field "Name" for now in the Person Class.

I extended Person class with the Customer class with other required field "account" (which make use of Account class)
and "accountNumber".

Creating Account Class:

I make this class abstract, which can be inherited by Savings and Checking Account and implement withdraw and deposit method differently if they want to.
Currently, there are no different implementation of them.

Creating Bank Class:

This class create Customer account and perform transaction.
Creating a customer account: takes name, account type and initial amount to create a new customer account and give a account number.
Performing a transaction:
First find a customer from the account number, if there is a existing customer, do the transaction with withdraw or deposit.



TECHNOLOGIES USED:
Java 8, JUnit4, IntelliJ IDEA, macOS.

