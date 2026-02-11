package PrepInsta.com;
import java.util.Scanner;
public class SumOfNoInGvnRnge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 :- ");
        int a= sc.nextInt();
        System.out.println("Enter number 2 :- ");
        int b= sc.nextInt();
        int sum=0;
        for (int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println("The sum of numbers "+a+" from "+b+" is = "+sum );
    }
}
