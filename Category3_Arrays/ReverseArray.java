import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0, j = n - 1; i < j; i++, j--) { int t = arr[i]; arr[i] = arr[j]; arr[j] = t; }
        System.out.println("Reversed: " + Arrays.toString(arr));
        sc.close();
    }
}
