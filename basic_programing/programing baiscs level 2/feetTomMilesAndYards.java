import java.util.Scanner;
class MilesYards
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter distance in feet : ");
		double d=sc.nextDouble();
		double y=d/3;
		double m=y/1760;
		System.out.println("The distance in yards is "+y+" while the distance in miles is "+m);
	}
}