package ch21_notes.sect_03_04_performance_case_study;

import java.util.*;

public class PerformanceTest_Set_List
{
    static final int N = 50_000;

    public static void main(String[] args)
    {
        //add numbers from 0 to N - 1 to arraylist
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++)
        {
            list.add(i);
        }
        //Shuffle the list
        Collections.shuffle(list);

        //Create a set (hashset)
        Set<Integer> hashSet = new HashSet<>(list);
        //perform membership and removal tests
        System.out.println("Member test time for hash set is " + getMembershipTime(hashSet) + "ms\n" +
                "Removing of elements time for hash set is " + getRemovalTime(hashSet) + "ms\n=\t=\t=\t=");

        //Create a set (linkedhashset)
        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        //perform membership and removal tests
        System.out.println("Member test time for linked hash set is " + getMembershipTime(linkedHashSet) + "ms\n" +
                "Removing of elements time for linked hash set is " + getRemovalTime(linkedHashSet) + "ms\n=\t=\t=\t=");

        //Create a set (treeset)
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        //perform membership and removal tests
        System.out.println("Member test time for tree set is " + getMembershipTime(treeSet) + "ms\n" +
                "Removing of elements time for tree set is " + getRemovalTime(treeSet) + "ms\n=\t=\t=\t=");

        //Create a List (arrayList)
        List<Integer> arraylist = new ArrayList<>(list);
        //perform membership and removal tests
        System.out.println("Member test time for array list is " + getMembershipTime(arraylist) + "ms\n" +
                "Removing of elements time for array list is " + getRemovalTime(arraylist) + "ms\n=\t=\t=\t=");

        //Create a List (LinkedList)
        List<Integer> linkedList = new LinkedList<>(list);
        //perform membership and removal tests
        System.out.println("Member test time for linked list is " + getMembershipTime(linkedList) + "ms\n" +
                "Removing of elements time for linked list is " + getRemovalTime(linkedList) + "ms\n=\t=\t=\t=");
    }

    //returns time taken to check if a collection contains an element
    public static long getMembershipTime(Collection<? extends Number> c)
    {
       long startTime = System.currentTimeMillis();

       for(int i = 0; i < N; i++)
       {
           c.contains((int) (Math.random() * 2 * N));
       }

       return System.currentTimeMillis() - startTime;
    }

    //returns time taken to remove every element from a collecion
    public static long getRemovalTime(Collection<Integer> c)
    {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < c.size(); i++)
        {
            c.remove(i);
        }

        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

}
