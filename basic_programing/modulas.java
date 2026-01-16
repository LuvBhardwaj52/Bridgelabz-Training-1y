import java.util.Scanner;
class Modulas
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of pens : ");
		int a=sc.nextInt();
		System.out.println("Enter no. of Students : ");
		int b=sc.nextInt();
		int c=a/b;
		int d=a%b;
		System.out.println("The Pen per Student is "+c+" and the remaning pensthat are not distributed is "+d);
	}
}