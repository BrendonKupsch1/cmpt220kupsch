import java.util.Random;

// JA: THis is not what the problem asked
public class Problem1 
{
    public static void main(String[] args)
    {
        int counts[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 100; i++)
        {
            int rnd = new Random().nextInt(counts.length);
            System.out.println(rnd);
        }
    }
}
