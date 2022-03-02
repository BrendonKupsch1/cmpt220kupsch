//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 5 Problem 1
import java.util.Scanner;
public class Problem1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the product of each digit: ");
        long userNumber = input.nextLong();
        System.out.println(multiplyDigits(userNumber));
    }
    public static int multiplyDigits(long n)
    {
        long product = 1;
        while (n != 0)
        {
            product = product * (n % 10);
            n = n/10;
        }
       return (int)product;
    }
}