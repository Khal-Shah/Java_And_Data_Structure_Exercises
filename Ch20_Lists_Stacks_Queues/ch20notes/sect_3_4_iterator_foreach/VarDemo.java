package ch20notes.sect_3_4_iterator_foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class VarDemo
{
    public static void main(String[] args)
    {
        Collection<String> names = new ArrayList<>();
        Collections.addAll(names, "Rob", "Jon", "Sansa", "Arya", "Brandon");

        //1) regular iterator
        System.out.print("1) Using regular iterator: ");
        Iterator<String> myIterator = names.iterator();
        while(myIterator.hasNext())
        {
            System.out.print(myIterator.next() + "\t");
        }
        System.out.println("\n================================================================");


        //2) shortcut iterator (foreach loop)
        System.out.print("2) Using shortcut iterator aka foreach LOOP: ");
        for(String e: names)
        {
            System.out.print(e + "\t");
        }
        System.out.println("\n================================================================");


        //3) Using foreach method (lamdba)
        System.out.print("3) Using foreach METHOD (lambda): ");
        names.forEach(e ->
                System.out.print(e + "\t"));
        System.out.println("\n================================================================");


        //4) Now we'll look at doing regular iterator (#1) but we'll declare it differently
        //Using var to set iterator if we're not sure what the correct type of iterator should be
        System.out.print("4) Using \"var\" to declare iterator: ");

        var myIterator2 = names.iterator();

        while(myIterator2.hasNext())
        {
            System.out.print(myIterator2.next() + "\t");
        }
    }
}
