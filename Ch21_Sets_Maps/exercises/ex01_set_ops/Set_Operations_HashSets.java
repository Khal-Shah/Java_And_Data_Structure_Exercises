package exercises.ex01_set_ops;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/** Chapter 21 (Sets and Maps) - Exercise 1:
 *
 * (Perform set operations on hash sets) Given two stacks of textbooks of the following subjects
 * {“Chemistry”, “Mathematics”, “Biology”, “English”} and {“Biology”, “English”, “Geography”, “Physics”},
 * respectively, find the subjects that are (1) only present in the first stack;
 * (2) only present in the second stack; (3) present in both stacks.
 *
 * (You may clone the sets to preserve the original sets from being changed by set methods.)
 *
 * @author Khaled
 */

public class Set_Operations_HashSets
{
    public static void main(String[] args)
    {
        //Create hashset for first set of subjects
        HashSet<String> subject1 = new HashSet<>();
        Collections.addAll(subject1, "Chemistry", "Mathematics", "Biology", "English");

        //Create hashset for second set of subjects
        HashSet<String> subject2 = new HashSet<>();
        Collections.addAll(subject2, "Biology", "English", "Geography", "Physics");

        //create clones
        Set<String> subject1Original = (Set<String>) subject1.clone();
        Set<String> subject2Original = (Set<String>) subject2.clone();

        System.out.print("1) The subjects that are only present in the first stack are: ");
        subject1.removeAll(subject2);
        System.out.println(subject1);


        System.out.print("\n2) The subjects that are only present in the second stack are: ");
        subject2.removeAll(subject1Original);
        System.out.println(subject2);

        System.out.print("\n3) The subjects that are present in both stacks are: ");
        subject1Original.retainAll(subject2Original);
        System.out.println(subject1Original);

    }
}
