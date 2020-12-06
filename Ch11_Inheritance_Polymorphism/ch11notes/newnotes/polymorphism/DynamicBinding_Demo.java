package ch11notes.newnotes.polymorphism;

import ch11exercises.ch11_02_Person.*;

public class DynamicBinding_Demo
{
    public static void main(String[] args)
    {
        //printObj(new Staff("Unimportant"));
        //printObj(new Employee());
        printObj(new Student());
        printObj(new Person());
        printObj(new Object());
    }

    public static void printObj(Object x)
    {
        System.out.println(x.toString());
    }
}

//Prints toString of each method, if one of the classes didn't have it
//it would search in the next most general class.