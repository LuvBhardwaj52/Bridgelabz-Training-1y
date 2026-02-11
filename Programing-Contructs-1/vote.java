import java.util.Scanner;
class Relational
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a>=18){
			
			System.out.println("He is allowed vote");
		}
		else {
			System.out.println("He is not allowed to vote");
		}
	}
}