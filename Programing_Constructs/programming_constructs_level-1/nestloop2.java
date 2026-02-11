import java.util.Scanner;
class Nestloop2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		double total=0.0;
		System.out.println("Enter no. until you give (0 and negative no.1)");
		double num=sc.nextDouble();
		while(true) {
			total+=num;
			System.out.println("Enter another no. : ");
			num=sc.nextDouble();
			if (num<=0.0){
				break;
			}
		}
		System.out.println("The total sum is "+total);
	}
}
			
			