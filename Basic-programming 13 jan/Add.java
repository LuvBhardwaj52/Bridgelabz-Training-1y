import java.util.Scanner;
class Addition
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no. : ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no. : ");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("addition of two numbers = "+c);
	}
}