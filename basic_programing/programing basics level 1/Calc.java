import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first No. : ");
		double a=sc.nextDouble();
		System.out.println("Enter Second No. : ");
		double b=sc.nextDouble();
		double A=a+b;
		double B=a-b;
		double C=a*b;
		double D=a/b;
		System.out.println("The Addition, Subtraction, Multiplication and Division value of 2 numbers "+a+" and "+b+" is "+A+" , "+B+" , "+C+" and "+D);
	}
}
