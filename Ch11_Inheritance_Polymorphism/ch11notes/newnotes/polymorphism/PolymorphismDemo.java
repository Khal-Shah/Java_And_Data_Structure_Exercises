package ch11notes.newnotes.polymorphism;
import ch11notes.newnotes.inheritance.geometricobjects.*;

public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(1, "Red", false);
        displayObject(circle);
    }

    public static void displayObject(GeometricObject object)
    {
        System.out.printf("Created on " + object.getDateCreated() +
                "\nColor is " + object.getColor());
    }
}
