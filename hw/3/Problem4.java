//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 3 Problem 4
public class Problem4 
{
    public static void main(String[] args)
    {
        double point1 = (Math.random() * 10 - 5);
        double yRange = (Math.sqrt(25)- point1 * point1);
        double point2 = (Math.random() * 2 * yRange - yRange);
        System.out.println("The point is ("+point1+", "+point2+")");
        double distance = (Math.pow(((Math.pow(point1, 2)) + (Math.pow(point2, 2))), 0.5));
        System.out.println("and its distance to the center is "+distance);
    }
}
