import java.util.Scanner;

//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 11 Problem 1
public class Problem1
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


    public static double m(int i, double weightLimit, double[] w)
    {
        if(i == 0)
        {
            return 0;
        }
        if(weightLimit == 0)
        {
            return 0;
        }
        if(w[i] > weightLimit)
        {
            return m(i - 1, weightLimit, w);
        }
        return Math.max(m(i - 1, weightLimit, w), w[i] + m(i, weightLimit - w[i], w));
    }
}
