import java.util.Scanner;
class checknumber
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no.1 : ");
		int a=sc.nextInt();
		System.out.println("Enter no.2 : ");
		int b=sc.nextInt();
		System.out.println("Enter no.3 : ");
		int c=sc.nextInt();
		if (a < b && a < c) {
            System.out.println("a is smallest");
        } else if (b < a && b < c) {
            System.out.println("b is smallest");
        } else {
            System.out.println("c is smallest");

		}
	}
}