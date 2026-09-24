import java.util.Scanner;
public class Main_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The Sum Of Digits Is: " + sum);
    }
}