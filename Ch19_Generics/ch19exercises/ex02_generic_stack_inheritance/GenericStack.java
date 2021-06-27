package ch19exercises.ex02_generic_stack_inheritance;
import java.util.ArrayList;

/** Chapter 19 - Exercise 2:
 * (Implement GenericStack using inheritance) In Listing 19.1, GenericStack is implemented using composition.
 * Define a new stack class that extends ArrayList.
 *
 * Draw the UML diagram for the classes and then implement GenericStack.
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 *
 * @author Khaled
 */

public class GenericStack<E> extends ArrayList<E>
{

    public int getSize()
    {
        //ArrayList's size method
        return super.size();
    }

    public Object peek()
    {
        //get
        return get(size() - 1);
    }

    //returns and removes top element
    public Object pop()
    {
        Object o  = this.peek();
        //ArrayList's remove
        super.remove(o);
        return o;
    }

    public void push(E o)
    {
        super.add(o);
    }

    public boolean isEmpty()
    {
        return super.isEmpty();
    }

    public int search(Object o )
    {
        return super.indexOf(o);
    }

    @Override
    public String toString()
    {
        return "stack: " + super.toString();
    }
}
