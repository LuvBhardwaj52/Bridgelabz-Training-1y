import java.util.Scanner;
class Revcountdown
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter rev countdown no. : ");
		int a=sc.nextInt();
		while (a>=1){
			System.out.println(a);
			a--;
		}
	}
}