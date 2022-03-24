import java.util.Arrays;
import java.util.Scanner;
public class Problem4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[2][2];
        System.out.println("Enter a b c d for a matrix seperated by spaces: ");
        for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++)
                    matrix[i][j] = input.nextDouble();
        double testZero = ((matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]));
        if (testZero == 0)
        {
            System.out.println("These values can not be used because ad - bc can not equal zero.");
        }
        else
        {
            double[][] temp = inverse(matrix);
            String inverse = (Arrays.deepToString(temp));
            System.out.println("The inverse of the matrix is " + inverse + ".");
        }
    }
    public static double[][] inverse(double[][] A)
    {
        double det = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
        double temp = A[0][0];
        A[0][0] = A[1][1] / det;
        A[1][1] = temp / det;
        A[0][1] = - A[0][1] / det;
        A[1][0] = - A[1][0] / det;
        return(A);
    }
}
