package ch12notes.newnotes;

public class Demo5_ChainedException
{
    public static void main(String[] args)
    {
        try
        {
            method1();
        }
        catch(Exception ex)
        {
            System.out.println("In main: " + ex.getMessage());              //Caught from m1
            ex.printStackTrace();
            StackTraceElement[] stackTraceElement = ex.getStackTrace();
            for(int i = 0; i < stackTraceElement.length; i++)
            {
                System.out.println("method: " + stackTraceElement[i].getMethodName() + "\tLine: " +
                                   stackTraceElement[i].getLineNumber());
            }
        }
        finally
        {
            System.out.println("End of program.");
        }

        System.out.println("!!!");

    }

    public static void method1() throws Exception
    {
        try
        {
            method2();
        }
        catch(Exception ex)
        {
            System.out.println("In method 1.");
            throw new Exception("New info from method1", ex);           //B: gets thrown to main (caller)
        }
    }

    public static void method2() throws Exception
    {
        System.out.println("In method 2");
        throw new Exception("New info from method2");                   //A: gets thrown to method1 (caller)
    }
}
