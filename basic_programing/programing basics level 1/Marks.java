import java.util.Scanner;
class Marks{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter marks of maths");
		int a=sc.nextInt();
		System.out.println("enter marks of physics");
		int b=sc.nextInt();
		System.out.println("enter marks of chemistry");
		int c=sc.nextInt();
		int avg=(a+b+c)/3;
		System.out.println("Sam's average mark in PCM is"+avg);
	}
}	