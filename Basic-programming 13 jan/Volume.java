import java.util.Scanner;
class Volume 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radius of Cyclinder : ");
		double r=sc.nextDouble();
		System.out.println("Enter height of cyclinder : ");
		double h=sc.nextDouble();
		double pi=3.14;
		double v=pi*Math.pow(r,2)*h;
		System.out.println("Volume of cyclinder : "+v);
	}
}