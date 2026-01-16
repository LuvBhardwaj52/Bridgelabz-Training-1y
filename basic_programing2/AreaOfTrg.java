import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height Of Triangle : ");
		double h=sc.nextDouble();
		System.out.println("Enter Base Of Triangle : ");
		double b=sc.nextDouble();
		double area1=0.5*b*h;
		double c=h/2.54;
		double d=b/2.54;
		double area2=0.5*c*d;
		System.out.println("The Area of the triangle in sq inches is "+area2+" and sq cm is "+area1);
	}
}