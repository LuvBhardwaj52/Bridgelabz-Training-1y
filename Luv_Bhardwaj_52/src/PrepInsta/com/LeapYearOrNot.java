package PrepInsta.com;
import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year :- ");
        int a= sc.nextInt();
        if(a%4==0){
            System.out.println("The year "+a+" is a leap year.");
        }
        else {
            System.out.println("The year "+a+" is not a leap year.");
        }
    }
}
