class BankAccount {
    private int accno;
    private double balance;

    public BankAccount(int accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }
    public synchronized void deposit(double amount) {
        System.out.println("Depositing " + amount);
        balance += amount;
        System.out.println("New balance after deposit: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance - amount >= 1000) { // Checking minimum balance
            System.out.println("Withdrawing " + amount);
            balance -= amount;
            System.out.println("New balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}
public class JointAccount{
    public static void main(String[] args) {
        BankAccount jointAccount = new BankAccount(12345, 5000.0);

        Thread depositThread = new Thread(() -> {
            jointAccount.deposit(2000.0);
        });

        Thread withdrawThread = new Thread(() -> {
            jointAccount.withdraw(3000.0);
        });

        depositThread.start();
        withdrawThread.start();
    }
}
