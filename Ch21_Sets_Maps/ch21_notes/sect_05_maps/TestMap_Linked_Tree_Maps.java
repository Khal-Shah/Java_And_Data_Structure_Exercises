package ch21_notes.sect_05_maps;

import org.junit.Test;

import java.util.*;

public class TestMap_Linked_Tree_Maps
{
    @Test
    public void testLinkedHashMap()
    {
        //LinkedMap in ascending order of golfers (key) and their major totals (value)
//        Map<String, Integer> majors = new LinkedHashMap<>();

//        Insertion order is the default, for access order we have to specify cap, load, true
        Map<String, Integer> majors = new LinkedHashMap<>(16, 0.75f, true);
        majors.put("Rory McllRoy", 4);
        majors.put("Phil Mickelson", 6);
        majors.put("Tom Watson", 8);
        majors.put("Ben Hogan", 9);
        majors.put("Tiger Woods", 15);
        majors.put("Jack Nicklaus", 18);

        Iterator<Map.Entry<String, Integer>> iterator = majors.entrySet().iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("\nTom Watson has total major count of " + majors.get("Tom Watson"));
        System.out.println("Tiger has " + majors.get("Tiger Woods") + " majors");
        System.out.println(majors);
    }

    @Test
    public void testTreeMap()
    {
        Map<String, Integer> showDebuts = new TreeMap<>(Comparator.reverseOrder());
        showDebuts.put("Daredevil", 2015);
        showDebuts.put("Lost", 2004);
        showDebuts.put("Seinfeld", 1989);
        showDebuts.put("Fleabag", 2016);
        showDebuts.put("Breaking Bad", 2008);

        //Comparator always sorts by KEYS
        System.out.println(showDebuts);

        //copy values to a List so we can sort it
        List<Integer> showYear = new LinkedList<>(showDebuts.values());


        Collections.sort(showYear);
        System.out.println("The years in sorted order are: " );

        for(int i = 0; i < showYear.size(); i++)
        {
            System.out.print(showYear.get(i) + "\t");
        }
    }
}
