package ch20notes.sect_2_collections;

import java.util.*;

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

        System.out.println("========================================================================");
        //Using ArrayList and HashSet and LinkedList
        //ArrayList
        Collection<String> names = new ArrayList<>();
        //Collections = utility class with static methods
        Collections.addAll(names, "Bart", "Homer", "Lisa", "Maggie", "Marge");
        System.out.println("Names: " + names);

        //HashSet
        Collection<String> companies = new HashSet<>();
        Collections.addAll(companies, "Apple", "Amazon", "Facebook", "Microsoft", "Netflix", "Google");
        System.out.println("Companies: " + companies);

        companies.addAll(names);
        System.out.println("Companies and Names joined with addAll(): " + companies);

        //LinkedList
        Collection<String> days = new LinkedList<>();
        Collections.addAll(days, "Sat", "Sun", "Mon", "Tue", "Wed");
        System.out.println("Days: " + days);
        //arraylist(names) was added to companies (hashshet), now we'll add companies to days
        days.addAll(companies);

        System.out.println("Days after adding companies: " + days);
    }
}





