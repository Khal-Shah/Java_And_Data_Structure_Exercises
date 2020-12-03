package ch11notes.newnotes.inheritance.geometricobjects;

public class Controller
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(1);
//        circle.setRadius(2);
        circle.setColor("Red");
        System.out.println(circle.printCircle() + "\nThe color is " + circle.getColor() + "\n" +
                           "Diameter of " + circle.getDiameter() +"\nHas an area of " + circle.getArea());
    }
}
