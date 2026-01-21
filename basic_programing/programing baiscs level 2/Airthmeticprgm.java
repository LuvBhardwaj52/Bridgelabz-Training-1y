import java.util.Scanner;
class Aithmetic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no. : ");
		float x=sc.nextFloat();
		System.out.println("Enter 2nd no. : ");
		float y=sc.nextFloat();
		float a=x+y;
		float b=x-y;
		float c=x*y;
		float d=x/y;
		System.out.println("The add., subt., multipl. and divi. value of 2 numbers "+x+" and "+y+" is "+a+" , "+b+" , "+c+" and "+d );
	}
}