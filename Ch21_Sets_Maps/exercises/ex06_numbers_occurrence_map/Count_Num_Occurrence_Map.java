package exercises.ex06_numbers_occurrence_map;

import java.util.*;

/** Chapter 21 (Sets and Maps) - Exercise 6:
 *
 * (Count the occurrences of numbers entered) Write a program that reads an unspecified number of integers
 * and finds the one that has the most occurrences. The input ends when the input is 0.
 *
 * For example, if you entered 2 3 40 3 5 4 –3 3 3 2 0, the number 3 occurred most often.
 * If not one but several numbers have the most occurrences, all of them should be reported.
 * For example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.
 *
 * @author Khaled
 */

public class Count_Num_Occurrence_Map
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        Map<Integer, Integer> map = new TreeMap<>();
        System.out.print("Enter integers (input ends with 0): ");
        int userNum = kb.nextInt();
        List<Integer> countList = new ArrayList<>();

        do
        {
            countList.add(userNum);
            map.put(userNum, Collections.frequency(countList, userNum));
            userNum = kb.nextInt();
        }while(userNum != 0);

        System.out.println(map);
        int maxKey;
        int maxVal = Collections.max(map.values());


        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if(Objects.equals(entry.getValue(), maxVal))
            {
                maxKey = entry.getKey();
                System.out.println("The number occuring the most often is " + maxKey + ", which occurs "
                                   + entry.getValue() + " times.");
            }
        }

    }
}
