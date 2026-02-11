import java.util.Scanner;
class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		double p=sc.nextDouble();
		System.out.println("Enter Rate of Interest : ");
		double r=sc.nextDouble();
		System.out.println("Enter Tenure : ");
		double t=sc.nextDouble();
		double SI=(p*r*t)/100;
		System.out.println("Calculated Simple Interest"+SI);
	}
}		