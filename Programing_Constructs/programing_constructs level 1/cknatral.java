import java.util.Scanner;
class checkNaturalnumber
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no.1 : ");
		int a=sc.nextInt();
		int sum=a*(a+1)/2;
		if(a>0) {
			System.out.println("The sum of "+a+" natural no. is "+sum);
		}
		else{
			System.out.println("The number "+a+" is not a natural number");
	    }
	}
}