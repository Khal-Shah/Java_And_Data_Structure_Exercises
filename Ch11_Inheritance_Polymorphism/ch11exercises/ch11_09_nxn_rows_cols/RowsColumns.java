package ch11exercises.ch11_09_nxn_rows_cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
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
//    private int rows;
//    private int cols;
//
//
//    public RowsColumns()
//    {
//        this.rows = 0;
//    }

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
        System.out.println(transposeMatrix);
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

        System.out.println(rowCount + "\n" + colCount);
        System.out.println("The largest row index is " + rowCount.indexOf(Collections.max(rowCount)) +
                           "\nThe largest column index is " + colCount.indexOf(Collections.max(colCount)));

    }

}
