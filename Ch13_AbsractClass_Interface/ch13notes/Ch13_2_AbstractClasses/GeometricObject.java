package ch13notes.Ch13_2_AbstractClasses;

import java.util.Date;

public abstract class GeometricObject
{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject()     //default geometric obj
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

    @Override
    public String toString()
    {
        return "Created on " + dateCreated + "\nColor " + color + "\n" +
                "Filled " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
