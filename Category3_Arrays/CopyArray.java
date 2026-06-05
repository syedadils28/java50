import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] original = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) original[i] = sc.nextInt();
        int[] copy = Arrays.copyOf(original, n);
        System.out.println("Original : " + Arrays.toString(original));
        System.out.println("Copy     : " + Arrays.toString(copy));
        sc.close();
    }
}
