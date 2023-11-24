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
 d. checkBalalce() to return the present account balance 
**/
public class Account {
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

    // Deposit method accepting amount and adding it to the accBalance
    public void deposit(double amt) {
        if (amt > 0) {
            accBalance += amt;
            System.out.println("Deposited: Rs" + amt);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Withdraw method accepting amount to subtract from the accBalance
    public void withdraw(double amt) {
        if (amt > 0 && amt <= accBalance) {
            accBalance -= amt;
            System.out.println("Withdrawn: Rs" + amt);
        } else if (amt <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Check balance method to return the present account balance
    public double checkBalance() {
        return accBalance;
    }

    // Getter methods for individual data members
    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAccType() {
        return accType;
    }

    public double getAccBalance() {
        return accBalance;
    }
}