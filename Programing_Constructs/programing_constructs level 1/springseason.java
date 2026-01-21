import java.util.Scanner;
class Springseason
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number : ");
		int a=sc.nextInt();
		System.out.println("Enter month number : ");
		int b=sc.nextInt();
		if ((b==3 && a>=20 && a<=31)||
		    (b==4 && a>=1 && a<=30) ||
			(b==5 && a>=1 && a<=31) ||
			(b==6 && a>=1 && a<=30))
			{
				System.out.println("It's a Spring Season");
			}
		else {
			System.out.println("Not a Spring Season");
		}
	}
}