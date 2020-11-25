package ch13notes.Ch13_2_AbstractClasses;

public class GeometricObjectController
{
    public static void main(String[] args)
    {
        //Circle circle = new Circle()
        //^Instead of creating obj from each class, we can create them from the same GeoObj class (cuz of extends)
        GeometricObject geoObj1 = new Circle(5);
        GeometricObject geoObj2 = new Rectangle(5, 3);

        //System.out.println("The two objects have the same area? " + (geoObj1.getArea() == geoObj2.getArea()));
        //or we can make a method in the abs superclass
        System.out.println("The two objects have the same area? " + equalArea(geoObj1, geoObj2));

        //set circle to purple
        geoObj1.setColor("Purple");

        //Set rectangle isFilled to true
        geoObj2.setFilled(true);

        //Display circle
        displayGeometricObject(geoObj1);
        //display rectangle
        displayGeometricObject(geoObj2);

    }

    //we would not be able to implement equalArea() if getArea() wasn't defined in GeometricObject class
    public static boolean equalArea(GeometricObject geoObj1, GeometricObject geoObj2)
    {
        return geoObj1.getArea() == geoObj2.getArea();
    }

    public static void displayGeometricObject(GeometricObject geoObj)
    {
        System.out.println("Area: " + geoObj.getArea() + "\nPerimeter: " + geoObj.getPerimeter() + "\n" +
                           "Is filled: " + geoObj.isFilled() + "\nColor: " + geoObj.getColor());

        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
    }
}
