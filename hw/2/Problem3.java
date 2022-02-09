//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 2 Problem 3
import java.util.Scanner;
public class Problem3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the friction force in Newtons: ");
        double fric = input.nextDouble();
        System.out.println("Enter the object's mass in kg: ");
        double mass = input.nextDouble();
        System.out.println("Enter the object's acceleration in m/s^2: ");
        double acc = input.nextDouble();
        System.out.println("The coeffcient for friction is " + ((fric - (mass * acc)) / (mass * 9.8)) + ".");
    }
}
