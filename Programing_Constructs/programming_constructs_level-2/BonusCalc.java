import java.util.Scanner;
class BonusCalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no.years of service :- ");
		int years=sc.nextInt();
		System.out.println("Enter the amount of salary :- ");
		int salary=sc.nextInt();
		if (years>5) {
			double bonus=salary*0.05;
			System.out.println("The amount of bonus is "+bonus);
		}
		else{
			System.out.println("You are not eligible to get bonus");
		}
	}
}