package ch13notes.sect_2_abstract_classes;

import java.util.Date;

public abstract class GeometricObject
{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject()     //Constructor can only be invoked from child
    {
        dateCreated = new Date();
    }

    //geo obj with color and filled value

    protected GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public static void displayGeometricObject(GeometricObject geoObj)
    {
        System.out.println("Area: " + geoObj.getArea() + "\nPerimeter: " + geoObj.getPerimeter() + "\n" +
                "Is filled: " + geoObj.isFilled() + "\nColor: " + geoObj.getColor());

        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
    }

    @Override
    public String toString()
    {
        return "Created on " + dateCreated + "\nColor " + color + "\n" +
                "Filled " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
