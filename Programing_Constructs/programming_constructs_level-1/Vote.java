import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a>=18){
			
			System.out.println("The person's age is "+a+" and can vote");
		}
		else {
			System.out.println("The person's age is "+a+" and cannot vote");
		}
	}
}