package ch11exercises.ch11_02_Person;

/*
A student has a class status (freshman, sophomore, junior, or senior).
Define the status as a constant.
 */
public class Student extends Person
{
    private static final String STATUS = "Senior";

    public Student()
    {

    }

    public Student(String name, String address, String phoneNumber, String email)
    {
        super(name, address, phoneNumber, email);
    }

    public static String getSTATUS()
    {
        return STATUS;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "\n" + STATUS;
    }
}
