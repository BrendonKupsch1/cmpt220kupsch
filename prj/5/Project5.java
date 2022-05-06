//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 5 Main

import java.util.Scanner;

public class Project5 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // settings complex numbers from user input 
        System.out.println("Enter the first complex number: ");
        Complex firstComplex = new Complex(input.nextDouble(), input.nextDouble());
        System.out.println("Enter the second complex number: ");
        Complex secondComplex = new Complex(input.nextDouble(), input.nextDouble());

        // running complex numbers into methods to output solutions
        System.out.println(firstComplex + " + " + secondComplex + " = " + firstComplex.add(secondComplex));
        System.out.println(firstComplex + " - " + secondComplex + " = " + firstComplex.subtract(secondComplex));
        System.out.println(firstComplex + " * " + secondComplex + " = " + firstComplex.multiply(secondComplex));
        System.out.println(firstComplex + " / " + secondComplex + " = " + firstComplex.divide(secondComplex));
        System.out.println("|" + firstComplex + "| = " + firstComplex.abs());
    }
}