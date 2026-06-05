import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        boolean[] isComposite = new boolean[n + 1];
        for (int i = 2; (long) i * i <= n; i++)
            if (!isComposite[i])
                for (int j = i * i; j <= n; j += i) isComposite[j] = true;
        System.out.print("Primes up to " + n + ": ");
        for (int i = 2; i <= n; i++) if (!isComposite[i]) System.out.print(i + " ");
        System.out.println();
        sc.close();
    }
}
