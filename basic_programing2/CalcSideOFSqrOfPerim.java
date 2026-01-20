import java.util.Scanner;
class Side
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Perimeter of Square : ");
		int p=sc.nextInt();
		int a=p/4;
		System.out.println("The length of the side is "+a+" whosw perimeter is "+p);
	}
}