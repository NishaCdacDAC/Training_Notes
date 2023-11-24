/*Create a SavingsAccount class. Use a static data member
annualInterestRate to store the annual interest rate for each of the
savers. Each member of the class contains a private data member
savingsBalance indicating the amount the saver currently has on deposit.
Provide member function calculateMonthlyInterest() that calculates the
monthlyinterest by multiplying the balance by annualInterestRate
divided by 12; this interest should be added to savingsBalance.
Provide a static member functionmodifyInterestRate() that sets the
static annualInterestRate to a new value. Write a driver program to
test class SavingsAccount. Instantiate two different objects of
classSavingsAccount, saver1 and saver2, with balances of
2000.00 and 3000.00,respectively. Set the annualInterestRate to
3 percent. Then calculate the monthlyinterest and print the
new balances for each of the savers. Then set theannualInterestRate to 4 percent, calculate the next month's interest
and print the new balances for each of the savers.*/


class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}

public class MainSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.03); // Set the annualInterestRate to 3%

        System.out.println("Month 1:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04); // Set the annualInterestRate to 4%

        System.out.println("\nMonth 2:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance());
    }
}
