import java.util.Scanner;
class CmprBwForFrml {
	public static void main(String args [])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("-:Finding out the sum by using For loop of natural no. :-");
		System.out.println("Enter the natural no. :");
		int a=sc.nextInt();
		int sum=0;
		for (int i=a;i>=0;i--)
		{
			sum=sum+i;
			
		}
		System.out.println("The sum is : "+sum);
		System.out.println("-;Finding out the sum by using Formula of natural no. :-");
		int formula=a*(a+1)/2;
		System.out.println("The sum is "+formula);
		
	}
}	