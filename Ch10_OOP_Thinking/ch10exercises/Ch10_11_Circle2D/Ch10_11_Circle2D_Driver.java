package ch10exercises.Ch10_11_Circle2D;

/* Chapter 10 - Exercise 11:
    Draw the UML diagram for the class and then implement the class.
    Write a test program that createsa Circle2D object c1 (new Circle2D(2, 2, 5.5)), displays its area and perimeter,
    and displays the result of c1.contains(3, 3), c1.contains(new Circle2D(4, 5, 10.5)),
    and c1.overlaps(new Circle2D(3, 5, 2.3)).
 */
        //By Khaled Shah

public class Ch10_11_Circle2D_Driver
{
    public static void main(String[] args)
    {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.printf("Area of c1: %.2f\nPerimeter of c1: %.2f\n", c1.getArea(), c1.getPerimeter());

        Circle2D c2 = new Circle2D(4, 5, 10.5);
        System.out.println("Does circle 1 contain circle 2? - " + c1.contains(c2));

        System.out.println("Does the point \"(3,3)\" contain in circle 1? - " + c1.contains(3, 3));

        System.out.println("Does circle1 and circle with radius 2.3 and center \"(3,5)\" overlap? - " + c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}
