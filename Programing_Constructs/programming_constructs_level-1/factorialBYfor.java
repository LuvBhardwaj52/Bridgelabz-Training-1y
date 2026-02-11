import java.util.Scanner;
class FactorialByForLoop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number for a factorial");
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++){
			fact*=i;
		}
		System.out.println("The factorial of "+a+" is "+fact);
	}
}