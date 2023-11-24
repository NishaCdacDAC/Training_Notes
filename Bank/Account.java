/*** Create a class named “Account” with following members
 a. Data Members 
a. accNo
 b. Name
 c. accType
 d. accBalance
 b. Function members
 a. Constructor to accept all values
 b. Deposit(int amt) accepting amount and adds with the accBalance
 c. Withdraw(int amt) accepting amount to subtract from the accBalance
 d. checkBalalce() to return the present account balance ***/

 package Bank;

public class Account {
    // Data Members
    private int accNo;
    private String name;
    private String accType;
    private double accBalance;

    // Constructor to accept all values
    public Account(int accNo, String name, String accType, double accBalance) {
        this.accNo = accNo;
        this.name = name;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    // Deposit(int amt) accepting amount and adds it to the accBalance
    public void deposit(double amt) {
        if (amt > 0) {
            accBalance += amt;
            System.out.println("Deposit of $" + amt + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw(int amt) accepting amount to subtract from the accBalance
    public void withdraw(double amt) {
        if (amt > 0 && amt <= accBalance) {
            accBalance -= amt;
            System.out.println("Withdrawal of $" + amt + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // checkBalance() to return the present account balance
    public double checkBalance() {
        return accBalance;
    }
}
