package ch20notes.sect_9_10_vectors_queues;

import java.util.Collections;
import java.util.Stack;

public class Vector_Stack_Demo
{
    public static void main(String[] args)
    {
        //Stack extends Vector
        Stack<String> cryptos = new Stack<>();
        cryptos.add("Bitcoin");
        cryptos.push("Ethereum");
        cryptos.add("LTO Network");

        System.out.println(cryptos);

        System.out.println("Peek: " + cryptos.peek() + "\nPop: " + cryptos.pop());

        //Last e will be removed because of .pop()
        System.out.println(cryptos);

        Collections.shuffle(cryptos);
        System.out.println("After shuffling using Collections: " + cryptos);

        //.clear() is a Collection method
        cryptos.clear();
        System.out.println("Cleared: " + cryptos);

    }
}
