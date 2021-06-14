package ch13notes.sect_7_cloneable_interface;

import java.util.Date;

public class House implements Cloneable, Comparable<House>
{

    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area)
    {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    @Override
    public int compareTo(House o)
    {
        if(this.getArea() > o.getArea())
        {
            return 1;
        }

        else if(this.getArea() < o.getArea())
        {
            return -1;
        }

        return 0;
    }

    //Override the protected clone method defined in the Object class
//    @Override
//    public Object clone() throws CloneNotSupportedException
//    {
//        return super.clone();
//    }
//    With ^this clone() method, each field from the original object is copied to the target object.
//    If field is of primitive type, its value is copied, but if field is of object (like whenBuilt)
//    then the reference of the field is copied (known as shallow copy).
//    So if you do house1.whenBuilt == house2.whenBuilt, it'll return true

    //To make a deep copy where the object's content is copied rather than its reference,
    //use following method
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        //shallow copy
        House houseClone = (House) super.clone();

        //deep copy on whenBuilt
        houseClone.whenBuilt = (Date) whenBuilt.clone();
        return houseClone;
    }
    //Now  house1.whenBuilt == house2.whenBuilt will be false because house1 and house2 contain 2 diff
    //date objects

    public int getId()
    {
        return id;
    }

    public double getArea()
    {
        return area;
    }

    public Date getWhenBuilt()
    {
        return whenBuilt;
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        House house1 = new House(1, 1750.50);
        House house2 = (House) house1.clone();
//        house2.whenBuilt = new Date(2000, 11, 5);
        System.out.println(house1.whenBuilt);
        System.out.println(house2.whenBuilt);
        System.out.println(house1.whenBuilt == house2.whenBuilt);
    }
}
