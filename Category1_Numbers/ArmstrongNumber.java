import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), original = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (n != 0) {
            int d = n % 10, power = 1;
            for (int i = 0; i < digits; i++) power *= d;
            sum += power;
            n /= 10;
        }
        System.out.println(original + (sum == original ? " is" : " is NOT") + " an Armstrong number.");
        sc.close();
    }
}
