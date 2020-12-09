package ch11exercises.ch11_03_account;

import ch9exercises.Ch9_07_Account.Account;

/**
 * (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account.
 * An account has the properties account number, balance, annual interest rate, and date created, and methods
 * to deposit and with- draw funds.
 *
 * Create two subclasses for checking and saving accounts. A checking account
 * has an overdraft limit, but a savings account cannot be overdrawn.
 * Draw the UML diagram for the classes and then implement them. Write a test program that creates objects of
 * Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.
 *
 * @@author Khaled Shah
 */

public class SavingsAccount extends Account
{

    public SavingsAccount()
    {

    }

    public SavingsAccount(int newId, double initialBalance)
    {
        super(newId, initialBalance);
    }

    //In savings account, there is no overdraft limit so we can withdraw until balance is reached
    public void withdraw(double amount)
    {
        if(amount < getBalance())
        {
            withdraw(amount);
        }

        else
        {
            System.out.println("Error. Your withdraw amount of " + String.format("%.2f", amount) + " exceeds your balance" +
                               " of " + String.format("%.2f", getBalance()));
        }
    }


    @Override
    public String toString()
    {
        return "SavingsAccount Class{" +
//               "id=" + getId() +
//               ", balance = " + getBalance() +  you can get these from super
               super.toString() +
               '}';
    }
}
