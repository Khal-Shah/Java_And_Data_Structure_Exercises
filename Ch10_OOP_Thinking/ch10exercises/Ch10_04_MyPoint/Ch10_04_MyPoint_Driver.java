package ch10exercises.Ch10_04_MyPoint;

/* Chapter 10 - Exercise 4:
 (The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains:
■ The data fields x and y that represent the coordinates with getter methods.
■ A no-arg constructor that creates a point (0, 0).
■ A constructor that constructs a point with specified coordinates.
■ A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
Draw the UML diagram for the class and then implement the class. Write a test program that creates the two
points (0, 0) and (10, 30.5) and displays the distance between them.
 */
    //By Khaled Shah

public class Ch10_04_MyPoint_Driver
{
    public static void main(String[] args)
    {
        //points (0, 0) and (10, 30.5) and displays the distance between them.
        MyPoint point1 = new MyPoint(); //(0, 0)
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.printf("The distance between points (%.1f, %.1f) and (%.1f, %.1f) is %.2f\n",
                          point1.getX(), point1.getY(), point2.getX(), point2.getY(), point1.distance(point2));

        //Check distance between (-2, 3) and (-4, 4)
        MyPoint point3 = new MyPoint(-2, -3);
        System.out.printf("The distance between points (%.1f, %.1f) and (-4.0, 4.0) is %.2f",
                          point3.getX(), point3.getY(), point3.distance(-4, 4));
        //uses the method that takes in specified values and returns distance with the instance values.
    }
}
