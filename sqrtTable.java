public class sqrtTable 
{
    public static void main(String[] args)
    {
        int count = 0;
        System.out.printf("%-10s%-10s", "Number", "SquareRoot");
        while(count < 21)
        {
            System.out.println();
            System.out.printf("%-10s%-10s", count, Math.round(Math.pow(count, .5)*Math.pow(10,4))/Math.pow(10,4));
            count+= 2;
        }
    }
}
