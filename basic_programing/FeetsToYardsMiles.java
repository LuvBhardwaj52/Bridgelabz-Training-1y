import java.util.Scanner;
class FeetsToYardsMiles
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Distance in Feets ");
		int a=sc.nextInt();
		double b=a/3;
		double c=a/1760;
		System.out.println("Your distance in yard is "+b+" while in miles "+c);
	}
}