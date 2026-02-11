import java.util.Scanner;
class Sphere
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of Sphere");
		int a=sc.nextInt();
		int b=4/3;
		double c=3.14;
		double d=Math.pow(a,3);
		double e=b*c*d;
		double f=a*1.6;
		double g=Math.pow(f,3);
		double h=b*c*g;
		System.out.println("The volume of cubic kilometers is"+e+"and cubic miles is"+h);
	}
}