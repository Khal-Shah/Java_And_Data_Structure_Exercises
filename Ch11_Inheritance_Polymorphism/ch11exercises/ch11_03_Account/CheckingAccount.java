package ch11exercises.ch11_03_Account;

import ch9exercises.Ch9_07_Account.Account;

//A checking account
// * has an overdraft limit, but a savings account cannot be overdrawn.

public class CheckingAccount extends Account
{
    private double overdraftLimit;

    public CheckingAccount()
    {
        overdraftLimit = 0;
    }

    public CheckingAccount(int newId, double initialBalance, double overdraftLimit)
    {
        super(newId, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit()
    {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }

    //overdraft limit: when you withdraw, this should warn you that you're withdrawing more than what is set as the
    //overdraft limit and cause an error.
    //overdraft limit or overdraft protection is the maximum amount that banks allow its consumers to withdraw
    //in their accounts aside from their existing debt. For example, an organization has a checking account
    //balance of $5,000 with an overdraft limit of $500.
    //The minimum amount that should be in the account at all times. You can't withdraw past this balance
    public void withdraw(double amount)
    {
        if(getBalance() - amount > overdraftLimit)
        {
            withdraw(amount);
        }

        else
        {
            System.out.println("Error. Your overdraft of " + getOverdraftLimit() + " gets exceeded if you withdraw " + amount);
        }
    }

    @Override
    public String toString()
    {
        return "CheckingAccount{" +
//               "id=" + getId() +
//               ", balance=" + getBalance() +
//               ", dateCreated=" + getDateCreated() + use super
               super.toString() +
               "\noverdraftLimit=" + overdraftLimit +
               '}';
    }
}
