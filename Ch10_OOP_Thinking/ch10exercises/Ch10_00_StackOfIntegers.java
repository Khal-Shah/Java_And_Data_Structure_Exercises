package ch10exercises;

public class Ch10_00_StackOfIntegers
{

}

class StackOfIntegers
{
    private int[] elements;
    private int size;               //size counts # of elements in the stack
    static final int DEFAULT_CAPACITY = 16;

    StackOfIntegers()
    {
        this(DEFAULT_CAPACITY);      //Sends 16....conostructs a stack w/default cap of 16 (in push() we can increase it if needed)
    }

    //** Construct a stack with the specified capacity */
    StackOfIntegers(int capacity)
    {
        elements = new int[capacity];
    }

    //Returns true if the stack is empty.
    public boolean empty()
    {
        return (size == 0);
    }

    public int getSize()
    {
        return size;
    }

    //Returns the integer at the top of the stack without removing it from the stack.
    public int peek()
    {
        return elements[size - 1];
    }

    //Stores an integer into the top of the stack.
    public void push(int value)
    {
        //What if size > elements.length? We can increase default cap (double it each time)
        if(size >= elements.length)
        {
            int[] temp = new int[elements.length * 2];      //There will be nulls, that's why use while(!empty)
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    //Removes the integer at the top of the stack and returns it.
    public int pop()
    {
//        int topElement = peek();
//
//        int[] tempElements = new int[size - 1];
//        System.arraycopy(elements, 0, tempElements, 0, size - 1);
//        elements = tempElements;
//        size--;
//        return topElement;        //not necessary if we use size
        return elements[--size];
    }

    //Can also make a method to display element until size:
    public void displayIntegers()
    {
        for(int i = 0; i < this.size; i++)
        {
            System.out.print(elements[i] + ", ");
        }
    }
}