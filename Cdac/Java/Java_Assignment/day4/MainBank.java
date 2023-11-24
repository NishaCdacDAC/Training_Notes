
/*Bob has his money deposited $1000, $1500 and $2000 in banks-Bank A,
Bank B and Bank C respectively. We have to print the money deposited
by him in a particular bank.*/

class Bank {
    static double interestRate = 0.05; // Static variable for interest rate

    double getBalance() {
        return 0;
    }

    double applyInterest(double balance) 
    {
        return balance * (1 + interestRate);
    }
}

class BankA extends Bank {
    double getBalance() {
        return 1000;
    }
}

class BankB extends Bank {
    double getBalance() 
    {
        return 1500;
    }
}

class BankC extends Bank {
    double getBalance() 
    {
        return 2000;
    }
}

public class MainBank {
    public static void main(String[] args) 
    {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Bank A Balance: $" + bankA.getBalance());
        System.out.println("Bank A Balance with Interest: $" + bankA.applyInterest(bankA.getBalance()));

        System.out.println("Bank B Balance: $" + bankB.getBalance());
        System.out.println("Bank B Balance with Interest: $" + bankB.applyInterest(bankB.getBalance()));

        System.out.println("Bank C Balance: $" + bankC.getBalance());
        System.out.println("Bank C Balance with Interest: $" + bankC.applyInterest(bankC.getBalance()));
    }
}
