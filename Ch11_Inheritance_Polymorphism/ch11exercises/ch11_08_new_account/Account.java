package ch11exercises.ch11_08_new_account;

import java.util.ArrayList;
import java.util.Date;

/**
 * (New Account class) An Account class was specified in Programming Exercise 9.7.
 *  * Design a new Account class as follows:
 *  * ■ Add a new data field name of the String type to store the name of the customer.
 *  * ■ Add a new constructor that constructs an account with the specified name, id, and balance.
 *  * ■ Add a new data field named transactions whose type is ArrayList that stores the transaction
 *  * for the accounts. Each transaction is an instance of the Transaction class. The Transaction class
 *  is defined as shown in Figure 11.6.
 *
 *
 * Chapter 9 - Exercise 7:
 *  * (The Account class) Design a class named Account that contains:
 * ■ A private int data field named id for the account (default 0).
 * ■ A private double data field named balance for the account (default 0).
 * ■ A private double data field named annualInterestRate that stores the current interest rate (default 0).
 * Assume all accounts have the same interest rate.
 * ■ A private Date data field named dateCreated that stores the date when the account was created.
 * ■ A no-arg constructor that creates a default account.
 * ■ A constructor that creates an account with the specified id and initial balance.
 * ■ The accessor and mutator methods for id, balance, and annualInterestRate.
 * ■ The accessor method for dateCreated.
 * ■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * ■ A method named getMonthlyInterest() that returns the monthly interest.
 * ■ A method named withdraw that withdraws a specified amount from the account.
 * ■ A method named deposit that deposits a specified amount to the account.
 *
 * Draw the UML diagram for the class and then implement the class. (Hint: The method getMonthlyInterest() is to return
 * monthly interest, not the interest rate. Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is
 * annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual
 * interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 * the balance, the monthly interest, and the date when this account was created.
 *
 */
public class Account
{
    private int id;
    private double balance;
    public static double annualInterestRate;
    private Date dateCreated;
    private String name;

    private ArrayList<Transaction> transactions;

    public Account()
    {
        this(0, 0);
        this.annualInterestRate = 0;
    }

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(int id, double balance, String name)
    {
        this(id, balance);
        this.name = name;
        //dateCreated = new Date();    don't need it because we're already invoking above constructor which inits date
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate / 100;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return getAnnualInterestRate() / 12.0;
    }

    public double getMonthlyInterest()
    {
        return getBalance() * getMonthlyInterestRate() / 100.0;
    }

    //Modify the withdraw and deposit methods to add a transaction to the transactions array list.
    public void withdraw(double amount)
    {
        String desc = "Withdraw made of amount " + amount + " by " + name;


        if(amount < balance)
        {
            this.balance -= amount;
            transactions.add(new Transaction('W', amount, balance, desc));
        }

        else
        {
            System.out.printf("Your amount for withdrawing exceeds the amount you currently have in balance." +
                              "Program will now terminate.");
            System.exit(0);
        }
    }

    public void deposit(double amount)
    {
        String desc = "Deposit made of amount " + amount + " by " + name;

        if(amount > 0)
        {
            this.balance += amount;
            transactions.add(new Transaction('D', amount, balance, desc));
        }

        else
        {
            System.out.printf("Your amount cannot be negative. If you want to make a withdraw try withdraw method." +
                              "Program will now terminate.");
            System.exit(0);
        }
    }

    @Override
    public String toString()
    {
        return "Account{" +
               "id=" + id +
               ", balance=" + balance +
               ", annualInterestRate=" + annualInterestRate +
               ", dateCreated=" + dateCreated +
               ", name='" + name + '\'' +
               ", transactions=" + transactions +
               '}';
    }
}
