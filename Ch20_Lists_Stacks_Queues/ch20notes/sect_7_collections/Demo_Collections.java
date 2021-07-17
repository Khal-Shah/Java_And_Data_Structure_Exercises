package ch20notes.sect_7_collections;

import java.util.*;

public class Demo_Collections
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Ruby", "Billy", "Frankie", "Erina", "Tommy", "Jake");
//        System.out.println("Before: " + names);

        Collections.sort(names);
        System.out.print("\nAfter: ");
        names.forEach(e ->System.out.print(e + "\t"));

        names.sort(Comparator.comparing(String::length).thenComparing(String::valueOf).reversed());
        System.out.print("\nSorted by length of names: " + names);

        System.out.println("\n\n=================================\n");


//        List<Integer> list1 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
        List<Integer> list1 = new LinkedList<>();
        Collections.addAll(list1, 2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
        //Binary Search
        System.out.println("Index of key 11: " + Collections.binarySearch(list1, 11));

        Collections.shuffle(list1);
        System.out.println("After shuffling: " + list1);

        System.out.println("\n\n=================================\n");

//        //Copying (dest, src)
        List<Integer> list2 = new LinkedList<>(list1);
        Collections.copy(list2, list1);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        System.out.println("List1 == List2? - " + list1.equals(list2));

        list1.add(-1);
        System.out.println("List1 has been altered: " + list1);
        System.out.println("List2 has not been altered: " + list2);
        System.out.println("List1 == List2? - " + list1.equals(list2));

        System.out.println("\n\n=================================\n");

        Collections.fill(list1, 0);
        System.out.println("List1 was filled with only zeroes: " + list1);
        System.out.println("List2: " + list2);

        list2.add(10);
        System.out.println("List2 max: " + Collections.max(list2) + "\nList2 min: " + Collections.min(list2));

        //Have to sort to use .binarySearch
        Collections.sort(list2);
        System.out.println("Index of List2 max: " + Collections.binarySearch(list2, Collections.max(list2))
                           + "\nIndex of List2 min: " + Collections.binarySearch(list2, Collections.min(list2)));

        System.out.println("10 appears how many times in list2? " + Collections.frequency(list2,
                                                                                          10));
        System.out.println("List 1 and List2 share no common elements? " + Collections.disjoint(list1, list2));

        //Add 0 to list2 so that they have a common element
        list2.add(0);
        System.out.println("List 1 and List2 share no common elements? " + Collections.disjoint(list1, list2));

    }
}
