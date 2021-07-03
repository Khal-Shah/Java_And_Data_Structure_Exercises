package ch20_notes.sect_2_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestCollections
{
    public static void main(String[] args)
    {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "New York", "Atlanta", "Dallas", "Madison");
        //Note: Collections != Collection
        //This sect is about Collection class but we're using Collections for brevity to add elements

        System.out.println("A list of cities in collection1: " + cities);
        System.out.println("Is \"Dallas\" in collection? " + cities.contains("Dallas"));

        cities.remove("Dallas");
        System.out.println("Is \"Dallas\" in collection now? " + cities.contains("Dallas"));
        System.out.println("Cities collection size: " + cities.size());

        Collection<String> moreCities = new ArrayList<>();
        moreCities.add("Seattle"); moreCities.add("Portland");
        moreCities.add("Los Angeles"); moreCities.add("Atlanta");
        System.out.println("More cities in collection: " + moreCities);

        //clone cities to new ArrayList ref
        ArrayList<String> clonedCities = (ArrayList<String>) cities.clone();
        System.out.println("Cloned cities: " + clonedCities);

        //addAll to add moreCities to clonedCities
        clonedCities.addAll(moreCities);
        System.out.println("Common in cities OR moreCities: " + clonedCities);

        clonedCities = (ArrayList<String>) cities.clone();
        System.out.println("Cloned cities: " + clonedCities);
        //+retainAll(c: Collection<?>): Retains the elements that are both in c and in this collection.
        clonedCities.retainAll(moreCities);
        System.out.println("Common in cities AND moreCities: " + clonedCities);





    }
}





