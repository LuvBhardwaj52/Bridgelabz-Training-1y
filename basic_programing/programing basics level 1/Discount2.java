import java.util.Scanner;
class Discount2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Fee : ");
		double a=sc.nextInt();
		System.out.println("Discount Percent");
		double b=sc.nextInt();
		double c=a*b/100;
		double d=a-c;
		System.out.println("the discount amount is "+c+"and final discounted fee is"+d);
	}
}