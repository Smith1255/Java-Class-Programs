/**
 * Driver to exercise the use of multiple Account objects
 * 
 * @Andrew Smith (Lewis/Loftus/Cocking ©)
 * ->Andrew Smith: Added the capability to withdraw from one account to another
 * 
 * @October 22, 2015
 */
public class Banking {
    //----------------------------------------------------------------------------------------------
    //Creates bank accounts and demonstrates various services
    //----------------------------------------------------------------------------------------------
    public static void main (String[] args)
    {
        Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
        Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
        
        acct1.deposit (25.85);
        
        double gomezBalance = acct2.deposit (500.00);
        System.out.println ("Gomez balance after deposit: " + gomezBalance);

        System.out.println ("Gomez balance after withdrawal: " + acct2.withdraw(430.75, 1.50) );
        
        acct3.withdraw (800, 0.0); //Exceeds balance
        
        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();
        
        acct3.wireMoneyTo(acct2, 100);
        
        System.out.println ();
        System.out.println (acct1);
        System.out.println (acct2);
        System.out.println (acct3);
    }
}
