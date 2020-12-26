package ch12exercises.ex04_argument;

public class LoanController
{
    public static void main(String[] args)
    {
        Loan loan1, loan2, loanDefault;
        //Constructor parameters: Loan(double annualInterestRate, int numberOfYears, double loanAmount)
        loanDefault = new Loan();

        try
        {
            //loan1 negative years
            loan1 = new Loan(1.9, -2, 20000);

            //loan2 interest = 0                will not reach below codes if above throws Exception
            loan2 = new Loan();
            loan2.setAnnualInterestRate(0);
        }
        catch(IllegalArgumentException ex)
        {
            //ex.printStackTrace();
            System.out.println(ex.toString());
        }
        finally
        {
            System.out.println(loanDefault.toString());
        }
    }
}
