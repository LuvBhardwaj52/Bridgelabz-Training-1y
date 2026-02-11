package PrepInsta.com;
import java.util.Scanner;
public class SumOfNNtrlNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            sum+=i;
        }
        System.out.println("The sum of "+a+" natural numbers is = "+sum);
    }
}
