//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 9 Problem 2
import java.util.*;
public class Problem2 
{
    public static int bin2Dec(String binaryString) throws NumberFormatException 
    {
		int decimal = 0;
		for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) 
            {
			if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
				throw new NumberFormatException("The string is not a binary string");
			decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
		    }
		return decimal;
	}
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary string to convert into a decimal number: ");
        System.out.println("The decimal number is " + bin2Dec(input.nextLine()) + ".");
    }
}