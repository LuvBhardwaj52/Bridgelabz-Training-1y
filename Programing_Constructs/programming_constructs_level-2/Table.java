import java.util.Scanner;
class Table
{
	public static void main(String arsg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for a table :- ");
		int number=sc.nextInt();
		for (int i=1;i<=10;i++){
			int t=number*i;
			System.out.println(number+" * "+i+" = "+t );
		}
	}
}