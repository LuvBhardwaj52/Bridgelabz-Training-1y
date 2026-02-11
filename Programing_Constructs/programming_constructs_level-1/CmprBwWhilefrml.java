import java.util.Scanner;
class WhileDfBwFormulae
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("-:Finding sum of natural numbers till the number that is given by user by using While Loop ");
		System.out.println("Enter the no. to get the sum of numbers : ");
		int a=sc.nextInt();
		int sum =0;
		while(a>=1){
			sum+=a;
			a--;
		}
		System.out.println("The sum is"+sum);
		System.out.println("-:Finding sum of Natural numbers till the number that is given by the user by using Formula");
		int b=sc.nextInt();
		int formula=b*(b+1)/2;
		System.out.println("The sum is we get by using the Formula"+formula);
		
	}
}