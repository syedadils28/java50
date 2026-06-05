import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] b = new int[m], merged = new int[n + m];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        System.arraycopy(a, 0, merged, 0, n);
        System.arraycopy(b, 0, merged, n, m);
        System.out.println("Merged array: " + Arrays.toString(merged));
        sc.close();
    }
}
