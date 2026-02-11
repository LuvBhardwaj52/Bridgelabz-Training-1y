import java.util.Scanner;
class AreaOfTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height of Triangle in centimetre : ");
		double h=sc.nextDouble();
		System.out.println("Enter Base of Triangle centimetre : ");
		double b=sc.nextDouble();
		double area=0.5*b*h;
		System.out.println("The area of Triangle "+area);
	}
}