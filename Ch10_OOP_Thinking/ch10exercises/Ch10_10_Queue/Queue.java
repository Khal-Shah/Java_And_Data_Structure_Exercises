package ch10exercises.Ch10_10_Queue;

public class Queue      //FIFO
{
    //An int[] data field named elements that stores the int values in the queue.
    //A data field named size that stores the number of elements in the queue.

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAP = 8;

    //A constructor that creates a Queue object with default capacity 8.
    public Queue()
    {
        this(DEFAULT_CAP);
    }

    public Queue(int size)
    {
        elements = new int[size];
    }

    //The method getSize() that returns the size of the queue.
    public int getSize()
    {
        return size;
    }

    //The method empty() that returns true if the queue is empty.
    public boolean isEmpty()
    {
        return (size == 0);
    }

    //The method enqueue(int v) that adds v into the queue.
    public void enqueue(int value)
    {
        if (size >= elements.length)
        {
            int[] moreE = new int[elements.length * 2];
            System.arraycopy(elements, 0, moreE, 0, elements.length);
            elements = moreE;
        }
        elements[size++] = value;
    }

    //■ The method dequeue() that removes and returns the element from the queue.
    public int dequeue()
    {
        int out = elements[0];
        int[] lessE = new int[elements.length];
        System.arraycopy(elements, 1, lessE, 0, size);
        elements = lessE;
        --size;
        return out;
    }

}
