package ch20_notes.sect_6_comparator;

import ch12exercises.ex04_argument.Loan;

import java.util.*;

public class LambdaComparatorDemo
{
    public static void main(String[] args)
    {
        String[] cities = {"NYC", "Ottawa", "Tampa Bay", "Montreal", "Rome"};
        System.out.print("Before sorting: ");
        for (String city : cities)
        {
            System.out.print(city + "\t");
        }

        //Lambda comparator:
        Arrays.sort(cities, (String::compareToIgnoreCase));
        /*
        Above is a method reference shortcut of the lambda
        Arrays.sort(cities, ((c1, c2) -> c1.compareToIgnoreCase(c2)));
         */

        System.out.print("\nAfter sorting by their alphabet order: ");
        for (String city : cities)
        {
            System.out.print(city + "\t");
        }

        System.out.println("\n========================================================================\n");


        //Now with Lists:
        List<String> langs = new LinkedList<>();
        Collections.addAll(langs, "Java", "C#", "C++", "Python", "R");

        System.out.println("Before sorting: " + langs);
        langs.sort(Comparator.comparing(String::length));
//        langs.sort((lang1, lang2) ->  lang1.length() - lang2.length());
        System.out.println("After sorting by length of each string: " + langs);

        langs.sort(String::compareToIgnoreCase);
        System.out.println("After sorting by alphabet: " + langs);

        System.out.println("\n========================================================================\n");
        //Example with Loan class
        Loan[] loans = {new Loan(2.5, 4, 2500),
                new Loan(4.2, 3, 8700),
                new Loan(1.9, 6, 15200),
                new Loan(5, 10, 1000)};

        System.out.print("Before sorting, the loan amounts are: ");
        for (Loan o : loans)
        {
            System.out.print(o.getLoanAmount() + "\t");
        }
        Arrays.sort(loans, Comparator.comparing(Loan::getLoanAmount).reversed());
        System.out.print("\nSorted by most loan amount: ");
        for (Loan o : loans)
        {
            System.out.print(o.getLoanAmount() + "\t");
        }
    }


}
