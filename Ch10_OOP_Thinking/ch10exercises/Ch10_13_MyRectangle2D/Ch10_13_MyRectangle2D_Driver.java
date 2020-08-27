package ch10exercises.Ch10_13_MyRectangle2D;
/* Chapter 10 - Exercise 13:
Draw the UML diagram for the class and then implement the class.
Write a test program that creates a MyRectangle2D object r1 (new MyRectangle2D(2, 2, 5.5, 4.9)),
displays its area and perimeter, and displays the result of r1.contains(3, 3),r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)),
and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
 */
    //By Khaled Shah

public class Ch10_13_MyRectangle2D_Driver
{
    public static void main(String[] args)
    {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        display(r1);
    }

    public static void display(MyRectangle2D rect)
    {
        System.out.printf("Area: %.2f\nPerimeter: %.2f\nRectangle contains point (3, 3): %b\nRectangle contains another" +
                          " rectangle with constructor (4, 5, 10.5, 3.2): %b\nRectangle overlaps another rectangle with" +
                          " constructor (3, 5, 2.3, 5.4): %b",
                          rect.getArea(), rect.getPerimeter(), rect.contains(3, 3), rect.contains(new MyRectangle2D(4, 5, 10.5, 3.2)),
                          rect.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
