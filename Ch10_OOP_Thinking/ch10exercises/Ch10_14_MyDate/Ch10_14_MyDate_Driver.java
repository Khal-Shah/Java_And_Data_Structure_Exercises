package ch10exercises.Ch10_14_MyDate;

/* Chapter 10 - Exercise 14:
Draw the UML diagram for the class and then implement the class. Write a test program that creates two MyDate objects(using new MyDate()
and new MyDate(34355555133101L)) and displays their year, month, and day.
 */
    //By Khaled Shah

public class Ch10_14_MyDate_Driver
{
    public static void main(String[] args)
    {
       MyDate today = new MyDate();
       MyDate pastDay = new MyDate(34355555133101L);      //34355555133101L => 3048

       display(today);
       display(pastDay);
    }

    public static void display(MyDate day)
    {
        System.out.println(day.getDayName() + ", " + day.getYear() + "/" + day.getMonth() + "/" + day.getDay());
    }
}
