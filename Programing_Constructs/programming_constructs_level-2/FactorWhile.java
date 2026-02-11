import java.util.Scanner;
class FactorWhile
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :-");
		int n=sc.nextInt();
		if (n>0)
		{
			int i=1;
			while(n>=i){
				if(n%i==0){
					System.out.println(i);
				}
				i++;
			}
		}
		else {
			System.out.println("Enter a valid number :-");
		}
	}
}