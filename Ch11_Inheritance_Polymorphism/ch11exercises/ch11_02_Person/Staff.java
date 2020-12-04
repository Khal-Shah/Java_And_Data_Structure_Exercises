package ch11exercises.ch11_02_Person;

import ch10exercises.Ch10_14_MyDate.MyDate;

/*
A staff member has a title
 */
public class Staff extends Employee
{
    private String title;

    public Staff()
    {

    }

    public Staff(String title)
    {
        this.title = title;
    }

    public Staff(String office, double salary, MyDate date, String title)
    {
        super(office, salary, date);
        this.title = title;
    }

    public Staff(String name, String address, String number, String email)
    {
        super(name, address, number, email);
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate date, String title)
    {
        super(name, address, phoneNumber, email, office, salary, date);
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "Staff{" +
                "title='" + title + '\'' +
                '}' + "...Person: " + super.getName();
    }
}
