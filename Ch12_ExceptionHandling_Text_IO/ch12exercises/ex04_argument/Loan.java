package ch12exercises.ex04_argument;

import java.util.Date;

/** Chapter 12 - Exercise 4:
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to throw IllegalArgumentException
 * if the loan amount, interest rate, or number of years is less than or equal to zero.
 *
 * @author Khaled Shah
 */

public class Loan
{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan()
    {
        this(2.5, 1, 1000);
        loanDate = new Date();
    }

    //throw IllegalArgumentException
    // * if the loan amount, interest rate, or number of years is less than or equal to zero
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        loanDate = new Date();
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        if(annualInterestRate  <= 0)
        {
            throw new IllegalArgumentException("The interest rate has to be greater than 0.");
        }

        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears()
    {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears)
    {
        if (numberOfYears > 0)
        {
            this.numberOfYears = numberOfYears;
        }

        else
        {
            throw new IllegalArgumentException("Number of years cannot be 0 or negative.");
        }
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    //throw IllegalArgumentException
    // * if the loan amount, interest rate, or number of years is less than or equal to zero
    public void setLoanAmount(double loanAmount)
    {
        if (loanAmount <= 0)
        {
            IllegalArgumentException exception = new IllegalArgumentException("The loan amount has to be greater than 0.");
            throw exception;
        }

        this.loanAmount = loanAmount;
    }

    public Date getLoanDate()
    {
        return loanDate;
    }


    public double getMonthlyPayment()
    {
        double monthlyInterestRate = getAnnualInterestRate() / (12 * 100);
        double monthlyPayment = getLoanAmount() * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate,
                                                                                      getNumberOfYears() * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment()
    {
        return (getMonthlyPayment() * 12 * getNumberOfYears());
    }

    @Override
    public String toString()
    {
        return "Loan{" +
               "annualInterestRate=" + annualInterestRate +
               ", numberOfYears=" + numberOfYears +
               ", loanAmount=" + loanAmount +
               ", loanDate=" + loanDate +
               '}';
    }
}
