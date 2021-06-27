package ch19exercises.ex01_generic_stack_array;

/** Chapter 19 - Exercise 1:
 * (Revising Listing 19.1) Revise the GenericStack class in Listing 19.1 to implement it using an array rather
 * than an ArrayList. You should check the array size before adding a new element to the stack.
 *
 * If the array is full, create a new array that doubles the current array size and copy the elements from the
 * current array to the new array.
 *
 * @author Khaled
 */

public class GenericStack_Array<E>
{
    private E[] stack;
    private int index;


    public GenericStack_Array(int length)
    {
        stack = (E[]) new Object[length];
        index = 0;
    }

    public int getSize()
    {
        return index;
    }

    public boolean isEmpty()
    {
        return (stack.length == 0);
    }

    public E peek()
    {
        return stack[stack.length - 1];
    }

    public E pop()
    {
        return stack[--index];
    }

    public void push(E obj)
    {
        if(index < stack.length - 1)
        {
            stack[index++] = obj;
        }

        else
        {
            int newSize = stack.length * 2;
            E[] biggerStack = (E[]) new Object[newSize];
            System.arraycopy(stack, 0, biggerStack, 0, stack.length);

            this.stack = biggerStack;
            stack[index++] = obj;
        }
    }

    public void displayStackBottomToTop()   //from 0 until size-1 (top/last element)
    {
        for (int i = 0; i < this.index; i++)
        {
            System.out.print(stack[i] + ", ");
        }
        System.out.println();
    }

    public void displayStackTopToBottom()           //From last element to the bottom (first)
    {
        for (int i = index - 1; i >= 0; i--)
        {
            System.out.print(stack[i] + ", ");
        }
        System.out.println();
    }
}
