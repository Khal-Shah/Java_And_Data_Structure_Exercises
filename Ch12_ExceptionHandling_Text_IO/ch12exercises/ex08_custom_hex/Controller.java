package ch12exercises.ex08_custom_hex;

import java.util.Scanner;

public class Controller
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws HexFormatException
    {
        boolean isValid = false;
        String hexVal = "";
        int decimalVal = -1;

        do
        {
            try
            {
                System.out.print("Enter hex value: ");
                hexVal = kb.next();
                decimalVal = HexFormatException.hex2Dec(hexVal);
                isValid = true;
            }
            catch(HexFormatException ex)
            {
                System.out.println(ex.getMessage());
            }
        }while(!isValid);

        System.out.println("Hex = " + hexVal + "\nDecimal = " + decimalVal);
    }
}
