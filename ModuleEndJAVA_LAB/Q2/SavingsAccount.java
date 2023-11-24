/*Inherit classes such as “SavingsAccount” “PrivilegedAccount” classes from the class
“Account”. The rules of these account types are as follows:- 
a. SavingAccount 
a. Deposit – can deposit upto a maximum of 50000 only in one transaction. 
b. Withdraw – a minimum balance of 1000 should be there at any time.
 b. PrivilegedAccount 
a. Deposit – can deposit any amount
 b. Withdraw – can take an overdraft of maximum 5000. Ie, account balance can go 
     upto - 5000. */

// SavingsAccount class

public class SavingsAccount extends Account {
    // Constructor for SavingsAccount
    public SavingsAccount(int accNo, String name, double accBalance) {
        super(accNo, name, "Savings", accBalance);
    }

    // Override deposit method to limit deposit amount
    @Override
    public void deposit(double amt) {
        if (amt > 0 && amt <= 50000) {
            super.deposit(amt); // Call the deposit method of the parent class
        } else {
            System.out.println("Invalid deposit amount for a savings account. Maximum deposit is Rs.50,000.");
        }
    }

    // Override withdraw method to maintain minimum balance
    @Override
    public void withdraw(double amt) {
        if (amt > 0 && checkBalance() - amt >= 1000) {
            super.withdraw(amt); // Call the withdraw method of the parent class
        } else {
            System.out.println("Insufficient balance or withdrawal amount exceeds allowed limit for a savings account.");
        }
    }
}