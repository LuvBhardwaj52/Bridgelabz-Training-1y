import java.util.Scanner;
class Votes
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age[]=new int[10];
		System.out.println("Enter ages of the vote:- ");
		for(int i=0;i<10;i++)
		{
			age[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++){
			if(age[i]>0){
				if(age[i]>=18){
					System.out.println("The voter with the age "+age[i]+" can vote.");
				}
				else{
					System.out.println("The voter with the age "+age[i]+" cannot vote.");
				}
			}
			else{
				
				System.out.println("Enter a valid age");
			}
		}
	}
}
