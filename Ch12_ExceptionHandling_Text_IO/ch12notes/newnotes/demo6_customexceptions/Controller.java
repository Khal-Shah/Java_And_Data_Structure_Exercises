package ch12notes.newnotes.demo6_customexceptions;

public class Controller
{
    public static void main(String[] args) throws InvalidRadiusException
    {
        try
        {
            CircleWithCustomException c1 = new CircleWithCustomException(1);
            CircleWithCustomException c2 = new CircleWithCustomException(-1);
        }
        catch(InvalidRadiusException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            System.out.println("Number of objects created: " + CircleWithCustomException.numberOfObjects);
        }
    }
}
