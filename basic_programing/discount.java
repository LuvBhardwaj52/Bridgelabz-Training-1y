import java.util.Scanner;
class Discount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fees : ");
		int a=sc.nextInt();
		int b=a/10;
		int c=a-b;
		System.out.println("The discount amount is "+b+"and final discounted fees is"+c);
	}
}