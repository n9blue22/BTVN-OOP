import java.util.Scanner;
import java.util.ArrayList;

public class Main_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayA = new ArrayList<>();
        ArrayList<Integer> arrayB = new ArrayList<>();
        
        System.out.print("Enter number of elements for array A: ");
        int n = scan.nextInt();
        System.out.println("Enter intergers for array A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element A" + i + ": ");
            arrayA.add(scan.nextInt());
        }

        System.out.print("Enter number of elements for array B: ");
        int m = scan.nextInt();
        System.out.println("Enter intergers for array B:");
        for (int i = 0; i < m; i++) {
            System.out.print("Enter element B" + i + ": ");
            arrayB.add(scan.nextInt());
        }

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arrayA.size() && j < arrayB.size()) {
            if(arrayA.get(i) < arrayB.get(j)) {
                result.add(arrayA.get(i));
                i++;
            } else {
                result.add(arrayB.get(j));
                j++;
            }
        }
        while (i < arrayA.size()) {
            result.add(arrayA.get(i));
            i++;
        }
        while (j < arrayB.size()) {
            result.add(arrayB.get(j));
            j++;
        }
        System.out.println("Merged sorted array: " + result);
    }
}