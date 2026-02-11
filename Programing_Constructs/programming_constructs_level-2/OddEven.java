import java.util.Scanner;
class OddEven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number :-");
		int a=sc.nextInt();
		if (a>0) {
			for (int i=1;i<=a;i++){
				if (i%2==0) {
					System.out.println(i+" is an even number");
				}
				else {
					System.out.println(i+" is an odd number");
				}
			}
		}
	}
}