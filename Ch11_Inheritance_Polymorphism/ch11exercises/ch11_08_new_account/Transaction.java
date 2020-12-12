package ch11exercises.ch11_08_new_account;

import java.util.Date;

/**
 * -date: java.util.Date
 * -type: char
 * -amount: double
 * -balance: double
 * -description: String
 * Getters and Setters for the above
 * +Transaction(type: char, amount: double, balance: double, description: String)
 *
 */
public class Transaction
{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description)
    {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    public Date getDate()
    {
        return date;
    }

    public char getType()
    {
        return type;
    }

    public void setType(char type)
    {
        this.type = type;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "\nTransaction{" +
               "date=" + date +
               ", type=" + type +
               ", amount=" + amount +
               ", balance=" + balance +
               ", description='" + description + '\'' +
               '}';
    }
}
