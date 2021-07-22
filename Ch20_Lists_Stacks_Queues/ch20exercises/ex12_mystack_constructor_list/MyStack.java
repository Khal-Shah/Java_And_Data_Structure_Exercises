package ch20exercises.ex12_mystack_constructor_list;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/** Chapter 20 (Lists, Stacks, & Queues) - Exercise 11:
 *
 * (Create Stack from list) Define a class MyStack that extends Stack to be
 * able to have its constructor use a list of objects instead of pushing each object
 * individually.
 *
 * @author Khaled
 */

public class MyStack<E> extends Stack<E>
{
    private final Stack<E> stack;

    MyStack(List<E> list)
    {
        stack = new Stack<>();
//        Collections.reverse(list);
        stack.addAll(list);
    }

    @Override
    public String toString()
    {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }

    public static void main(String[] args)
    {
        MyStack<Integer> myList = new MyStack<>(Arrays.asList(11, 21, 27, 31, 33));
        System.out.println(myList);
    }
}
