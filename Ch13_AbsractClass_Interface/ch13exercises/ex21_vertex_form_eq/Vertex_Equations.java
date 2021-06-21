package ch13exercises.ex21_vertex_form_eq;

import java.util.Scanner;

/** Chapter 13 - Exercise 21:
 * (Algebra: vertex form equations) The equation of a parabola can be expressed in either
 * standard form (y = ax2 + bx + c) or vertex form (y = a(x - h)2 + k).
 *
 * Write a program that prompts the user to enter a, b, and c as integers in standard form
 * and displays h and k in the vertex form.
 * h = -b/(2a),
 * k = c - b²/(4a)
 *
 * Here are some sample runs.
 * Enter a, b, c: 1 3 1
 * h is -3/2 k is -5/4
 *
 * Enter a, b, c: 2 3 4
 * h is -3/4 k is 23/8
 *
 * @author Khaled
 */

public class Vertex_Equations
{
    private final double a;
    private final double b;
    private final double c;

    public Vertex_Equations()
    {
        this(0, 0, 0);
    }

    public Vertex_Equations(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getVertexH()
    {
       //h = -b/(2a),
        return (-b / (2 * a));
    }

    public double getVertexK()
    {
        //k = c - b²/(4a)
        return (c - Math.pow(b, 2) / (4 * a));
    }

    @Override
    public String toString()
    {
        return "Polynomial form: " + a + "x^2 + " + b + "x + " + c + "\nh is " + getVertexH() + " k is " + getVertexK();
    }

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a, b, c: ");
        Vertex_Equations equations = new Vertex_Equations(kb.nextDouble(), kb.nextDouble(), kb.nextDouble());
        System.out.print(equations);
    }
}
