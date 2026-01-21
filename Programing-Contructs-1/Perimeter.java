import java.util.Scanner;
class Perimeter{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle : ");
		double l=sc.nextDouble();
		System.out.println("Enter width of rectangle : ");
		double w=sc.nextDouble();
		double P=2*(l+w);
		System.out.println("Perimeter of rectangle : "+P);
	}
}