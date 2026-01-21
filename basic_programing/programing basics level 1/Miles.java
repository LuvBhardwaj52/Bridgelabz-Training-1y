import java.util.Scanner;
class Miles{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of km");
		int a=sc.nextInt();
		double miles=a*1.6;
		System.out.println("No. of miles"+miles);
	}
}