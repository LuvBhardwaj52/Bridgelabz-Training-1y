import java.util.Scanner;
class Forloop {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter rev countdown no. : ");
		int a=sc.nextInt();
		for(int i=a;i>=1;i--){
			System.out.println(i);
		}
	}
}