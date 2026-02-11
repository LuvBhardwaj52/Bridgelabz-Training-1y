package PrepInsta.com;
import java.util.Scanner;
public class PrimeNoGvnRnge {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number 1 :- ");
        int a=sc.nextInt();
        System.out.println("Enter number 2 :- ");
        int b=sc.nextInt();
        for (int num = a; num <= b; num++) {
            if (num <= 1) {
                continue;
            }

            int count = 0;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
