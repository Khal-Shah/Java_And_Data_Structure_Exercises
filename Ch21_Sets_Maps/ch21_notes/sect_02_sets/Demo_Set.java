package ch21_notes.sect_02_sets;

import org.junit.Test;

import java.util.*;

public class Demo_Set
{
    //HashSet
    @Test
    public void testHashSet()
    {
        Set<String> cities = new HashSet<>();
        Collections.addAll(cities, "Tampa Bay", "Montreal", "Las Vegas", "Long Island",
                           "Milwaukee", "Phoenix");

        //simply print it out (can also be done by just print(cities)
        cities.forEach(e ->
                               System.out.print(e.toUpperCase() + "\t"));
        System.out.println("\nSize: " + cities.size());

        //sort using comparator: can't be done because this is a set, sort is for Lists (ordered
        // elements

        //Add a repeated element
        cities.add("Montreal");
        System.out.println("\n" + cities);
        System.out.println("Size: " + cities.size());
        //^Won't be added

        //all method in Collection still applies
        System.out.println("Phoenix exists in the set? -> " + cities.contains("Phoenix"));
        cities.remove("Phoenix");
        System.out.println("Phoenix exists in the set? -> " + cities.contains("Phoenix"));
    }

    //LinkedHashSet: not as efficient as HashSet but can maintain insertion order
    @Test
    public void testLinkedHashSet()
    {
        Set<String> cities = new LinkedHashSet<>();
        Collections.addAll(cities, "Tampa Bay", "Montreal", "Las Vegas", "Long Island",
                           "Milwaukee", "Phoenix");

        System.out.println(cities);
    }

}
