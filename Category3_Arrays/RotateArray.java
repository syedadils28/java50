import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter K (positions to rotate left): ");
        int k = sc.nextInt() % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) rotated[i] = arr[(i + k) % n];
        System.out.println("Rotated: " + Arrays.toString(rotated));
        sc.close();
    }
}
