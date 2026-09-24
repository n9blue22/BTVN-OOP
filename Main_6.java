import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter number to search for: ");
        int x = scan.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;   // dừng ngay khi gặp lần đầu tiên
            }
        }

        System.out.println(index);
    }
}