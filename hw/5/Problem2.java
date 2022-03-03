//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 5 Problem 2
import java.util.Scanner;
public class Problem2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert it to binary: ");
        int decimal = input.nextInt();
        System.out.println(decimalToBinary(decimal));
        input.close();
    }
    // take % 2, if 0 then even, take % of 2 and divide by 2 till you run out of numbers 
    public static String decimalToBinary(int value)
    {
        String s = "";
        while (value > 0)
        {
            s = ((value % 2) == 0 ? "0" : "1") +s;
            value = value / 2;
        }
        return s;
    }
}

