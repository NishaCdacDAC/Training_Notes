import java.util.Scanner;
import java.util.HashMap;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Account> accounts = new HashMap<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create a Savings Account");
            System.out.println("2. Create a Privileged Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = scanner.nextInt();
                    if (!accounts.containsKey(accNo)) {
                        System.out.print("Enter Name: ");
                        scanner.nextLine(); // Consume newline character
                        String name = scanner.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double initialBalance = scanner.nextDouble();
                        accounts.put(accNo, new SavingsAccount(accNo, name, initialBalance));
                        System.out.println("Savings Account created.");
                    } else {
                        System.out.println("Account with this account number already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNoPrivileged = scanner.nextInt();
                    if (!accounts.containsKey(accNoPrivileged)) {
                        System.out.print("Enter Name: ");
                        scanner.nextLine(); // Consume newline character
                        String namePrivileged = scanner.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double initialBalancePrivileged = scanner.nextDouble();
                        accounts.put(accNoPrivileged, new PrivilegedAccount(accNoPrivileged, namePrivileged, initialBalancePrivileged));
                        System.out.println("Privileged Account created.");
                    } else {
                        System.out.println("Account with this account number already exists.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int depositAccNo = scanner.nextInt();
                    if (accounts.containsKey(depositAccNo)) {
                        Account depositAccount = accounts.get(depositAccNo);
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account with this account number does not exist. Please create an account first.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int withdrawalAccNo = scanner.nextInt();
                    if (accounts.containsKey(withdrawalAccNo)) {
                        Account withdrawalAccount = accounts.get(withdrawalAccNo);
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        withdrawalAccount.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Account with this account number does not exist. Please create an account first.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    int checkBalanceAccNo = scanner.nextInt();
                    if (accounts.containsKey(checkBalanceAccNo)) {
                        Account balanceAccount = accounts.get(checkBalanceAccNo);
                        double balance = balanceAccount.checkBalance();
                        System.out.println("Current balance: $" + balance);
                    } else {
                        System.out.println("Account with this account number does not exist. Please create an account first.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}