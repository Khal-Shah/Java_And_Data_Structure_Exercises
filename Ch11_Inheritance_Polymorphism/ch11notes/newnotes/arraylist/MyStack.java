package ch11notes.newnotes.arraylist;

import java.util.ArrayList;
import java.util.Date;

/**
 * -list: ArrayList<Object>
 * +isEmpty(): boolean
 * +getSize(): int
 * +peek(): Object
 * +pop(): Object
 * +push(o: Object): void
 */

//We've made a MyStack Class before, this one implements it using ArrayList instead of Arrays
public class MyStack
{
    private ArrayList<Object> list;

    public MyStack()
    {
        list = new ArrayList<>();       //init ArrayList
    }

    public boolean isEmpty()
    {
        return (list.size() == 0);
    }

    public int getSize()
    {
        return list.size();
    }

    //returns but doesn't remove the last obj/element
    public Object peek()
    {
        return (list.get(list.size() - 1));
    }

    //returns and removes the last obj/element
    public Object pop()
    {
        Object o = peek();
        list.remove((list.size() - 1));
        return o;
    }

    public void push(Object o)
    {
        list.add(o);
    }

    @Override
    public String toString()
    {
        return //super.toString() +
               "\nMyStack{" +
               "list=" + list +
               '}';
    }

    public static void main(String[] args)
    {
        Object date = new Date();
        Object msg = "Hello World";

        Object myStack = new MyStack();
        ((MyStack) myStack).push(date);
        ((MyStack) myStack).push(msg);

        System.out.println(myStack);

        System.out.println("Popping MyStack...");
        ((MyStack) myStack).pop();

        System.out.println(myStack);
        System.out.println(((MyStack) myStack).getSize());

    }
}
