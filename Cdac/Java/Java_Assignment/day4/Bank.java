/*All the banks operating in India are controlled by RBI. RBI has set a well defined guideline 
(e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow.*/

class Customer
{
	String accountNumber;
    	String accountHolderName;
    	double balance;
}   
class Account    
{
	String BankName;
   	String accountHolderName;
   	String accountNumber;
   	double balance;
}
class RBI 
{
    Customer customer;
    Account account;

    public double getInterestRate()
     {
        return 4.0; // Default minimum interest rate set by RBI
    }

    public double getWithdrawalLimit()
     {
        return 50000.0; // Default maximum withdrawal limit set by RBI
    }
     public double minimumbalanceallowed()
     {
        return 1500.0; // Default minimum balance allowed set by RBI
    }
}
class SBI extends RBI
 {
    // SBI can use RBI functionality or define its own
    @Override
    public double getInterestRate() 
    {
        return 4.5; // SBI offers a higher interest rate
    }
}
class ICICI extends RBI
 {
    // ICICI can use RBI functionality or define its own
    @Override
    public double getWithdrawalLimit() 
    {
        return 60000.0; // ICICI has a higher withdrawal limit
    }

}
class PNB extends RBI
 {
    // PNB can use RBI functionality or define its own
    @Override
    public double  minimumbalanceallowed() 
    {
        return 1000.0; // PNB has minimum balance allowed, 
    }
}
public class Bank
 {
    public static void main(String[] args) 
    {
        // Create instances of SBI and ICICI
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        PNB pnb = new PNB();


        // Demonstrate dynamic polymorphism
        RBI bank1 = sbi; // Reference to SBI object using RBI reference
        RBI bank2 = icici; // Reference to ICICI object using RBI reference
        RBI bank3 = pnb;// Reference to pnb object using RBI reference
        
        // Call RBI methods through RBI references
        System.out.println("SBI Interest Rate: " + bank1.getInterestRate());
        System.out.println("ICICI Withdrawal Limit: " + bank2.getWithdrawalLimit());
        System.out.println("PNB minimum balance allowed: " + bank3.minimumbalanceallowed());
    }
}
