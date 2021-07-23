package ch20notes.sect11_evaluating_expression;

import java.util.Scanner;
import java.util.Stack;

public class Expression_Stack
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Read expression
        System.out.print("Enter a valid expression: ");
        String expression = kb.nextLine();

        //operand and operator stacks
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        expression = insertBlanks(expression);

        String[] tokens = expression.split(" ");

        //Phase 1: scan tokens
        for(String token: tokens)
        {
            if(token.length() == 0)
            {
                continue;
            }

            // + or - scanned
            else if((token.charAt(0) == '+') || (token.charAt(0) == '-'))
            {
                //process all + - * / at the top of the operator stack
                while(!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-'
                || operatorStack.peek() == '*' || operatorStack.peek() == '/'))
                {
                    processAnOperator(operandStack, operatorStack);
                }

                // Push the + or - operator into the operator stack
                operatorStack.push(token.charAt(0));
            }

            // * or / scanned
            else if((token.charAt(0) == '*') || token.charAt(0) == '/')
            {
                // Process all *, / in the top of the operator stack
                while(!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/'))
                {
                    processAnOperator(operandStack, operatorStack);
                }

                // Push the * or / operator into the operator stack
                operatorStack.push(token.charAt(0));
            }

            //( scanned
            else if(token.charAt(0) == '(')
            {
                //push ( to stack
                operatorStack.push(token.charAt(0));
            }

            //) scanned, process all operators in stack until seeing (
            else if(token.charAt(0) == ')')
            {
                while(operatorStack.peek() != '(')
                {
                    processAnOperator(operandStack, operatorStack);
                }
                //pop ( from stack
                operatorStack.pop();
            }

            //An operand scanned, push operand to stack
            else
            {
                operandStack.push(Integer.valueOf(token));
            }
        }

        //phase 2: Process all the remaining operators in the stack
        while(!operatorStack.isEmpty())
        {
            processAnOperator(operandStack, operatorStack);
        }

        //show the result
        System.out.println(operandStack.pop());

    }

    /** Process one operator: Take an operator from operatorStack and
     *  apply it on the operands in the operandStack */
    public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack)
    {
        char operator = operatorStack.pop();
        int operand1 = operandStack.pop();
        int operand2 = operandStack.pop();

        switch(operator)
        {
            case '+' -> operandStack.push(operand2 + operand1);
            case '-' -> operandStack.push(operand2 - operand1);
            case '*' -> operandStack.push(operand2 * operand1);
            case '/' -> operandStack.push(operand2 / operand1);
        }
    }

    public static String insertBlanks(String s)
    {
        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '−' ||
                s.charAt(i) == '*' || s.charAt(i) == '/')
                    result += " " + s.charAt(i) + " ";

            else
                result += s.charAt(i);
        }
        return result;
    }
}
