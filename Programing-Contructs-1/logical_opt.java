import java.util.Scanner;
class logical
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean a=sc.nextBoolean();
		boolean b=sc.nextBoolean();
		if(a&&b){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
			