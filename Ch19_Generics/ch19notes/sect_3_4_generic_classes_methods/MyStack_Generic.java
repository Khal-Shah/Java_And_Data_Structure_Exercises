package ch19notes.sect_3_4_generic_classes_methods;

import org.junit.Test;

import java.util.ArrayList;

//Custom Stack class to generalize the element type with a generic type.
public class MyStack_Generic<E> implements Cloneable
{
    private ArrayList<E> list;

    public MyStack_Generic()
    {
        this.list = new ArrayList<>();
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        MyStack_Generic myStackGeneric = (MyStack_Generic) super.clone();
        myStackGeneric.list = (ArrayList) list.clone();
        return myStackGeneric;
    }

    public int getSize()
    {
        return list.size();
    }

    public E peek()
    {
        return list.get(list.size() - 1);
    }

    //returns and removes top element
    public E pop()
    {
        E o  = this.peek();
        list.remove(list.size() - 1);
        return o;
    }

    public void push(E o)
    {
        list.add(o);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    @Override
    public String toString()
    {
        return "stack: " + list.toString();
    }

    @Test
    public void testGenericStack() throws CloneNotSupportedException
    {
//        MyStack_Generic stack1 = new MyStack_Generic();
        //^must specify a concrete type (String, Int, etc) when using the generic class to create
        //an object or using the class/interface to declare a reference variable
        MyStack_Generic<String> stack1 = new MyStack_Generic<>();
        stack1.push("Ethereum");
        stack1.push("ELP-1559");
        stack1.push("Berlin fork");

        MyStack_Generic<String> clonedStack1 = (MyStack_Generic<String>) stack1.clone();

        System.out.println("stack1: " + stack1);
        System.out.println("clonedStack1: " + clonedStack1);

        clonedStack1.pop();
        System.out.println("stack1: " +stack1);
        System.out.println("clonedStack1: " + clonedStack1);

        MyStack_Generic<Integer> stack2 = new MyStack_Generic<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        //if we try to push String into stack2 which has a concrete type of Integer, we'll get compiler error
//        stack2.push("red");
    }
}
