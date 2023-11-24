package Bank;

public class SavingsAccount extends Account {
    public SavingsAccount(int accNo, String name, double accBalance) {
        super(accNo, name, "Savings", accBalance);
    }

    @Override
    public void deposit(double amt) {
        if (amt > 0 && amt <= 50000) {
            super.deposit(amt);
        } else {
            System.out.println("Invalid deposit amount for SavingsAccount.");
        }
    }

    @Override
    public void withdraw(double amt) {
        if (amt > 0 && (accBalance - amt) >= 1000) {
            super.withdraw(amt);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance requirement not met.");
        }
    }
}