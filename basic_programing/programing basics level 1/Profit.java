import java.util.Scanner;
class Profit{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a cost price");
		int a=sc.nextInt();
		System.out.println("enter a selling prize");
		int b=sc.nextInt();
		int p=b-a;
		int Profit=(p/a)*100;
		System.out.println("The Cost price is "+a"and selling price is "+b);
		System.out.println("Your profit is="+p);
	}
}