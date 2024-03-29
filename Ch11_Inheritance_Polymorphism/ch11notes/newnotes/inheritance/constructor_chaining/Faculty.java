package ch11notes.newnotes.inheritance.constructor_chaining;

public class Faculty extends Employee
{
    public Faculty()
    {
        System.out.println("(4) Performs faculty's tasks.");
    }

    public static void main(String[] args)
    {
        new Faculty();
    }

}

class Employee extends Person
{
    public Employee()
    {
        this("(2) Invoke Employee's overloaded constructor.");
        System.out.println("(3) Perform Employee's tasks.");
    }

    public Employee(String s)
    {
        System.out.println(s);
    }

}

class Person
{
    public Person()
    {
        System.out.println("(1) Perform Person's tasks.");
    }
}
