import java.util.Scanner;
class AreaOfSqrFromPermetre
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Parameter of Square : ");
		int p=sc.nextInt();
		int s=p/4;
		System.out.println("The length of the side is "+s+" whose parameter is "+p);
	}
}