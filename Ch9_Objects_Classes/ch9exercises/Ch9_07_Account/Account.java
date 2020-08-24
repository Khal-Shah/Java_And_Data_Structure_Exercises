package ch9exercises.Ch9_07_Account;

import java.util.Date;

public class Account
{
    private int id;
    private double balance;
    private static double annualInterestRate;                    //Assume all accounts have the same interest rate.
    private Date dateCreated;

    Account()
    {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int newId, double initialBalance)
    {
        id = newId;
        balance = initialBalance;
        dateCreated = new Date();            //if we're passing id and balance parameters, this is the date created
    }

    public void setId(int newId)
    {
        id = newId;
    }

    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return (annualInterestRate / 12.0);
    }

    public double getMonthlyInterest()
    {
        return ((getMonthlyInterestRate() / 100) * balance);                //interest RATE is in % so /100 here
    }

    public void withdraw(double withdrawAmount)
    {
        balance -= withdrawAmount;
    }

    public void deposit(double depositAmount)
    {
        balance += depositAmount;
    }

}
