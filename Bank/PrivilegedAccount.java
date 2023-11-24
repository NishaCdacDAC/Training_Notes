package Bank;
public class PrivilegedAccount extends Account {
    public PrivilegedAccount(int accNo, String name, double accBalance) {
        super(accNo, name, "Privileged", accBalance);
    }

    @Override
    public void deposit(double amt) {
        if (amt > 0) {
            super.deposit(amt);
        } else {
            System.out.println("Invalid deposit amount for PrivilegedAccount.");
        }
    }

    @Override
    public void withdraw(double amt) {
        if (amt > 0 && (accBalance - amt) >= -5000) {
            super.withdraw(amt);
        } else {
            System.out.println("Withdrawal not allowed. Overdraft limit reached.");
        }
    }
}