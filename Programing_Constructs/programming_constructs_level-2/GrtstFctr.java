import java.util.Scanner;
class GreatestFactor
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :-");
		int a=sc.nextInt();
		int gtrf=1;
		for(int i=a-1;i>=1;i--){
			if(a%i==0){
				gtrf=i;
				break;
			}
		}
		System.out.println("Number : "+a+" ,Greatest Factor : "+gtrf);
	}
}
		