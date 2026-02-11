package PrepInsta.com;
import java.util.Scanner;
public class GrtstOfThreeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Entwr number 1 :- ");
        int a= sc.nextInt();
        System.out.println("Enter number 2 :- ");
        int b=sc.nextInt();
        System.out.println("Enter number 3 :- ");
        int c=sc.nextInt();
        if (a>b && a>c){
            System.out.println(a+" is greatest among all three numbers");
        } else if (b>a && b>c) {
            System.out.println(b+" is greatest among all three numbers");
        }
        else {
            System.out.println(c+" is greatest among all three numbers");
        }
    }
}
