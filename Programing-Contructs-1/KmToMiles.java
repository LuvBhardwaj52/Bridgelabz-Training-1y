import java.util.Scanner;
class Miles
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of Kilometer : ");
		int a=sc.nextInt();
		double b= a*0.621371;
		System.out.println("No. of Miles"+b);
	}
}