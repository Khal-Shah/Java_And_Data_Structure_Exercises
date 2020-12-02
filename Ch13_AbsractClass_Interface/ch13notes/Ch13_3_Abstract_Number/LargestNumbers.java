package ch13notes.Ch13_3_Abstract_Number;

import java.math.*;
import java.util.ArrayList;
import java.util.Collections;

public class LargestNumbers
{
    public static void main(String[] args)
    {
        //Create an ArrayList that holds Number (abstract class of Int, BigInt, etc)
        ArrayList<Number> list = new ArrayList<>();

        //add numbers to it...Since we didn't explicitly use Int or Double (using superclass
        //that contains them. By using superclass Number, we can add any types of numbers.
        //Notice we're adding objects (ArrayList is of Number class)
        list.add(45);                                               //Int
        list.add(3545.53);                                         //Double
        list.add(new BigInteger("35353536646479463634634"));  //BigInt
        list.add(new BigDecimal("2.0909090989091343433344343")); //BigDecimal

        //Collections.max(list); //this exists in the subclassest (if ArrayList
        //was only of Integer type). Or is it because Collections /= Number?
        System.out.println("The largest number is: " + getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list)
    {
        if (list.isEmpty() || list.size() == 0 || list == null)
        {
            return null;
        }

        Number number = list.get(0); //number obj (from Class) so can take any val

        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).doubleValue() > number.doubleValue())
            {
                number = list.get(i); //if next is bigger, set it to number obj
            }
        }
        return number;      //returns number obj containing just one val
    }
}
