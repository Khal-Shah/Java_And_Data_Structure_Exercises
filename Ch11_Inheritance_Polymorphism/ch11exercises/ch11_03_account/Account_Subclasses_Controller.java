package ch11exercises.ch11_03_account;

import ch9exercises.Ch9_07_Account.Account;

//Write a test program that creates objects of
// * Account, SavingsAccount, and CheckingAccount and invokes their toString() methods
public class Account_Subclasses_Controller
{
    public static void main(String[] args)
    {
        Account account = new Account (1123, 25_000);
        account.setAnnualInterestRate(2.5);
        account.withdraw(3000);
        account.deposit(8000);
        System.out.println(account.toString());

        Account checkingAccount = new CheckingAccount(1122, 20000, 5000);
        System.out.println(checkingAccount.toString());     //Override: will print toString of CheckingAccount (actual type)

        //to use a method that's in CheckingAccount (actual type) but not in Account (declared type)
        //we have to cast it
        //good practice to use instanceof
        if(checkingAccount instanceof CheckingAccount)
        {
            ((CheckingAccount) checkingAccount).setOverdraftLimit(2000);
            System.out.println("\nThe overdraft limit has been changed. If we withdraw again now:\n");
            System.out.println("The overdraft limit is: " + ((CheckingAccount) checkingAccount).getOverdraftLimit());
        }


        //Why do Account checkingAccount and not CheckingAccount checkingAccount?
        //it is a good practice to define a variable with a supertype, which can accept an object of any subtype
        //Why casting
        //Run-time: Declared type decides which method to match. If we did checkingAccount.getOverdraft = error
        //cuz the Account class doesn't have that method.
//        Account savingsAccount = new SavingsAccount();
//        System.out.println(savingsAccount.toString());
    }
}
