package ch11exercises.ch11_02_Person;

import ch10exercises.Ch10_14_MyDate.MyDate;

/*
An employee has an office, salary, and date hired. Use the MyDate class
defined in Programming Exercise 10.14 to create an object for date hired.
 */
public class Employee extends Person
{
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee()
    {

    }

    public Employee(String name, String address, String number, String email)
    {
        super(name, address, number, email);
    }

    public Employee(String office, double salary, MyDate date)
    {
        this.office = office;
        this.salary = salary;
        this.dateHired = date;
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate date)
    {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = date;
    }

    public String getOffice()
    {
        return office;
    }

    public void setOffice(String office)
    {
        this.office = office;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public MyDate getDate()
    {
        return dateHired;
    }

    public void setDate(MyDate date)
    {
        this.dateHired = date;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", hired date=" + dateHired.toString() +
                '}' + "...Person: " + super.getName();
    }
}
