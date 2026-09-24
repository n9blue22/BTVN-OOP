import  java.util.Scanner;
public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
    int largest;
    if (numbers[0] > numbers[1] && numbers[0] > numbers[2]) {
        largest = numbers[0];
    } else if (numbers[1] > numbers[0] && numbers[1] > numbers[2]) {
        largest = numbers[1];
    } else {
        largest = numbers[2];
    }
    System.out.println("The largest number is: " + largest);
}
}