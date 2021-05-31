package ch11exercises.ch11_09_nxn_rows_cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/** Chapter 11 - Exercise 9:
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
 * prints the matrix, and finds the rows and columns with the most 1s. (Hint: Use two ArrayLists to
 * store the row and column indices with the most 1s.)
 * Here is a sample run of the program:
 * Enter the array size n: 4
 * The random array is
 * 0011
 * 0011
 * 1101
 * 1010
 * The largest row index: 2
 * The largest column index: 2, 3
 *
 * @author Khaled Shah
 */

public class RowsColumns
{

    public static void main(String[] args)
    {
        int row = 4;
        int col = 4;
        ArrayList rowCount = new ArrayList();
        ArrayList colCount = new ArrayList();
        String matrix = "";
        int val;

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                val = (int) (0 + Math.random() * 2);
                matrix += val;
            }
            matrix += "\n";
        }

        System.out.println(matrix);
        int i = 0;
        int index = 0;
        int count = 0;

        String col1 = "";
        String col2 = "";
        String col3 = "";
        String col4 = "";
        for(int j = 0; j < matrix.length(); j++)
        {
            if(matrix.charAt(j) == '\n')
            {
                continue;
            }

            col1 += matrix.charAt(j++);
            col2 += matrix.charAt(j++);
            col3 += matrix.charAt(j++);
            col4 += matrix.charAt(j++);
        }

        String transposeMatrix = col1 + "\n" + col2 + "\n" + col3 + "\n" + col4 + "\n";
        int transposeCount = 0;
        //System.out.println(transposeMatrix);
        do
        {
            if(matrix.charAt(i) == '1')
            {
                count++;
            }

            else if(matrix.charAt(i) == '\n')
            {
                rowCount.add(count);
                //index++;
                count = 0;
            }

            if(transposeMatrix.charAt(i) == '1')
            {
                transposeCount++;
            }

            else if(transposeMatrix.charAt(i) == '\n')
            {
                colCount.add(transposeCount);
                transposeCount = 0;
            }
            i++;
        } while((i < matrix.length()) && (i < transposeMatrix.length()));

        //System.out.println(rowCount + "\n" + colCount);
        System.out.println("The largest row index is " + rowCount.indexOf(Collections.max(rowCount)) +
                           "\nThe largest column index is " + colCount.indexOf(Collections.max(colCount)));

    }

}

/* Another way of doing this exercise:
System.out.print("Enter the array size n: ");
        int size = kb.nextInt();

        ArrayList<Integer> rows = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                rows.add(random.nextInt(2));
            }
        }

        printMatrix(rows, size);

        ArrayList<Integer> rowCount = new ArrayList<>();
        ArrayList<Integer> colCount = new ArrayList<>();
        int index = 0;
        int count = 0;

        for(int i = 0; i <= rows.size(); i++)
        {
            if(i % 4 == 0 && i != 0)
            {
                rowCount.add(index, count);
                index++;
                count = 0;
            }

            if(i == 16)
            {
                break;
            }
            count += ((rows.get(i) == 1)? 1 : 0);
        }

        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        int col4 = 0;

        for(int i = 0; i < rows.size(); i++)
        {
            index = i % 4;

            switch(index)
            {
                case 0 -> {
                    if(rows.get(i) == 1)
                    {
                        col1++;
                    }
                }
                case 1 -> {
                    if(rows.get(i) == 1)
                    {
                        col2++;
                    }
                }
                case 2 -> {
                    if(rows.get(i) == 1)
                    {
                        col3++;
                    }
                }
                case 3 -> {
                    if(rows.get(i) == 1)
                    {
                        col4++;
                    }
                }
            }

        }

        colCount.add(0, col1);
        colCount.add(1, col2);
        colCount.add(2, col3);
        colCount.add(3, col4);

        System.out.println("\nThe largest row index is " + rowCount.indexOf(Collections.max(rowCount)));
        System.out.println("The largest col index is " + colCount.indexOf(Collections.max(colCount)));

    private static void printMatrix(ArrayList<Integer> rows, int sz)
    {
        int count = 0;

        for(Integer e: rows)
        {
            count++;
            System.out.print(e + "\t" + ((count % sz == 0)? "\n" : ""));
        }
    }
 */
