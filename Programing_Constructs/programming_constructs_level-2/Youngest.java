import java.util.Scanner;
class Yougest{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Amar Data");
		System.out.println("Enter the age :- ");
		int a1=sc.nextInt();
		System.out.println("Enter the height :- ");
		double h1=sc.nextDouble();
		System.out.println("Akbar Data");
		System.out.println("Enter the age :- ");
		int a2=sc.nextInt();
		System.out.println("Enter the height :- ");
		double h2=sc.nextDouble();
		System.out.println("Anthony Data");
		System.out.println("Enter the age :- ");
		int a3=sc.nextInt();
		System.out.println("Enter the height :- ");
		double h3=sc.nextDouble();
		if (a1<a2 && a1<a3){
			System.out.println("Amar is youngest among them");
		}
		else if (a2<a1 && a2<a3){
			System.out.println("Akbar is youmgest among them");
		}
		else {
			System.out.println("Anthony is youngest among them");
		}
		if (h1>h2 &&h1>h3)
		{
			System.out.println("Amar is tallest among them");
		}
		else if (h2>h1 && h2>h3) {
			System.out.println("Akbar is tallest among them");
		}
		else{
			System.out.println("Anthony is tallest among them");
		}
	}
}

