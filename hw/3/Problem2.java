//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 3 Problem 2
import java.util.Scanner;
public class Problem2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numerator and a denominator of a fraction: ");
        int num = input.nextInt();
        int den = input.nextInt();
        if (num < den)
        {
            System.out.println(num + " / " + den + " is a proper fraction.");
        }
        if (num > den)
        {
            if ((num % den) == 0)
            {
                System.out.println(num + " / " + den + " is an improper fraction and it can be reduced to " + num/den + ".");
            }
            else 
            {
                System.out.println(num + " / " + den + " is an improper fraction and its mixed fraction is " + (num/den) + " + " + (num%den) + " / " + den);
            }

        }

    }
}
