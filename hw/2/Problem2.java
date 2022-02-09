//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 2 Problem 2
import java.util.Scanner;
public class Problem2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ball travel time in seconds: ");
        double time = input.nextDouble();
        System.out.println("The height of the building is " + (9.8 * (Math.pow(time, 2) / 2)) + " meters.");
    }
}
