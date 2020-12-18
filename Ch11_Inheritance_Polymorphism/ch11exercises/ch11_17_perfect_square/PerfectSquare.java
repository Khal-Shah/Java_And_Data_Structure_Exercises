package ch11exercises.ch11_17_perfect_square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** Chapter 11 - Exercise 17:
 * (Algebra: perfect square) Write a program that prompts the user to enter
 * an integer m and find the smallest integer n such that m * n is a perfect
 * square.
 * (Hint: Store all smallest factors of m into an array list. n is the product
 * of the factors that appear an odd number of times in the array list.
 * For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list.
 * 2 and 5 appear an odd number of times in the array list. So, n is 10.)
 *
 * Here are sample runs:
 * Enter an integer m: 1500
 * The smallest number n for m * n to be a perfect square is 15 m * n is 22500
 *
 * Enter an integer m: 63 The smallest number n for m * n to be a perfect
 * square is 7 m * n is 441
 *
 * Recall a perfect square: squaring a whole number (1, 4, 9, 16, 25...etc)
 *
 * @author khaled Shah
 */

public class PerfectSquare
{
    static Scanner kb = new Scanner(System.in);

    private int m;
    private ArrayList<Integer> mFactors;

    public PerfectSquare(int m)
    {
        this.m = m;
    }

    public void setM(int m)
    {
        this.m = m;
    }

    public ArrayList<Integer> getMFactors()
    {
        this.mFactors = new ArrayList<>();
        int m = this.m;

        for(int i = 2; i <= m;)       //only for(int init; terminate;) is required. increment can be done inside
        {
            if(isFactor(m, i))
            {
                mFactors.add(i);
                m /= i;
            }

            else
            {
                i++;
            }
        }

        return mFactors;
    }

    public ArrayList<Integer> getReducedMFactors()
    {
        ArrayList<Integer> reducedMFactors = new ArrayList<>();         //empty arrayList
        Integer[] mFactorArray = new Integer[getMFactors().size()];     //empty array
        getMFactors().toArray(mFactorArray);                            //fill empty array with mFactor vals
        reducedMFactors.addAll(Arrays.asList(mFactorArray));            //fill empty arrayList with the array containing mFactor vals^

        for(Integer E: getMFactors())
        {
            if(isEvenOccurrence(E))
            {
                reducedMFactors.remove(E);
            }
        }

        return reducedMFactors;
    }

    public boolean isEvenOccurrence(Integer E)
    {
        int occurrence = 0;
        ArrayList<Integer> list = getMFactors();

        for(int i = 0; i < list.size(); i++)
        {
            if(E.equals(list.get(i)))
            {
                occurrence++;
            }

        }

        return (occurrence % 2 == 0);
    }

    public boolean isFactor(int m, int i)
    {
        return (m % i == 0);
    }

    public int getN()
    {
        int n = 1;

        //Further reduce it to only unique/distinct vals
        ArrayList<Integer> uniqueReduced = new ArrayList<>();

        for(int i = 0; i < getReducedMFactors().size(); i++)
        {
            if(!uniqueReduced.contains(getReducedMFactors().get(i)))
            {
                uniqueReduced.add(getReducedMFactors().get(i));
            }
        }

        for(Integer E: uniqueReduced)
        {
            System.out.printf(E + "\n");
            n *= E;
        }

        return n;
    }

    public int getPerfectSquare()
    {
        return this.m * getN();
    }

    @Override
    public String toString()
    {
        return "PerfectSquare{" +
                "m=" + m +
                ", mFactors=" + getMFactors() +
                ", reducedFactors = " + getReducedMFactors() +
                ",\nThe smallest number n for m * n to be a perfect " +
                "square is n = " + getN() + "\nm * n (perfect square) is = " + getPerfectSquare() +
                '}';
    }

    public static void main(String[] args)
    {
        System.out.printf("Enter an integer m: ");
        int m = kb.nextInt();

        PerfectSquare perfectSquare = new PerfectSquare(m);
        System.out.println(perfectSquare.toString());
        kb.close();
    }

}
