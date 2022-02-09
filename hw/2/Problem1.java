//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 2 Problem 1
import java.util.Scanner;
public class Problem1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius of a circle to see its diameter and area: ");
        double rad = input.nextDouble();
        System.out.println("The diamter is " + (rad * 2) + ".");
        System.out.println("The area is " + (Math.PI * Math.pow(rad, 2)) + ".");
    }
    
}
