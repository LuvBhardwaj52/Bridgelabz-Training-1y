import java.util.Scanner;
class Nestedloop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double total=0.0;
		System.out.println("Enter numbers until you give 0(to it for stop the loop) ");
		double num=sc.nextDouble();
		while(num!=0.0) {
			total=total+num;
			System.out.println("Enter another no. : ");
			num = sc.nextDouble();
		}
		System.out.println("The total sum is"+total);
	}
}