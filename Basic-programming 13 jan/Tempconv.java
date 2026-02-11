import java.util.Scanner;
class TemplateList
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in Celcius : ");
		int a=sc.nextInt();
		int f=(a*9/5)+32;
		System.out.println("Fahrenheit = "+f);
	}
}