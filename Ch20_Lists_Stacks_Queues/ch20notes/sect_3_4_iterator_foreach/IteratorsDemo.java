package ch20notes.sect_3_4_iterator_foreach;

import java.util.*;

public class IteratorsDemo
{
    public static void main(String[] args)
    {
        Collection<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Montreal", "Vegas", "Tampa", "Colorado");

        //collection interface extends iterable interface
        Iterator<String> myIterator = cities.iterator();
        while(myIterator.hasNext())
        {
            System.out.println(myIterator.next().toUpperCase());
        }

        //foreach uses an iterator behind the scenes
        System.out.println("Now using the for shortcut");
        for(String o: cities)
        {
            System.out.print(o.toLowerCase());
        }

        System.out.println("========================================================\n");

        Collection<Number> numbers = new LinkedList<>();
        Collections.addAll(numbers, 2.5, -92.2, 52.4 ,5.9, 100.0, -39.3);

        //Iterator
        Iterator<Number> iterator = numbers.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + "\t");
        }

        System.out.println();

        for(Number e: numbers)
        {
            System.out.print(e + "\t");
        }
    }
}
