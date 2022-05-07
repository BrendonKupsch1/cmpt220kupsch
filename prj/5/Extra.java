//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 5 Extra Credit

import java.util.Scanner;

public class Extra 
{
    public static void main(String[] args)
    {
        // user inputs z1, z2, and z3 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values for x1, x1 = ");
        Complex z1 = new Complex(input.nextDouble(), input.nextDouble());
        System.out.println("Enter the values for x2, y2 = ");
        Complex z2 = new Complex(input.nextDouble(), input.nextDouble());
        System.out.println("Enter the values for x3, y3 = ");
        Complex z3 = new Complex(input.nextDouble(), input.nextDouble());
        System.out.println(Complex.area(z1, z2, z3));
    }
}