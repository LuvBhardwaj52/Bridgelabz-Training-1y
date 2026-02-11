package PrepInsta.com;
import java.util.Scanner;
public class GrtstOfTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 :- ");
        int a= sc.nextInt();
        System.out.println("Enter number 2 :- ");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("The greatest of two numbers is :- "+a);
        }
        else {
            System.out.println("The greatest of two numbers is :- "+b);
        }
    }
}
