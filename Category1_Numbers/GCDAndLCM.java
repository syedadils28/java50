import java.util.Scanner;

public class GCDAndLCM {
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), g = gcd(a, b);
        System.out.println("GCD = " + g);
        System.out.println("LCM = " + ((long) a / g * b));
        sc.close();
    }
}
