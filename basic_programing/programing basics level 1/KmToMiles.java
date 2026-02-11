import java.util.Scanner;
class KmToMiles
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Kilometer");
		double a=sc.nextDouble();
		double b=a*0.65;
		System.out.println("The total miles is "+b+" mile for the given "+a+" km");
	}
}