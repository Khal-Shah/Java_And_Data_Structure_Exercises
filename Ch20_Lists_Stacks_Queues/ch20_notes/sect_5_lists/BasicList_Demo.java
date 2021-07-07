package ch20_notes.sect_5_lists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BasicList_Demo
{
    public static void main(String[] args)
    {
        List<String> tokens = new LinkedList<>();
        Collections.addAll(tokens, "Bitcoin", "Ether", "Dot", "Ada", "Link");

        var iterator = tokens.listIterator(tokens.size());

        while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }

        System.out.println("=======================================================");


        //ListIterator as declared class instead of Iterator
        ListIterator<String> iterator2 = tokens.listIterator();

        while(iterator2.hasNext())
        {
            System.out.print(iterator2.nextIndex() + ": " + iterator2.next().toUpperCase() + "\t");
            iterator2.set("Replaced");
        }

        System.out.println("\n=======================================================");

        while(iterator2.hasPrevious())
        {
            System.out.print(iterator2.previousIndex() + ": " + iterator2.previous().toUpperCase() +
                             "\t");
        }

        System.out.println("\n=======================================================");


        while(iterator2.hasNext())
        {
            System.out.print(iterator2.nextIndex() + ": " + iterator2.next().toUpperCase() + "\t");
            iterator2.set("Eth is the Future");
        }


        System.out.println("\n=======================================================");


        while(iterator2.hasPrevious())
        {
            System.out.print(iterator2.previousIndex() + ": " + iterator2.previous().toUpperCase() +
                             "\t");
        }


    }
}
