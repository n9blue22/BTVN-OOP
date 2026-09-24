import java.util.Scanner;
public class Main_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("The reversed string is: " + reversed);
    }
}