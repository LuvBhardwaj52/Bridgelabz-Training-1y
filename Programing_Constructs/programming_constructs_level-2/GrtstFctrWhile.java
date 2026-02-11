import java.util.Scanner;
class GreatestFactor
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :-");
		int a=sc.nextInt();
		if(a>0 && a<100){
			int counter=a-1;
			while(counter>1){
				if(a%counter==0){

					break;
					
				}
				counter--;
			}
		}
		System.out.println(counter);
		else 
			System.out.println("Enter a valid number ");
		
	}
}