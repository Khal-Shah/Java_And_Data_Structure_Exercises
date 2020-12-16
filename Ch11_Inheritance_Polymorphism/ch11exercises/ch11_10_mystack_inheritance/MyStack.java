package ch11exercises.ch11_10_mystack_inheritance;

import java.util.ArrayList;

/** Chapter 11 - Exercise 10:
 * (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented using composition.
 * Define a new stack class that extends ArrayList.
 * Draw the UML diagram for the classes and then implement MyStack.
 *
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 *
 * @author Khaled Shah
 */

public class MyStack extends ArrayList
{
    ArrayList list;

    public MyStack()
    {
        this.list = new ArrayList();
    }

    public MyStack(ArrayList list)
    {
        this.list = new ArrayList();
        this.list = list;
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

    public void reverseListItems()
    {
        //String[] reversedItems = new String[getSize()];

        for(int i = 0; i < list.size(); i++)
        {
            this.list.set(i, getReverseString(list.get(i)));
        }

    }

    public String getReverseString(Object str)
    {
        String string = (String) str;
        String reversedString = "";
        for(int i = (string.length() - 1); i >= 0; i--)
        {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }

    @Override
    public String toString()
    {
        return "MyStack{" +
               "list=" + list +
               '}';
    }
}
