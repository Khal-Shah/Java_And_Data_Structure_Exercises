package ch13notes.sect_6_comparable_interface;
import ch13notes.sect_2_abstract_classes.GeometricObject;
import ch13notes.sect_2_abstract_classes.Rectangle;

import java.util.Arrays;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>
{
    ComparableRectangle(double width, double height)
    {
        super(width, height);
    }

    //Here is where we'd either sort it using getPerimeter or getArea
    @Override
    public int compareTo(ComparableRectangle o)
    {
        if(getArea() > o.getArea())
        {
            return 1;
        }

        else if(getArea() < o.getArea())
        {
            return -1;
        }

        return 0;
    }

    public static void main(String[] args)
    {
        GeometricObject[] rectangles = {new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 1), new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)};

        System.out.println("Before sorting: ");
        for(GeometricObject o: rectangles)
        {
            System.out.println(o.getArea());
        }

        System.out.println("After sorting: ");
        //Now sort:
        Arrays.sort(rectangles);

        for(GeometricObject o: rectangles)
        {
            System.out.println(o.getArea());
        }

        ComparableRectangle r1 = new ComparableRectangle(2,3);
        ComparableRectangle r2 = new ComparableRectangle(3,5);
        //We could declare it using GeometricObject but then we'd have to cast it below when using compareTo
        System.out.println(r2.compareTo(r1));
    }
}
