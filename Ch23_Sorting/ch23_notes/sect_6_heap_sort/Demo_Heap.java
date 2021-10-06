package ch23_notes.sect_6_heap_sort;

import java.util.ArrayList;
import java.util.List;

public class Demo_Heap<E extends Comparable<E>>
{
    //We can use a List for our Heap implementation
    List<E> list = new ArrayList<>();

    public Demo_Heap()
    {
        //empty constructor
    }

    public Demo_Heap(E[] objects)
    {
        //add via add() method
        for(int i = 0; i < objects.length; i++)
        {
            add(objects[i]);
        }
    }

    public int getSize()
    {
        return this.list.size();
    }

    public boolean isEmpty()
    {
        return this.list.isEmpty();
    }

    public void add(E newObject)
    {
        /*
            Recall the algorithm of adding a node:
            Add to end of heap
            Let last node be the current node
            While(currentNode > parent)
            Swap current with parent
         */
        //append to heap
        list.add(newObject);
        int currentIndex = list.size() - 1;

        //recall parent: list[(i - 1) / 2]
        while(currentIndex > 0)
        {
            int parentIndex = (currentIndex - 1) / 2;
            //swap if current object is greater than its parent
            if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0)
            {
                E currentNode = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, currentNode);
            }

            else
            {
                break;  //tree is a heap now
            }
            currentIndex = parentIndex;
        }
    }

    public E remove()
    {
        //Recall remove algo:
        /**
         * Replace root with the last node
         * Let root (after moving last element there) be current node
         * While(current node has children and it is smaller than one of the children)
         * 	Swap current node with the bigger (check both sides) children
         * Let the current node be one level down (where you just swapped)
         */
        if(list.size() == 0)
        {
            return null;
        }
        E removedObject = list.get(0);          //The object we want to remove (root)
        list.set(0, list.get(list.size() - 1));     //move the last element and place it at root
        list.remove(list.size() - 1);               //Remove the last element (we moved it to root)

        int currentIndex = 0;

        while(currentIndex < list.size())
        {
            int leftChildIndex  = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            //to ensure we're within the list/tree
            if(leftChildIndex >= list.size())
            {
                break;      //The tree is a heap
            }

            int maxIndex = leftChildIndex;

            if(rightChildIndex < list.size())
            {
                //Comparing the two children elements and getting the larger index out of them
                if(list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0)
                {
                  maxIndex = rightChildIndex;
                }
            }

            //comparing parent to the bigger of the two children
            if(list.get(currentIndex).compareTo(list.get(maxIndex)) < 0)
            {
                //child is larger so swap with root
                E temp = list.get(maxIndex);                    //the bigger child value
                list.set(maxIndex, list.get(currentIndex));     //where the child is bigger, place the root
                list.set(currentIndex, temp);               //at the position of parent, place the bigger child
                currentIndex = maxIndex;                //Now we've moved on to the index where we just placed the bigger value
            }
            else
            {
                break;
            }
        }

        return removedObject;
    }

}
