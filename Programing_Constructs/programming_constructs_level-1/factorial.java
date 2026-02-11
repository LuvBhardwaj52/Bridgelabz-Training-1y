import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter an integer for getting a factorial : ");
		int a=sc.nextInt();
		int fact=1;
        int i=1;
		while (i<=a){
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+a+" is "+fact);
	}
}		