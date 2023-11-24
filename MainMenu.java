import Bank.Account;
import Bank.SavingsAccount;
import Bank.Privileg1edAccount;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Privileged Account");
            System.out.println("3. Perform Transactions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                System.out.print("Enter account number: ");
                    int accNo = scanner.nextInt();
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    SavingsAccount savingsAccount = new SavingsAccount(accNo, name, initialBalance);
                    accounts.add(savingsAccount);
                    System.out.println("Savings Account created.");
                    break;
                case 2:
                    // Create a Privileged Account
                    // Collect account details (accNo, name, initial balance)
                    // Create an instance of PrivilegedAccount
                    // Store it in a list or array for future transactions
                    break;
                case 3:
                    // Perform Transactions
                    // Choose an account from the list or array
                    // Deposit, withdraw, or check balance
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}