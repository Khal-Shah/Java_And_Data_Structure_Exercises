package ch19exercises.ex07_generic_binary_search;

import org.junit.Test;
import java.util.Arrays;

public class Test_BinarySearch
{
    @Test
    public void testBinarySearch()
    {
        Double[] numbers = {90.3, -27.2, 111.0, 39.9, 101.1, -24.1, 10.0, 81.5};
        double keyNumber = 111.0;

        System.out.println(keyNumber + " is at index " + BinarySearch_Generic.binarySearch(numbers, keyNumber));
        System.out.println("After sorting, the list is: " + Arrays.toString(numbers));

        String[] names = {"James", "Kate", "Charlie", "Claire", "Hurley", "Juliette", "Daniel",
                          "Sayeed"};
        String keyName = "Hurley";

        System.out.println("\n" + keyName + " is at index " + BinarySearch_Generic.binarySearch(names,
                                                                                          keyName));
        System.out.println("After sorting, the list is: " + Arrays.toString(names));
    }
}
