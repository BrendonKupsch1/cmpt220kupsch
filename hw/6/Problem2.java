import java.util.Scanner;

public class Problem2{
	private double[][] points;

	public Problem2(double[][] points)
  {
		this.points = points;
	}

	public static double[][] getPoints()
  {
		System.out.println("Enter amount of points");
		Scanner s = new Scanner(System.in);
		int amount = Integer.valueOf(s.nextLine());
		double[][] points = new double[amount][2];
		System.out.println("Enter " + amount + " pairs of coordinates (e.g. 1,1) on new lines each");
		for(int i = 0; i < amount; i++)
    {
			String coord = s.nextLine();
			points[i][0] = Double.valueOf(coord.split(",")[0]);
			points[i][1] = Double.valueOf(coord.split(",")[1]);
		}
		s.close();
		return points;
	}

	private double calcArea()
  {
		double sum = 0;
		int j = points.length - 1;

		for(int i = 0; i < points.length; i++)
    {
			sum += (points[j][0] + points[i][0]) * (points[j][1] - points[i][1]);
			j = i;
		}
		double result = Math.abs(sum / 2.0);
		return result;
	}

	public static void main(String[] args)
  {
		Problem2 calc = new Problem2(getPoints());
		System.out.println("Area: " + calc.calcArea() + " units");
	}
}