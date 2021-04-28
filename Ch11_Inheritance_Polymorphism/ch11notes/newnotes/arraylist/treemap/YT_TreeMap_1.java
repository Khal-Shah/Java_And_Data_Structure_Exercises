package ch11notes.newnotes.arraylist.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class YT_TreeMap_1
{
    public static void main(String[] args)
    {
        //TreeMap - Stores KEYS in sorted order
        Map<String, Cricketer> treemap = new TreeMap<String, Cricketer>();
        treemap.put("Sachin", new Cricketer("Sachin", 14000));
        System.out.println(treemap);

        treemap.put("Dravid", new Cricketer("Dravid", 12000));
        System.out.println(treemap);

        treemap.put("Bradman", new Cricketer("Bradman", 9996));
        System.out.println(treemap);

        System.out.println(treemap.get("Sachin"));

        System.out.println(treemap.keySet().size());

//        ArrayList<String> temp = new ArrayList<>();
//        temp.add("One");
//        temp.add("two");
//        temp.add("Three");
//        int i = 0;
//
//        for(String e: temp)
//        {
//            System.out.println(temp.get(i++));
//        }
    }

    static class Cricketer
    {
        String name;
        int runs;

        public Cricketer(String name, int runs)
        {
            super();
            this.runs = runs;
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name + ", " + runs;
        }
    }
}
