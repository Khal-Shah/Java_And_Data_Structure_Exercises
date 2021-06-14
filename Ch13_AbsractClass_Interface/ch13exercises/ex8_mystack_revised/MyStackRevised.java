package ch13exercises.ex8_mystack_revised;
import java.util.ArrayList;

/** Chapter 13 - Exercise 8:
 * (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform a deep copy of the list field.
 *
 * @author Khaled
 */

public class MyStackRevised implements Cloneable
{
    protected ArrayList<Object> list;

    public MyStackRevised()
    {
        list = new ArrayList<>();       //init ArrayList
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        MyStackRevised newStack = (MyStackRevised) super.clone();
        newStack.list = (ArrayList<Object>) list.clone();

        return newStack;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException
//    {
//        return super.clone();
//    }

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
        return "MyStackRevised{" +
                "list=" + list +
                '}';
    }
}
