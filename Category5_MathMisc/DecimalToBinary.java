import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        if (n == 0) { System.out.println("Binary: 0"); return; }
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        StringBuilder sb = new StringBuilder();
        while (n > 0) { sb.insert(0, n % 2); n /= 2; }
        if (sign == -1) sb.insert(0, '-');
        System.out.println("Binary: " + sb);
        sc.close();
    }
}
