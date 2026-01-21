import java.util.Scanner;
class Pwrcalc {
	public static void main(String argsp[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First No. : ");
		double a=sc.nextDouble();
		System.out.println("Enter Second No. : ");
		double b=sc.nextDouble();
		double c=Math.pow(a,b);
		System.out.println("Result : "+c);
	}
}		