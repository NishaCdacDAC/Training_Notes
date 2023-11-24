/*Create a class, named Account and include the required attributes and behaviors in it. Inherit another class called “SavingsAccount” from it and add new attributes and behaviors, as needed. Inherit another class called “LoanAccount” from Account and add new attributes and behaviors, as needed. Inherit another class called “HousingLoan” from LoanAccount and add new attributes and behaviours, as needed. Create objects of SavingsAccount and HousingLoan and perform the methods to
1. Open an account, 2. Deposit amount, 3. Withdraw amount, 4. Print the account details. (Consider applying the Access Modifiers also) */


class Account 
{
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) 
    {
        if (amount > 0)
         {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void printAccountDetails() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account 
{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double interestRate) 
    {
        super(accountNumber, accountHolderName);
        this.interestRate = interestRate;
    }

    public void applyInterest()
     {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Applied: $" + interest);
    }
}

class LoanAccount extends Account
 {
    private double loanAmount;

    public LoanAccount(String accountNumber, String accountHolderName, double loanAmount)
     {
        super(accountNumber, accountHolderName);
        this.loanAmount = loanAmount;
        balance = -loanAmount;
    }

    public void repayLoan(double amount) 
    {
        if (amount > 0 && amount <= loanAmount) 
        {
            loanAmount -= amount;
            balance += amount;
            System.out.println("Loan Repaid: $" + amount);
        } else {
            System.out.println("Invalid repayment amount or loan already repaid.");
        }
    }
}

class HousingLoan extends LoanAccount
 {
    private int loanTermInYears;

    public HousingLoan(String accountNumber, String accountHolderName, double loanAmount, int loanTermInYears) 
    {
        super(accountNumber, accountHolderName, loanAmount);
        this.loanTermInYears = loanTermInYears;
    }

    public void printLoanDetails()
     {
        System.out.println("Loan Term: " + loanTermInYears + " years");
        printAccountDetails();
    }
}

public class Main {
    public static void main(String[] args) 
    {
        SavingsAccount savingsAccount = new SavingsAccount("12345", "Nisha", 5.0);
        savingsAccount.deposit(2000);
        savingsAccount.applyInterest();
        savingsAccount.printAccountDetails();

        HousingLoan housingLoan = new HousingLoan("123", "Elizabeth", 25000, 20);
        housingLoan.deposit(5000);
        housingLoan.repayLoan(1000);
        housingLoan.printLoanDetails();
    }
}
