import java.util.Scanner;

public class Main_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double EPS = 1e-9;

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        while (n >= 10000) {
            System.out.println("Vui long nhap n duoi 10000");
            System.out.print("Enter a number: ");
            n = scan.nextInt();
        }

        double[] time = new double[n];
        for (int i = 0; i < n; i++) {
            time[i] = scan.nextDouble();
        }
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();

        double totaldamage = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (time[i] - time[j] <= z + EPS) {
                    count++;
                }
            }
            totaldamage += x + y * count;
        }
        if(totaldamage == Math.floor(totaldamage)){
            System.out.println((int)totaldamage);
        } else {
        System.out.println(totaldamage);
        }
    }
}