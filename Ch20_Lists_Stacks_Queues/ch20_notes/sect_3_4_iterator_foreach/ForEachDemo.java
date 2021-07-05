package ch20_notes.sect_3_4_iterator_foreach;

import java.util.Collections;
import java.util.LinkedList;

public class ForEachDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> cities = new LinkedList<>();
        Collections.addAll(cities, "Buffalo", "Detroit", "Ottawa", "Boston", "Miami");

        //forEach method:
        cities.forEach(e ->
                System.out.print(e + "\t"));
        System.out.println();
        //to uppercase
        cities.forEach(e ->
                System.out.print(e.toUpperCase() + "\t"));



    }
}
