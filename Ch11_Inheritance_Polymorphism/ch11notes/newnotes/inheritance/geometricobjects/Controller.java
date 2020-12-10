package ch11notes.newnotes.inheritance.geometricobjects;

public class Controller
{
    public static void main(String[] args)
    {
        GeometricObject circle1 = new Circle(1);
//        circle.setRadius(2);
        circle1.setColor("Red");
        System.out.println(circle1.toString() + "\nThe color is " + circle1.getColor() + "\n" +
                           "Diameter of " + ((Circle) circle1).getDiameter() + "\nHas an area of " + ((Circle) circle1).getArea());

        GeometricObject circle2 = new Circle(1);
        System.out.println(((Circle) circle1).equals(circle2));
    }
}
