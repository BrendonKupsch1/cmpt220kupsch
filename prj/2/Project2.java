//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 2
//This program is designed to take 10 input numbers, and find the remainder if they are divided by 42
import java.util.Arrays;
import java.util.Scanner;
public class Project2 
{
  //main method
  public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      int[] intArray = new int[10]; 
      System.out.println("Enter 10 non-negative integers, each smaller than 1000: ");
      // loop for integer input into array
      for(int i = 0; i < intArray.length; i++)
      {
        intArray[i] = input.nextInt();
      }
      String Solution = Arrays.toString(modulo42(intArray));
      // JA: You had to give the count of distinct numbers
      System.out.println("Your numbers modolu 42 are " + Solution + ".");
    }
    // mod 42 calculation method 
    public static int[] modulo42(int arr[])
    {
      // loop to calculate mod 42 for each number in array 
      for (int i = 0; i < arr.length; i++)
      {
        arr[i] = arr[i] % 42;
      }
      return arr;
    }
}
