package ch19notes.sect_7_8_widcard_erasure;

import ch19notes.sect_3_4_generic_classes_methods.MyStack_Generic;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class WildcardDemo
{
    public static double max(MyStack_Generic <? extends Number> stack)
    {
        double max = stack.pop().doubleValue();

        while(!stack.isEmpty())
        {
            double value = stack.pop().doubleValue();

            if(value > max)
            {
                max = value;
            }
        }
        return max;
    }

    @Test
    public void testMax()
    {
        MyStack_Generic<Integer> intStack = new MyStack_Generic<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-3);

//        System.out.println("The max number is " + max(intStack));
        //compile error (before using bounded Wildcard) cuz intStack is not an instance of MyStack_Generic<Number>

        print(intStack);

        ArrayList<Number> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3);

        //<?> or <? extends Object>: unbounded wildcard
//        ArrayList<?> integerNums = numbers;

        //<? extends T>: bounded wildcard (denotes T or subtype of T)
//        ArrayList<? extends Number> integerNums = numbers;
        //denotes Number or supbtype of Number

        //<? super T>: lower-bound wildcard (denotes T or supertype of T)
        ArrayList<? super Number> integerNums = numbers;
        //denotes Number of supertype of Number


        System.out.println(integerNums);
    }

    public static void print(MyStack_Generic<?> stack)
    {
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
