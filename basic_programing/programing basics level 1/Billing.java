import java.util.Scanner;
class Billing 
{
	public static void main (String args [])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Unit price : ");
		double a=sc.nextDouble();
		System.out.println("Enter Quantity : ");
		int b=sc.nextInt();
		double c=a*b;
		System.out.println("The total purchase is "+c+" if the Quantity "+b+" and unit price is "+a);
	}
}