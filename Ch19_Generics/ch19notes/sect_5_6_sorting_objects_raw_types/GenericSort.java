package ch19notes.sect_5_6_sorting_objects_raw_types;

public class GenericSort
{
    public static void main(String[] args)
    {
        //Integer array
        Integer[] intArray = {2, 4, 3};

        // Create a Double array
        Double[] doubleArray = {3.4, 1.3, -22.1};

        // Create a Character array
        Character[] charArray = {'a', 'J', 'r'};

        // Create a String array
        String[] stringArray = {"Tom", "Susan", "Kim"};

        //sort the arrays using our generic sorting method
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        // Display the sorted arrays
        System.out.print("Sorted Integer objects: ");
        printList(intArray);

        System.out.print("Sorted Double objects: ");
        printList(doubleArray);

        System.out.print("Sorted Character objects: ");
        printList(charArray);

        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }

    //objects are instances of comparable interface
    public static <E extends Comparable<E>> void sort(E[] list)
    {
        E currentMin;
        int currentMinIndex;

        //use compareTo method to compare each object
        for(int i = 0; i < list.length - 1; i++)
        {
            currentMin = list[i];
            currentMinIndex = i;

            for(int j = i + 1; j < list.length; j++)
            {
                //if current element is greater than any of the e to the right, make the right e current e
                if(currentMin.compareTo(list[j]) > 0)
                {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i)
            {
                list[currentMinIndex] = list[i];    //put bigger e where we found current e
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list)
    {
        for(Object obj: list)
        {
            System.out.printf("%10s", obj);
        }
        System.out.println();
    }
}
