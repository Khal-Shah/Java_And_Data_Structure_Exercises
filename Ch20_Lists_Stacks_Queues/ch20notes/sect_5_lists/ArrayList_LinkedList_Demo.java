package ch20notes.sect_5_lists;

import java.util.*;

public class ArrayList_LinkedList_Demo
{
    public static void main(String[] args)
    {
        //ArrayList
        List<Integer> arrayListRef = new ArrayList<>();
//        arrayListRef = Arrays.asList(1, 2, 3, 1 , 4);
        Collections.addAll(arrayListRef, 1, 2, 3, 1 , 4);
        arrayListRef.add(0, 10);
        arrayListRef.add(3, 30);

        System.out.println("A list of integers in the arraylist: ");
        arrayListRef.forEach(e ->
                                     System.out.print(e + "\t"));

        System.out.println();

        //LinkedList
        LinkedList<Object> linkedListRef = new LinkedList<>(arrayListRef);
        linkedListRef.add(1, "red");
        linkedListRef.removeLast();
        linkedListRef.addFirst("green");

        //forward traversal:
        System.out.println("LinkedList items forward: ");
        ListIterator iterator = linkedListRef.listIterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + "\t");       //.next makes it reach the end
        }

        System.out.println();

        //backward traversal:
        System.out.println("LinkedList items backward: ");
        while(iterator.hasPrevious())
        {
            System.out.print(iterator.previous() + "\t");
        }


    }
}
