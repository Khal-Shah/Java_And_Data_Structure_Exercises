package ch11notes.newnotes.arraylist;

import java.util.ArrayList;

public class ArrayList_Practice
{
    public static void main(String[] args)
    {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("a");
        //System.out.println(letters.get(0));
        letters.add("Montreal");
        letters.add(1, "Random");       //previous 1 gets pushed up 1 (So Montreal is at index 2 now)
        //If we removed the index^, it'd add to the next empty position (Random would be at index 2)

        //System.out.println(letters.get(2));     //Montreal

        //System.out.println(letters.size());         //3

        //difference between .add(index, E) and .set(index, E);
        //Below program will crash cuz we can't set to a new Index position, it has to be existing (2 would work)
//        letters.set(3, "Success");
//        System.out.println(letters.get(3));

        //With add, we can indeed add it to the next index
        letters.add(3, "Success");
        //System.out.println(letters.get(3));

        for(String e: letters)
        {
            //System.out.println(e);
        }

        ArrayList<Integer> nums = getNums();
        nums.add(11);
        for(Integer e: nums)
        {
            System.out.println(e);
        }
    }

    static ArrayList<Integer> getNums()
    {

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < 10; i++)
        {
            nums.add(i);
        }
        nums.add(10);
        return nums;
    }
}
