//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 9 Problem 3
import java.util.*;
public class Problem3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary string to convert into a decimal number: ");
        System.out.println("The decimal number is " + bin2Dec(input.nextLine()) + ".");
        System.out.println("Enter a normal string to throw the custom exception: ");
        System.out.println(bin2Dec(input.nextLine()));
    }
    public static int bin2Dec(String binary) throws BinaryFormatException 
    {
        if (!isBinary(binary)) 
        {
            throw new BinaryFormatException(binary + " is not a binary number.");
        }
        int power = 0;
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) 
        {

            if (binary.charAt(i) == '1') 
            {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static boolean isBinary(String binary) 
    {

        for (char ch : binary.toCharArray()) 
        {
            if (ch != '1' && ch != '0') return false;
        }
        return true;
    }

}

class BinaryFormatException extends IllegalArgumentException 
{

    BinaryFormatException(String s) 
    {
        super(s);
    }
}