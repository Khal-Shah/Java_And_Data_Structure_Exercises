package ch20notes.sect_9_10_vectors_queues;

import java.util.*;

public class Demo_Queue_VS_Stack
{
    public static void main(String[] args)
    {
        //Make stack of Integers
        Stack<Integer> integerStack = new Stack<>();
        Collections.addAll(integerStack, 1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);

        //Make Queue of Integers
        Deque<Integer> integerQueue = new LinkedList<>();
        Collections.addAll(integerQueue, 9, 15, 21, 25, 27, 33, 35);

        integerStack.push(37);
        System.out.println("Inserted 37 to integerStack using push: " + integerStack);
        integerStack.add(41);
        System.out.println("Inserted 41 to integerStack using add: " + integerStack);
        System.out.println("Performing pop: " + integerStack.pop());
        System.out.println("Performing peek: " + integerStack.peek());

        System.out.println(integerStack);

        System.out.println("\n");

        integerQueue.offer(39);
        System.out.println("Inserted 39 to integerQueue using offer: " + integerQueue);
        integerQueue.add(45);
        System.out.println("Inserted 45 to integerQueue using add: " + integerQueue);
        System.out.println("Performing peek: " + integerQueue.peek());
        System.out.println("Performing poll: " + integerQueue.poll());

        integerQueue.removeLast();
        System.out.println("Removed last using removeLast(): " + integerQueue);
        integerQueue.removeFirst();
        System.out.println("Removed first using removeFirst(): " + integerQueue);



    }
}
