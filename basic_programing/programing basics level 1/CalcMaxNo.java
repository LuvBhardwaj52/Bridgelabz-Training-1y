import java.util.Scanner;
class CalcMaxNoOfHandsahkes
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Students : ");
		int n=sc.nextInt();
		int x=(n*(n-1))/2;
		System.out.println("The no. possible handshakes are : "+x);
	}
}