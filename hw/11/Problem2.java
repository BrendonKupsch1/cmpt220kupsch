//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 11 Problem 2

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int numOfItems = sc.nextInt();

        System.out.println("Enter the weights for each item: ");
        double[] w = new double[numOfItems];
        for(int j = 0; j < numOfItems; j++)
        {
            w[j] = sc.nextDouble();
        }
        
        System.out.println("Enter the weight limit for the bag: ");
        double weightLimit = sc.nextDouble();
        
        System.out.println("The maximum weight of items placed in the bag is " + m(numOfItems - 1, weightLimit, w));
        
    }
    public static ArrayList<Integer> m(int i, double weightLimit, double[] w){
        ArrayList<Integer> ReturnArray = new ArrayList<Integer>();
        return m_helper(i, weightLimit, w, ReturnArray);
      }
      
      public static ArrayList<Integer> m_helper(int i, double weightLimit, double[] w, ArrayList<Integer> ReturnArray){
         if(i == 0)
              {
                  return ReturnArray;
              }
              if(weightLimit == 0)
              {
                  return ReturnArray;
              }
              if(w[i] > weightLimit)
              {
                  return m(i - 1, weightLimit, w, ReturnArray);
              }
      
              ArrayList<Integer> copy = new ArrayList<Integer>(ReturnArray);
              copy.add(w[i]);
      
              return Math.max(m(i - 1, weightLimit, w, ReturnArray), m(i, weightLimit - w[i], w, copy));
      }
      
      public static ArrayList<Integer> ArrayListMax (ArrayList<Integer> x, ArrayList<Integer> y){
        int s1=0, s2=0;
        for(auto i : x){
          s1 +=i;
        }
        for(auto i : x){
          s2 +=i;
        }
      
        if(s1 > s2) { return s1; }
        return s2;
      }
}