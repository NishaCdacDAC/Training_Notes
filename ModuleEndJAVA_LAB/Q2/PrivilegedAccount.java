/*Inherit classes such as “SavingsAccount” “PrivilegedAccount” classes from the class
“Account”. The rules of these account types are as follows:- 
a. SavingAccount 
a. Deposit – can deposit upto a maximum of 50000 only in one transaction. 
b. Withdraw – a minimum balance of 1000 should be there at any time.
 b. PrivilegedAccount 
a. Deposit – can deposit any amount
 b. Withdraw – can take an overdraft of maximum 5000. Ie, account balance can go 
     upto - 5000. 
 */
// PrivilegedAccount class

public class PrivilegedAccount extends Account {
    // Constructor for PrivilegedAccount
    public PrivilegedAccount(int accNo, String name, double accBalance) {
        super(accNo, name, "Privileged", accBalance);
    }

    // Override deposit method to allow any amount
    @Override
    public void deposit(double amt) {
        if (amt > 0) {
            super.deposit(amt); // Call the deposit method of the parent class
        } else {
            System.out.println("Invalid deposit amount for a privileged account.");
        }
    }

    // Override withdraw method to allow an overdraft of up to 5,000
    @Override
    public void withdraw(double amt) {
        if (amt > 0 && checkBalance() - amt >= -5000) {
            super.withdraw(amt); // Call the withdraw method of the parent class
        } else {
            System.out.println("Withdrawal amount exceeds allowed limit for a privileged account.");
        }
    }
}