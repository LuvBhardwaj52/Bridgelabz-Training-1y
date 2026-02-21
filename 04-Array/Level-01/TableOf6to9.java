import java.util.Scanner;
class TableOf6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int[] result = new int[4];
        
        for(int i = 6; i <= 9; i++) {
            int pos = i - 6;
            result[pos] = number * i;
            System.out.println(number + " * " + i + " = " + result[pos]);
        }
        sc.close();
    }
}