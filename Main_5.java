import java.util.Scanner;
public class Main_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
            for(int j = 1; j <= 10; j++) {
                System.out.print(n + " x " + j + " = " + (n*j) + " ");
            }
    }
}