package ch11exercises.ch11_02_Person;

import ch10exercises.Ch10_14_MyDate.MyDate;

/*
A faculty member has office hours and a rank
 */
public class Faculty extends Employee
{
    private String officeHours;
    private String rank;

    public Faculty()
    {

    }

    public Faculty(String officeHours, String rank)
    {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String office, double salary, MyDate date, String officeHours, String rank)
    {
        super(office, salary, date);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate date, String officeHours, String rank)
    {
        super(name, address, phoneNumber, email, office, salary, date);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name, String address, String phone, String email)
    {
        super(name, address, phone, email);
    }

    public String getOfficeHours()
    {
        return officeHours;
    }

    public void setOfficeHours(String officeHours)
    {
        this.officeHours = officeHours;
    }

    public String getRank()
    {
        return rank;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "{" +
                "officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                '}' + "...Person: " + super.getName();
    }
}
