package ch20exercises.ex10_subject_set_ops;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *  Chapter 20 (Lists, Stacks, & Queues) - Exercise 10:
 *
 * (Perform set operations on priority queues) Given two stacks of textbooks
 * of the following subjects {“Chemistry”, “Mathematics”, “Biology”,
 * “English”} and {“Biology”, “English”, “Geography”, “Physics”},
 * find the subjects that are (1) only present in the first stack; (2) only present in
 * the second stack; (3) present in both stacks.
 *
 * @author Khaled
 */

public class PQ_Subject_Sets
{
    public static void main(String[] args)
    {
        //Create Stack1
        PriorityQueue<String> stack1 = new PriorityQueue<>();
        Collections.addAll(stack1, "Chemistry", "Mathematics", "Biology", "English");

        //Create Stack2
        PriorityQueue<String> stack2 = new PriorityQueue<>();
        Collections.addAll(stack2, "Physics", "Geography", "Biology", "English");

        //Result of set operations stack
        PriorityQueue<String> result = new PriorityQueue<>(stack1);

        //only present in the first:
        result.removeAll(stack2);
        System.out.println("(1) only present in the first stack: " + result);

        //only present in the second:
        result.clear();
        result.addAll(stack2);
        result.removeAll(stack1);
        System.out.println("(2) only present in the second stack: " + result);

        //Present in both
        result = new PriorityQueue<>(stack1);
        result.retainAll(stack2);
        System.out.println("(3) present in both stacks: " + result);

    }
}
