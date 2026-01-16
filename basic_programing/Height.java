import java.util.Scanner;
class Height
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your height in centimeter : ");
		double a=sc.nextDouble();
		double b=a/2.54;
		double c=b/12;
		System.out.println("Your Height in cm is "+a+" while in feet is "+c+" and inches is"+b);
	}
}