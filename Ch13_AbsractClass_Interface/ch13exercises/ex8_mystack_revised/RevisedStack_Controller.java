package ch13exercises.ex8_mystack_revised;

import java.math.BigInteger;
import java.util.Date;

public class RevisedStack_Controller extends MyStackRevised
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        MyStackRevised myStackRevised1 = new MyStackRevised();
        System.out.println("list is empty: " + myStackRevised1.isEmpty());
        myStackRevised1.push("Hello World");
        myStackRevised1.push(new Date());

        MyStackRevised myStackRevised2 = (MyStackRevised) myStackRevised1.clone();
        System.out.println(myStackRevised2.toString());

        System.out.print("myStackRevised2.list == myStackRevised1.list: ");
        System.out.println(myStackRevised2.list == myStackRevised1.list);
        myStackRevised2.pop();
        myStackRevised1.push(new BigInteger("25152525215215215225"));
        System.out.println(myStackRevised1.list);
        System.out.println(myStackRevised2.list);
    }
}
