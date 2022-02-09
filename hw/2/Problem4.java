//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 2 Problem 4
import java.util.Scanner;
public class Problem4 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int min = input.nextInt();
        System.out.println(min + " minutes is approximately " + (((min / 60) / 24) / 365) + " years and " + (((min / 60) / 24) % 365) + " days.");
    }
}
