package ch11exercises.ch11_02_Person;

import ch10exercises.Ch10_14_MyDate.MyDate;

/** Chapter 11 - Exercise 2:
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a class named
 * Person and its two subclasses named Student and Employee. Make Faculty and Staff
 * subclasses of Employee. A person has a name, address, phone number, and email
 * address. A student has a class status (freshman, sophomore, junior, or senior).
 * Define the status as a constant. An employee has an office, salary, and date
 * hired. Use the MyDate class defined in Programming Exercise 10.14 to create
 * an object for date hired. A faculty member has office hours and a rank.
 * A staff member has a title. Override the toString method in each class to
 * display the class name and the person’s name.
 *
 * Write a test program that creates a Person, Student, Employee, Faculty, and
 * Staff, and invokes their toString() methods.
 * @author Khaled Shah
 */
public class Controller
{
    public static void main(String[] args)
    {
        //Person
        Person person = new Person("Khaled", "Lasalle Quebec", "438-921-6839",
                "peoul@msn.com");

        Student student = new Student();

        Employee employee = new Employee("WFH", 60_000.00, new MyDate(2020, 11, 3, "Thursday"));

        Faculty facultyMember = new Faculty("Mon - Fri, 9-5", "Newbie");

        Staff staffMember = new Staff("Librarian");

    }
}
